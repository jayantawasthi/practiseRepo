package date_time_api;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practise_DateTime {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 1, 2, 1, 2, 3, 4, 5, 6);

        //frequency counting
        Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency count");
        System.out.println(collect);



        List<Student> students = List.of(
                new Student(353, "abc", "abc@gmail.com", List.of(353, 3535, 3535, 3535, 35)),
                new Student(353, "abc", "abc@gmail.com", List.of(536753, 93535, 359935, 993535, 997897)),
                new Student(353, "mno", "mno@gmail.com", List.of(0536753, 93535, 359935, 993535, 9907897))
        );
        
        
        //using map function
        List<List<Integer>> listOfList = students.stream().map(student -> student.getContactList()).collect(Collectors.toList());
        System.out.println(listOfList);

        //using flatmap=>flattening data
        List<Integer> flatMap = students.stream().flatMap(student -> student.getContactList().stream()).collect(Collectors.toList());
        System.out.println(flatMap);


    }
}
