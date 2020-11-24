public class CustomComparator {

    public int compareAge(Student s1, Student s2){
        return s1.getAge() - s2.getAge();
    }

    public int compareName(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }

   public int compareStudentId(Student s1, Student s2){
        return s1.getStudentId() - s2.getStudentId();
   }


}
