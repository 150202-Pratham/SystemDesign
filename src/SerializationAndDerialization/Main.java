package SerializationAndDerialization;

import java.io.*;
import java.sql.SQLOutput;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws Exception {
        GameSettings settings = new GameSettings(true, "Hard");

        Player player = new Player(5400,
                87,
                "secret123",
                settings,
                "Shadow",
                27
        );

        /*
         *  FileOutputStream -> when a need to write bytes to a file
         *  it takes Bytes and write it Back into File
         *
         *  example : foo.write(65) ; So My File Will Contain an Alphabet "A" ;
         *
         *            foo.close() ;
         *
         * ObjectOutputStream -> converts Java objects to Byte Stream so they can be Written
         *  Converts Java Object into Serialized byte Representation
         *
         * -> writeObject() -> Serialize the Object and Write its Serialization in Underlying stream
         *
         * For Performing Operation of ( Bytes iof Stream to Object ) :
         *
         * FileInputStream fis = new FileInputStream("game.save") ;
         * ObjectInputStream ois = new ObjectInputStream(fis) ;
         *
         * -> readObject() -> Read a serialized object from stream and reconstruct the object
         *
         * Game game = (Game) ois.readObject() ;
         *
         *
         *
         * */
//   Serialization

        try {
            FileOutputStream fos = new FileOutputStream("game.save");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            /* This is chaining where oos produces bytes -> foo -> game.save file */

            oos.writeObject(player);

            oos.close();

            fos.close();

            System.out.println("Game Saved SuccessFully");

        } catch (IOException ioe) {

            ioe.printStackTrace();

        }


//        Deserialization
        Player restoredPlayer = null ;
        try {
            FileInputStream fis = new FileInputStream("game.save");
            ObjectInputStream ios = new ObjectInputStream(fis);

            restoredPlayer = (Player) ios.readObject();

            ios.close();
            fis.close();

            System.out.println("Restored Player Successfully");


        } catch (IOException ioe) {

            ioe.printStackTrace();


        }

        if (restoredPlayer!=null){

            restoredPlayer.display() ;

        }


    }


}
