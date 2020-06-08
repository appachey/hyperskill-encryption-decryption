import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 0; i < 1000; i++) {
            double result = a * Math.pow(i, 3) + b * i * i + c * i + d;
            if (result == 0) {
                System.out.println(i);
            }
        }
    }
}