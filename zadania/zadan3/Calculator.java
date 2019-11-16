package zadan3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator
{
    double userNumber = 0;
    double odd = 0;
    public List<String> history = new ArrayList<>();

    public Calculator()
    {
        Run();
    }

    private void Powwer(double number)
    {
        userNumber = Math.pow(userNumber, number);
        history.add("spotegowales o "+number+" i teraz jest " +userNumber);
    }
    private void Squrt()
    {
        userNumber = Math.sqrt(userNumber);
        history.add("spierwiastkowales i jest " + userNumber);
    }

    private void Add(double number)
    {
        userNumber += number;
        history.add("dodales " + number + " i jest " + userNumber);
    }

    private void Subtract(double number)
    {
        userNumber -= number;
        history.add("odjales " + number + " i jest " + userNumber);
    }

    private void Multiply(double number)
    {
        userNumber *= number; 
        history.add("pomnozyles o " + number + " i jest " + userNumber);
    }

    private void Factorial()
    {
        Factorial fact = new Factorial((int)userNumber);

        userNumber = fact.Factorify();

        history.add("zrobiles silnie i jest " + userNumber);
    }

    private void Divide(double number)
    {
        userNumber /= number;
        odd = userNumber % number;
        history.add("podzieliles przez " + number + " i jest " + userNumber + " reszty " + odd);
    }
    
    private void ViewHistory()
    {
        System.out.println(history); // obiekt jest ladnie rozdzielony przecinkami nic nie trzeba robic
    }

    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Liczba zaczynajaca obliczenia: ");

        while(true)
        {
            if(scan.hasNextDouble()) 
            {
                userNumber = scan.nextDouble();
                history.add("na poczatku bylo " + userNumber);
                break;
            }
            else
            {
                System.out.println("Nie podales poprawnej liczby");
                scan.next();
                continue;
            }
        }
            

        while(true)
        {
            System.out.println("Wynik: " + userNumber);
            System.out.println("1. Dodaj");
            System.out.println("2. Odejmij");
            System.out.println("3. Pomnoz");
            System.out.println("4. Podziel");
            System.out.println("5. Historia obliczen");
            System.out.println("6. Silnia");
            System.out.println("7. Pierwiastek");
            System.out.println("8. Potega");
            System.out.print("Wybor: ");

            int choice = 0;
            while(true)
            {
                if(scan.hasNextInt())
                {
                    choice = scan.nextInt();
                    
                    break;
                }
                else
                {
                    System.out.println("Nie podales poprawnej liczby");
                    scan.next();
                    continue;
                }
            }

            double number = 0;
            if(choice != 5 || choice != 6 || choice != 7) // 5 to historia obliczen, 6 to silnia, 7 pierwiasek
            {
                System.out.print("Liczba: ");
                
                while(true)
                {
                    if(scan.hasNextDouble())
                    {
                        number = scan.nextDouble();
                        break;
                    }
                    else
                    {
                        System.out.println("Nie podales poprawnej liczby");
                        scan.next();
                        continue;
                    }
                }
            }

            switch(choice)
            {
                case 1:
                    Add(number);
                    continue;
                case 2:
                    Subtract(number);
                    continue;
                case 3:
                    Multiply(number);
                    continue;
                case 4:
                    Divide(number);
                    System.out.print("reszta: " + odd);
                    continue;
                case 5:
                    ViewHistory();
                    continue;
                case 6:
                    Factorial();
                    continue;
                case 7:
                    Squrt();
                    continue;
                case 8:
                    Powwer(number);
                    continue;
                default:
                    System.out.println("Cos poszlo nie tak");
                    scan.next();
                    continue;
            }
        }
    }
}