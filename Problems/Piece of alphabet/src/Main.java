import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] characters = scanner.next().toCharArray();
        char prevChar = characters[0];
        boolean result = true;
        for (char character : characters) {
            if (prevChar == character || character - prevChar == 1) {
                prevChar = character;
            } else {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}