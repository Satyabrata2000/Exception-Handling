package ExceptionHandling;

public class ExceptionHandlingExample1 {

    public static void main(String[] args) {

        try{
            int data = 100/0;
        } catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of the program");
        }
    }
}
