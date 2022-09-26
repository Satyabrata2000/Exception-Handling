package ExceptionHandling;

//throw example again

public class ExceptionHandlingExample10 {

    public static void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("\n Number is negative, can't get square");
        } else {
            System.out.println("Square of" + num + "is" + (num * num));
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingExample10 obj = new ExceptionHandlingExample10();
        obj.checkNum(-4);
    }
}
