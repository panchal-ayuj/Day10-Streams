import java.util.Optional;
public class OptionalFeature {
    // optional helps us avoid nullpointer exceptions
    Optional<Integer> firstType = Optional.empty();
    static Optional<String> secondType = Optional.of("1234567");
    static String name = "abc";
    static Optional<String> thirdType = Optional.ofNullable(name);

    public static void main(String[] args) {
        String anotherName = thirdType.orElse("XYZ");
        String anotherName2 = thirdType.get();
        System.out.println(anotherName);
        System.out.println(anotherName2);
    }
}
