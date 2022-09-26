package ExceptionHandling;

//throw and throws keywords, throwing checked exception

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingExample8 {

    //function to check if a person is eligible to vote or not

    public static void method() throws FileNotFoundException{
        FileReader file = new FileReader("C:\\abc.text");
        //BufferedReader fileInput = new BufferedReader(file);

        //throw new FileNotFoundException();
    }

    //main method

    public static void main(String[] args) {
        try{
            method();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Program rests");

    }
}
