package encryptdecrypt;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        int key = 0;
        String data = "";
        String in = "";
        String out = "";
        String alg = "";

        for (int i = 0; i < args.length; i++) {
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            }
            if ("-key".equals(args[i])) {
                key = Integer.parseInt(args[i + 1]);
            }
            if ("-data".equals(args[i])) {
                data = args[i + 1];
            }
            if ("-in".equals(args[i])) {
                in = args[i + 1];
            }
            if ("-out".equals(args[i])) {
                out = args[i + 1];
            }
            if ("-alg".equals(args[i])) {
                alg = args[i + 1];
            }
        }

        switch (mode) {
            case "enc":
                Encryptor encryptor = new Encryptor();
                if (alg.toLowerCase().equals("unicode")) {
                    encryptor.setMethod(new UnicodeCryptoMethod());
                    try {
                        encryptor.ecnrypt(data, key, in, out);
                    } catch (IOException ex) {
                        System.out.println("Encryption error occured!");
                        ex.printStackTrace();
                    }
                }
                if (alg.toLowerCase().equals("shift")) {
                    encryptor.setMethod(new ShiftCryptoMethod());
                    try {
                        encryptor.ecnrypt(data, key, in, out);
                    } catch (IOException ex) {
                        System.out.println("Encryption error occured!");
                        ex.printStackTrace();
                    }
                }
                break;
            case "dec":
                Decryptor decryptor = new Decryptor();
                if (alg.toLowerCase().equals("unicode")) {
                    decryptor.setMethod(new UnicodeCryptoMethod());
                    try {
                        decryptor.decrypt(data, key, in, out);
                    } catch (IOException ex) {
                        System.out.println("Encryption error occured!");
                        ex.printStackTrace();
                    }
                }
                if (alg.toLowerCase().equals("shift")) {
                    decryptor.setMethod(new ShiftCryptoMethod());
                    try {
                        decryptor.decrypt(data, key, in, out);
                    } catch (IOException ex) {
                        System.out.println("Encryption error occured!");
                        ex.printStackTrace();
                    }
                }
                break;
        }
    }
}
