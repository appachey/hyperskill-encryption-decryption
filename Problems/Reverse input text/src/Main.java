import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws Exception {
        List<Character> charList = new ArrayList<>();
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int symbol = reader.read();
            while (symbol != -1) {
                charList.add((char) symbol);
                symbol = reader.read();
            }
        }
        for (int i = charList.size() - 1; i >= 0; i--) {
            System.out.print(charList.get(i));
        }
    }
}