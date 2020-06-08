package encryptdecrypt;

public class UnicodeCryptoMethod implements CryptoMethod {
    @Override
    public String encrypt(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int c = message.charAt(i) + key;
            encryptedMessage.append((char) c);
        }
        return encryptedMessage.toString();
    }
    @Override
    public String decrypt(String message, int key) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int c = message.charAt(i) - key;
            decryptedMessage.append((char) c);
        }
        return decryptedMessage.toString();
    }

}
