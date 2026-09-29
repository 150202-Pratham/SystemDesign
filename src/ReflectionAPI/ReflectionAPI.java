package ReflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionAPI {

    public static void main(String[] args) throws Exception {

        /*
        * Reflection API:
        * Getting Classes using Class Object in Java
        *
        * Method 1 : This is called .class method
        *           Class<?> c = Student.class ;
        *
        * Method 2: getClass()
        *       Student s = new Student() ;
        *       Class<?> c = s.getClass() ;
        *
        * Method 3: Class.forName() ;
        *       Class<?> c = Class.forName("Student") ;
        * */

        Class<?> c = Student.class ;
        System.out.println(c.getName());

          /*
          * Getting Methods out here
          *
          * */

        Method[] methods = c.getDeclaredMethods() ;

        for(Method m : methods){
            System.out.println(m.getName());

        }

//       Similarly We can Get the Fields also at the Runtime too;

        /*
        *
        * Getting Fields Out There
        *
        * */
//      One Important thing too, note that it only brings value that are public not the
//      Private or protected by class itself

        Field[] fields = c.getFields() ;
        for(Field f : fields){
            System.out.println(f.getName());
        }

        Field privateField = c.getDeclaredField("name") ;
        System.out.println(privateField.getName());


        /*
        *
        * Getting Constructor out there
        *
        *
        * */

        Student s1 = Student.getStudent();
        System.out.println(s1.hashCode());



        Constructor<?> constructor = c.getDeclaredConstructor() ;
//      converting illegal or private constructor to public
        constructor.setAccessible(true);

        Object s2 = constructor.newInstance() ;
        System.out.println(s2.hashCode());


        /*
        *
        * both the hashCodes of s1 and s2 are different that means you are able to break the singleton pattern using reflexion api
        *
        *
        * */
    }
}
