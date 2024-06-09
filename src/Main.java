import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number to perform calculations");
        Double num1 = sc.nextDouble();

        System.out.println("enter second number to perform calculations");
        Double num2 = sc.nextDouble();

        char id;
        System.out.println("Enter + for addition , - for subtraction , * for multiplication , / for division and % for remainder");

         id =sc.next().charAt(0);
double result =0;
        switch( id ) {
            case'+':

                result = num1 + num2;
               break;

            case'-' :
            result =num1 - num2;
            break;

            case'*' :
            result =num1 * num2;
            break;

            case'/' :
             if (num2 ==0) {
                 System.out.println("Division is not possible");
             } else {
                 result = num1/num2;
             }
             break;

             default :
             System.out.println("Error : invalid operator");
             sc.close();
             return;


        } System.out.println("the " + id +  " of " + num1 +" and " + num2 + " is " + result);
        sc.close();
    }
}