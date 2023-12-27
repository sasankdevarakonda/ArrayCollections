package collectionService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArryListExample {
     static Predicate<Integer> markspredicate =(marks)-> marks>36;

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(79);
        numbers.add(24);
        numbers.add(37);
       // ArrayList<Integer> passedStudent = new ArrayList<>();

        //for (int i = 0; i <numbers.size(); i++) {
            /*if (markspredicate.test(numbers.get(i))) {
                passedStudent.add(numbers.get(i));
            }*/

       // }
           // System.out.println(passedStudent);

        List<Integer> passedStudents=numbers.stream().filter( number ->markspredicate.test(number)).collect(Collectors.toList());
        System.out.println("Stream passed Student : "+passedStudents);

    }
}
