package ExceptionHandling;

//multiple catch blocks. Here it has two exceptions, but at a time only one exception occurs
//and its corresponding catch block is executed

public class ExceptionHandlingExample4 {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            System.out.println(a[8]);
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurs");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception occurs");
        } catch(Exception e){
            System.out.println("Parent Exception occurs");
        }
        finally {
            System.out.println("This is the end of program");
        }
    }
}
