package Patterns.SingletonPattern;

public class Jalebi {
//    This Is Eager Initialization of Singleton
    private static Jalebi jalebi = new Jalebi() ;

    public static Jalebi getJalebi(){
        return jalebi ;

    }
}
