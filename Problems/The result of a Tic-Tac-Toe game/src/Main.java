class Main {
    public static void main(String[] args) {
        String[][] ticTacToe = {{"O", "X", "X"}, {"O", "X", "O"}, {"X", "O", "X"}};

        for (String[] strings : ticTacToe) {
            StringBuilder temp = new StringBuilder();
            for (String string : strings) {
                temp.append(string).append(" ");
            }
            System.out.println(temp.toString().trim());
        }
    }
}