package ReflectionAPI;

public class Student {
//    let's convert this into Singleton class
    private static Student bowl ;

    private String name ;
    public int value = 0 ;
    private Student(){

        System.out.println("Hello I am Private Constructor of Student Class");
    }


    public void study(){
        System.out.println("Student is studying");
    }

    public static  Student getStudent(){

        if(bowl==null){
            bowl = new Student() ;

        }

        return bowl ;

    }
}

