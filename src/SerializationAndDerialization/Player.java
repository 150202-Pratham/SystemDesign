package SerializationAndDerialization;

import java.io.Serializable;
import java.sql.SQLOutput;

public class Player implements Serializable {

    /*
    * Serializable: It is Marker Interface, that don't contain any method to implement and
    * basically tells java that objects of this class are permitted to participate in java's Default
    * Serialization mechanism ;
    *
    * -> Methods that Participate are : ObjectOutputStream,
                                        ObjectInputStream,
                                        ObjectOutput,
                                        ObjectInput,
                                        Externalizable
    *
    *
    * */

    String userName ;
    int level ;
    int coins ;
    int health ;

    transient String password ;


/*
    Transient:
   -> we use transient keyword when we don't want the Instance Variable to be part of
       serialized data

    Serialization

    username ─────────────→ stored
    password ──X──────────→ not stored

    SerialVersionUID: seemingly harmless class changes can cause the automatically calculated value to change
    And this may encounter InvalidClassException


*/

    GameSettings settings ;


    public Player(int coins, int health, String password, GameSettings settings, String userName, int level) {
        this.coins = coins;
        this.health = health;
        this.password = password;
        this.settings = settings;
        this.userName = userName;
        this.level = level;
    }



    public void display(){
        System.out.println("Username: " + userName);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
        System.out.println("Health: " + health);
        System.out.println("Password: " + password);

    }


}
