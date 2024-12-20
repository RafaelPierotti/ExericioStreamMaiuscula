import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "rafael");

        palavras.stream()
                .map(p -> p.toUpperCase())
                .forEach(System.out::println);
    }
}