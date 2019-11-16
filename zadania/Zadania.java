import java.util.Scanner;
import zadan3.*;

class Zadania
{
    public static void main(String[] args) {
        System.out.print("Nr zadania: ");
         
        Scanner scanUserInput = new Scanner(System.in);

        int userInput = 0;

        if(scanUserInput.hasNextInt())
             userInput = scanUserInput.nextInt();
        
        
        switch(userInput)
        {
            case 1:
                new Calculator();
                break;
            case 3:
                new BMIClass();
                break;
            case 4:
                new IsEvenOrIsOdd();
                break;
            case 5:
                new EvenList();
                break;
            case 6:
                new Factorial();
                break;
            case 7:
                new UserList();
                break;

            default:
                System.out.println("Prosze uprzejmie o nie psucie mojego programu :|");
                break;
        }

        scanUserInput.close();
    }
}