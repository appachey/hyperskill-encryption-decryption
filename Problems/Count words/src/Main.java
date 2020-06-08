import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder str = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int symbol = reader.read();
            while (symbol != -1) {
                str.append((char) symbol);
                symbol = reader.read();
            }
        }
        if (str.toString().isBlank()) {
            System.out.println(0);
        } else {
            String[] arr = str.toString().trim().split("\\s+");
            System.out.println(arr.length);
        }
    }

}