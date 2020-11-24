@FunctionalInterface

interface IConditional {
    //single abstract method
    public boolean startsWithCondition(Student s);

    default void mydefaultMethod (){
        System.out.println("this Method Cannot Be Accessed By LambdaExpressions");
    }

}
