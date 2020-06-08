package encryptdecrypt;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Decryptor {

    private CryptoMethod method;

    public void setMethod(CryptoMethod method) {
        this.method = method;
    }

    public void decrypt(String message, int key, String inputFileName, String outputFileName) throws IOException {
        StringBuilder decOutput = new StringBuilder();
        if (message.isEmpty()) {
            String data = new String(Files.readAllBytes(Paths.get(inputFileName)));
            decOutput.append(this.method.decrypt(data, key));
        } else {
            decOutput.append(this.method.decrypt(message, key));
        }

        if (outputFileName.isEmpty()) {
            System.out.println(decOutput.toString());
        } else {
            try (PrintWriter writer = new PrintWriter(outputFileName)) {
                writer.print(decOutput);
            } catch (IOException e) {
                System.out.printf("An error occur while writing %s", e.getMessage());
            }
        }
    }

}
