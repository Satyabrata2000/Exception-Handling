package ExceptionHandling;


//throws keyword

import java.io.IOException;

public class ExceptionHandlingExample9 {

    void m() throws IOException{
        throw new IOException("Device error"); //checked exception
    }

    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        } catch(Exception e){
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingExample9 obj = new ExceptionHandlingExample9();
        obj.p();
        System.out.println("End of program");
    }
}
