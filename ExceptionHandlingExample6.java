package ExceptionHandling;

//Multiple catch blocks. But no corresponding exception type. In such case, the catch block
//containing the parent exception will be invoked.

public class ExceptionHandlingExample6 {

    public static void main(String[] args) {

        try{
            String s = null;
            System.out.println(s.length());
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Outof Bounds Exception Occurs");
        } catch(Exception e){
            System.out.println("Parent Exception Occurs");
        } finally {
            System.out.println("Last piece of program");
        }
    }
    }
