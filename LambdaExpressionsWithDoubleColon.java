import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionsWithDoubleColon {


    public static void main(){
        CustomComparator customComparator = new CustomComparator();
        List<Student> studentList = Arrays.asList(new Student("Cathie",1, 15),
                new Student("Toby",2,17));

        //studentList.sort((o1,o2)->o1.getAge()-o2.getAge());
        studentList.sort(customComparator::compareAge);

    }
}
