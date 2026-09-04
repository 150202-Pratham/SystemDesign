package Patterns.SingletonPattern;

public class Example {

    public static void main(String[] args) {

        Samosa s1= Samosa.getSamosa();
        Samosa s2 = Samosa.getSamosa();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

//        You Will get same hashCode because We have made the Implementation of Singleton Pattern
//        Saying the Class can have Only 1 Single Object to interact with

        /*
        * It means we are Creating Object When We actually Need it
        *
        *       this is Lazy way of creating a Single object ;
        *
        * */
    }
}
