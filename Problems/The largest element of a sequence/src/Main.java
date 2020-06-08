import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int x = scanner.nextInt();
        while (x != 0) {
            max = max > x ? max : x;
            x = scanner.nextInt();
        }
        System.out.println(max);
    }
}