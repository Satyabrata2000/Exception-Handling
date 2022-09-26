package ExceptionHandling;

//throws example again

public class ExceptionHandlingExample11 {

    public static int divideNum(int m, int n) throws ArithmeticException{
        int div = m/n;
        return div;
    }

    public static void main(String[] args) {
        ExceptionHandlingExample11 obj = new ExceptionHandlingExample11();
        try{
            System.out.println(obj.divideNum(15, 0));
        } catch(ArithmeticException e){
            System.out.println("\n Number can't be divided by zero");
        }
    }
}
