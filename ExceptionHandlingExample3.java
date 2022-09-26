package ExceptionHandling;

//Multiple catch blocks

public class ExceptionHandlingExample3 {

    public static void main(String[] args) {

        try{
            int a[] = new int[5];
            a[5] = 50/0;
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception occurs");
        } catch(Exception e){
            System.out.println("Parent exception occurs");
        }
        System.out.println("This is the final piece of code");
    }
}
