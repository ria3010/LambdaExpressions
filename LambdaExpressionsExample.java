import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionsExample {
    private static void printStartingWith(List<Student> studentList, IConditional condition) {
        for (Student s : studentList) {
            if (condition.startsWithCondition(s)) {
                System.out.print("\n"+s);
            }
        }

    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        //List of students
        Student student1 = new Student("Michael", 2134, 40);
        Student student2 = new Student("Jim", 4354, 25);
        Student student3 = new Student("Pam", 9875, 26);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //using lambda expressions with comparator
        //Here comparator is a functional interface
        //comparing student age and student name using lambda expressions
        Comparator<Student> comparator = (o1, o2) -> (o1.getAge() - o2.getAge());
        studentList.sort(comparator);
        System.out.println("\n Sorting with Age :\n ");
        studentList.forEach((student -> System.out.print("\n" + student)));
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("\n Sorting with Name :\n ");
        //using the double colon operator
        studentList.forEach(System.out::println);


        //print all students that have name starting with J using anonymous class
        System.out.println("\nUsing Anonymous Class to print students whose name starts with J : ");
        printStartingWith(studentList, new IConditional() {
            @Override
            public boolean startsWithCondition(Student s) {
                if (s.getName().startsWith("J")){
                    return true;
                }
                return false;
            }
        });
        // print all students that have name starting with J using lambda expressions
            System.out.println("\n Using Lambda Expressions to print students whose name starts with J : ");
            printStartingWith(studentList,s -> s.getName().startsWith("J"));

        //to print all students with true condition
        System.out.println("\n Printing all students using lambda expression : ");
           printStartingWith(studentList, s -> true);


        //to print students with age greater than 25 and less than 30
        System.out.println("\n\n Printing all students with age greater than 25 and less than 30 using lambda expression : ");
        studentList.forEach(s -> {if (s.getAge()>25 && s.getAge()<30 ) System.out.println(s);});
    }




}

