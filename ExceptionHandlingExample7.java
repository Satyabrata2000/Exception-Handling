package ExceptionHandling;

//throw keyword, throwing unchecked exception

public class ExceptionHandlingExample7 {

    public static void validate(int age) {

        if(age < 18){
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String[] args) {
        //cancelling the function
        validate(13);
    }
}
