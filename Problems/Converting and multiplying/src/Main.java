import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<String> inputStrList = new ArrayList<>();
        while (!"0".equals(line)) {
            inputStrList.add(line);
            line = scanner.nextLine();
        }
        for (String str : inputStrList) {
            try {
                System.out.println(Integer.parseInt(str) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + str);
            }
        }
    }
}