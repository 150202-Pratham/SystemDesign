package SerializationAndDerialization;

import java.io.Serializable;

public class GameSettings implements Serializable {

    boolean sound ;
    String difficulty ;


    public GameSettings(boolean sound, String difficulty) {
        this.sound = sound;
        this.difficulty = difficulty;
    }
}
