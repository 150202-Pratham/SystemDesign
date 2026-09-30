package Patterns.SingletonPattern;

import java.lang.reflect.Constructor;

public class Break {

    public static void main(String[] args) throws Exception{

        /*
        *  Here We are Trying all the Methods to Break the Singleton Class
        *
        *  Method 1:- Using Reflexion Api -> This api allows you to run, inspect and interact with classes, methods
        *  fields, constructors, and objects at run time even when we don't know the exact details at Compile time
        *
        *  In short story it allows you to change the nature of clases, fields, constructors at run time not at compile
        *  time;
        *
        * */


        Samosa s1 = Samosa.getSamosa() ;
        System.out.println(s1.hashCode());

//        Break the Singleton Pattern
//      Using Reflexion Api
        Class<?> s = Samosa.class;
        Constructor<?> c = s.getDeclaredConstructor() ;
        c.setAccessible(true) ;
        Samosa s2= (Samosa) c.newInstance() ;
//      Private Constructors ka Access Allow
        System.out.println(s2.hashCode());

        Samosa s3 = Samosa.getSamosa() ;
       System.out.println(s3.hashCode());

//       How to Stop Using Reflexion Api
        /*
        *  1) Set the Limitation to Private Block that if(bowl!=null) throw Runtime Exception
        *  2) Then Use Enums ;
        * */



    }
}
