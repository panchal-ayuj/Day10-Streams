import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String rollNo = "xyz";
        String name = "ABC";
        map.put(rollNo, name);
        System.out.println(map.get(rollNo));
        rollNo = "PQR";
        System.out.println(map.get(rollNo));
        System.out.println(map); // therefore, we should always use immutable keys in hashmap
        numberOperationsOldStyle();
        numberOperationsNewStyle();
        reduce();
    }

    public static void numberOperationsOldStyle(){
        // arrayList -> filter even numbers ->
        // multiply remaining numbers by 2 -> add remaining number
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num: numbers) {
            if (num%2 == 0) evenNumbers.add(num*2);
        }
        int result = 0;
        for (int num: evenNumbers){
            result += num;
        }
        System.out.println("Using old style: " + result);
    }

    public static void numberOperationsNewStyle(){
        System.out.println(numbers.stream().filter(num -> num%2 == 0).mapToInt(num -> num*2).sum());
    }

    public static void collect () {
        List<Integer> oddNumbers = numbers.stream().filter(num -> num%2 != 0).collect(Collectors.toList());
        oddNumbers.forEach(System.out :: print);
    }

    public static void reduce() {
        System.out.println(numbers.stream().filter(num -> num%2 != 0).reduce( (a,b) -> a+b));;
    }
    public static void forEach() {
        numbers.stream().filter(num -> num%2 != 0).forEach(System.out :: print);
    }
}