import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next().toLowerCase();
        int countGC = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'c' || message.charAt(i) == 'g') {
                countGC++;
            }
        }
        double result = (double) countGC / message.length() * 100;
        System.out.println(result);
    }
}