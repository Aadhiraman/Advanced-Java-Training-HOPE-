import java.util.*;
import java.util.stream.Collectors;

public class StreamsPrint {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = new ArrayList<>();
        list1 = list.stream().filter(i -> i % 2 == 1)
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);
    }
}
