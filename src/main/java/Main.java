import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Function<String, List<String>> dictionary = x -> Arrays.stream(x.split(" ")).
                distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        dictionary.apply("a d c e b a").forEach(System.out::println);
        
        // Признаки функционального программирования:
        // 1. Функциональный интерфейс + лямда
        // 2. В качетсве монады Stream API
        // 3. Ссылка на метод
    }
}
