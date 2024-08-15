import java.util.Scanner;
public class guessnumbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usernumber;
        int computernumber = (int) (Math.random() * 100);


        do {
            System.out.println("Guess the number");
             usernumber = sc.nextInt();
             if (usernumber == computernumber) {
                 System.out.println("Whooo you guessed it right");
                 break;
             }
             else if (usernumber > computernumber) {

                     System.out.println("The guessed number is too large");
                 } else {
                     System.out.println("The guessed number is too small");
                 }
             }while(usernumber>=0);


        }
    }