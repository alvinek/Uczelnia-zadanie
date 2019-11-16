package zadan3;

import java.util.Scanner;

public class Factorial
{
    int fact = 0;

    public Factorial(int fact)
    {
        this.fact = fact;
    }

    public Factorial()
    {
        Initialize();
    }

    public int Factorify()
    {
        int out = 1;
        int temp = 0;
        for(int i = 1; i <= fact; i++)
        {
            temp = out * i;
            out = temp;
        }
        return out;
    }

    private void showOverallInfo()
    {
        int out = 1;
        int temp = 0;
        for(int i = 1; i <= fact; i++)
        {
            temp = out * i;
            out = temp;
        }
        System.out.println(fact + "! = " + out);
    }

    private void Initialize()
    {
        while(true)
        {
        int fact = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");

        while(true)
        {
            if(scan.hasNextInt())
            {
                fact = scan.nextInt();
                break;
            }
            else 
            if(fact < 0)
            {
                System.out.println("Podana liczba jest niepoprawna (ujemna).");
                scan.nextLine();
            }
            else
            {
                System.out.println("Podana liczba jest niepoprawna.");
                scan.nextLine();
                continue;
            }
        }

        Factorial d = new Factorial(fact);

        d.showOverallInfo();
        }
    }
}