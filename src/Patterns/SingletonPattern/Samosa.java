package Patterns.SingletonPattern;

public class Samosa {

    private static Samosa bowl ;

//    Constructor
    private Samosa(){


    }

    public static Samosa getSamosa(){

//      Object of Samosa Class
        if(bowl==null){
            bowl = new Samosa() ;
        }
        return bowl ;

    }

}


/*
*  Implementation Behavior of Singleton
*
* -> We have To Stop Constructor Intitializing Object -> by making it private
* -> make a method that retuns a Samosa Class Object -> getSamasa() ;
* -> now Issue came is we have to do something So that on calling method
* multiple times shouldn't make redundant objects
* -> we have to make method static so that it can be directly accessed through class name
*  and there is no need to make new object for it
* -> now think of Something Like Containner in which you have to keep the Samosa that tells
* us like on every method call checks do am I Empty ;
*
*
*
*
*/





