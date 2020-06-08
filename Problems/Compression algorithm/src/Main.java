import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.next();
        String[] sequenceArr = sequence.split("");
        String prevChar = sequenceArr[0];
        StringBuilder output = new StringBuilder();
        int count = 0;

        for (String str : sequenceArr) {

            if (prevChar.equals(str)) {
                count++;
            } else {
                output.append(prevChar).append(count);
                count = 1;
            }
            prevChar = str;
        }
        output.append(prevChar).append(count);
        System.out.println(output.toString());
    }
}