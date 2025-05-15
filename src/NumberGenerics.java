import java.util.Collection;
import java.util.function.Predicate;

public class NumberGenerics {

    // Generic method to count elements matching a condition
    public static <T> long countMatching(Collection<T> collection, Predicate<T> condition) {
        return collection.stream()
                .filter(condition)
                .count();
    }

    // Check if an integer is even
    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    // Check if an integer is prime
    public static boolean isPrime(Integer number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        var numbers = java.util.List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        long evenCount = countMatching(numbers, NumberGenerics::isEven);
        long primeCount = countMatching(numbers, NumberGenerics::isPrime);

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Prime numbers: " + primeCount);
    }
}
