package Patterns.SingletonPattern;

public class Samosa {

    private static Samosa bowl ;

//    Constructor
    private Samosa(){
        if(bowl!=null){
            throw new RuntimeException("You are trying to Break Singleton Pattern");

        }
    }


//    Now the Issue is this method is not thread safe like if two threads will come and make a call to the method
//    then at that time we have problem of making the object accessible by multiple methods ( No MultiThread Support);

    /*
    *  Solution is :
    *  Use Synchronised Methods
    *  Use Synchronised block
    *  Use Static Synchronization
    *
    *   Synchronised method : This Declaration make the entire method synchronised that means whole method can be
    *         could be accessed by one thread at a time
    *
    *   UseCase:
    *    public synchronised static Samosa getSamosa(){

            Object of Samosa Class
            if(bowl==null){
                 bowl = new Samosa() ;
            }
            return bowl ;

         }

    * There are several issues here like if we want the Specific part of the method to be synchronised then at that
    * time we cannot use this method as it will cause program delays ;
    *
    *  Synchronised Block: this method blocks the particular part of the method so,as to increase the performance
    *
    *
    * */
    public static Samosa getSamosa(){

//      Object of Samosa Class is used here as it act as a lock and makes thread complaint to unlock and then access
//      the inner code part of the block

        synchronized(Samosa.class){
            if(bowl==null){
                bowl = new Samosa() ;
            }
        }

        return bowl ;

    }


}


/*
*  Implementation Behavior of Singleton
*
* -> We have To Stop Constructor Intitializing Object -> by making it private
* -> make a method that retuns a Samosa Class Object -> getSamosa() ;
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





