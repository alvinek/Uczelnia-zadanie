package zadan3;

import java.util.Scanner;

public class IsEvenOrIsOdd
{
    int number;

    public IsEvenOrIsOdd(int number)
    {
        this.number = number;
    }

    public IsEvenOrIsOdd()
    {
        Initialize();
    }

    public boolean CheckIsEven()
    {
        if(number % 2 == 0) return true; else return false;
    }

    private void ShowOverallInfo()
    {
        if(CheckIsEven())
        {
            System.out.println("Liczba jest parzysta");
        }
        else
        {
            System.out.println("Liczba jest nieparzysta");
        }
        
    }

    public void Initialize()
    {
        Scanner userInput = new Scanner(System.in);

        while(true)
        {
        int number = 0;
        while(true)
        {
            System.out.println("Wpisz liczbę: ");
            if(userInput.hasNextInt())
            {
                number = userInput.nextInt();
                break;
            }
            else
            {
                System.out.println("Wpisana liczba jest niepoprawna");
                userInput.nextLine();
                continue;
            }
        }
        
        IsEvenOrIsOdd d = new IsEvenOrIsOdd(number);
        
        d.ShowOverallInfo();
        }
        
    }
}