package encryptdecrypt;

import java.io.IOException;

public interface CryptoMethod {

    String encrypt(String message, int key);

    String decrypt(String message, int key);

}
