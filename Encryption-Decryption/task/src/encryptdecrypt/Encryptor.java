package encryptdecrypt;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Encryptor {

    private CryptoMethod method;

    public void setMethod(CryptoMethod method) {
        this.method = method;
    }

    public void ecnrypt(String message, int key, String inputFileName, String outputFileName) throws IOException {
        StringBuilder encOutput = new StringBuilder();
        if (message.isEmpty()) {
            String data = new String(Files.readAllBytes(Paths.get(inputFileName)));
            encOutput.append(this.method.encrypt(data, key));
        } else {
            encOutput.append(this.method.encrypt(message, key));
        }

        if (outputFileName.isEmpty()) {
            System.out.println(encOutput.toString());
        } else {
            try (PrintWriter writer = new PrintWriter(outputFileName)) {
                writer.print(encOutput);
            } catch (IOException e) {
                System.out.printf("An error occur while writing %s", e.getMessage());
            }
        }
    }

}
