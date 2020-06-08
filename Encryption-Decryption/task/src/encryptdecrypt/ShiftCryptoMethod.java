package encryptdecrypt;

public class ShiftCryptoMethod implements CryptoMethod {
    @Override
    public String encrypt(String message, int key) {
        char[] massageChars = message.toCharArray();
        for (int i = 0; i < massageChars.length; i++) {
            if (Character.isAlphabetic(massageChars[i]) && Character.isLowerCase(massageChars[i])) {
                massageChars[i] = (char) ((massageChars[i] + key - 97) % 26 + 97);
            }
            if (Character.isAlphabetic(massageChars[i]) && Character.isUpperCase(massageChars[i])) {
                massageChars[i] = (char) ((massageChars[i] + key - 65) % 26 + 65);
            }
        }
        return new String(massageChars);
    }

    @Override
    public String decrypt(String message, int key) {
        char[] massageChars = message.toCharArray();
        for (int i = 0; i < massageChars.length; i++) {
            if (Character.isAlphabetic(massageChars[i]) && Character.isLowerCase(massageChars[i])) {
                massageChars[i] = (char) ((massageChars[i] + 26 - key - 97) % 26 + 97);
            }
            if (Character.isAlphabetic(massageChars[i]) && Character.isUpperCase(massageChars[i])) {
                massageChars[i] = (char) ((massageChars[i] + 26 - key - 65) % 26 + 65);
            }
        }
        return new String(massageChars);
    }

}
