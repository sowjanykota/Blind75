package arrays.pracice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorting {
    public static void main(String[] args) {
       List<Integer> nms = Arrays.asList(1, 7, 81, 22, 28, 122, 283);
//        // 1st way using Collections Using Collections.sort() (Traditional way)
//        Collections.sort(nms);
//        System.out.println(nms);
//        Collections.sort(nms, Comparator.reverseOrder());
        System.out.println(nms.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()));

        // 2nd way usingList.sort() (

        List<String> names = Arrays.asList("John", "Alice", "Bob");
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        // using streams
        List<String> names1 = Arrays.asList("John", "Alice", "Bob");
        System.out.println(names.stream().sorted().collect(Collectors.toList()));
        System.out.println(names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        System.out.println(names.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()));
    }
}
