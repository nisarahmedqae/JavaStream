package nahmed;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(s -> System.out.println(s));

        System.out.println("------------------ gap --------------------");

        Integer[] arr2 = {6, 7, 8, 9, 10};

        Stream<Integer> integerStream = Arrays.stream(arr2);
        integerStream.forEach(s -> System.out.println(s));

        System.out.println("------------------ gap --------------------");

        String[] stringArray = {"apple", "banana", "cherry", "date"};

        Stream<String> stringStream = Arrays.stream(stringArray);
        stringStream.forEach(s -> System.out.println(s));
    }

}
