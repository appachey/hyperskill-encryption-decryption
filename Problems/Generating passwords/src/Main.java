import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperCaseLet = scanner.nextInt();
        int lowerCaseLet = scanner.nextInt();
        int digits = scanner.nextInt();
        int passLength = scanner.nextInt();
        int remainsChar = passLength - (upperCaseLet + lowerCaseLet + digits);
        Random rand = new Random();
        StringBuilder pass = new StringBuilder();

        char prevChar = '#';

        for (int i = 0; i < upperCaseLet; i++) {
            char c = (char) (rand.nextInt(25) + 65);
            if (c == prevChar) {
                while (c == prevChar) {
                    c = (char) (rand.nextInt(25) + 65);
                }
            }
            pass.append(c);
            prevChar = c;
        }

        for (int i = 0; i < lowerCaseLet; i++) {
            char c = (char) (rand.nextInt(25) + 97);
            if (c == prevChar) {
                while (c == prevChar) {
                    c = (char) (rand.nextInt(25) + 97);
                }
            }
            pass.append(c);
            prevChar = c;
        }

        for (int i = 0; i < digits; i++) {
            char c = (char) (rand.nextInt(10) + 48);
            if (c == prevChar) {
                while (c == prevChar) {
                    c = (char) (rand.nextInt(10) + 48);
                }
            }
            pass.append(c);
            prevChar = c;
        }

        for (int i = 0; i < remainsChar; i++) {
            char c = (char) (rand.nextInt(25) + 65);
            if (c == prevChar) {
                while (c == prevChar) {
                    c = (char) (rand.nextInt(25) + 65);
                }
            }
            pass.append(c);
            prevChar = c;
        }
        System.out.println(pass);
    }
}