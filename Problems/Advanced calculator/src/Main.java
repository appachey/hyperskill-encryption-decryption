/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int[] numbers = toIntArray(args);
        switch (operator) {
            case "MAX":
                System.out.println(max(numbers));
                break;
            case "MIN":
                System.out.println(min(numbers));
                break;
            case "SUM":
                System.out.println(sum(numbers));
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    public static int[] toIntArray(String[] numbers) {
        int[] result = new int[numbers.length - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(numbers[i + 1]);
        }
        return result;
    }

    public static int max(int[] numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            result = number > result ? number : result;
        }
        return result;
    }

    public static int min(int[] numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            result = number < result ? number : result;
        }
        return result;
    }

    public static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}