package ExceptionHandling;

//multiple catch blocks example

public class ExceptionHandlingExample5 {

    public static void main(String[] args) {

        try{
            int a[] = new int[5];
            a[5] = 30/0;
            System.out.println(a[10]);
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound Exception Occurs");
        } catch(Exception e){
            System.out.println("Parent Exception Occurs");
        }
        finally {
            System.out.println("End of program");
        }
    }
}
