package zadan3;

import java.util.Scanner;

public class EvenList
{
    int numberFirst = 0;
    int numberSecond = 0;

    private EvenList(int numberFirst, int numberSecond)
    {
        this.numberFirst = numberFirst;
        this.numberSecond = numberSecond;
    }

    public EvenList()
    {
        Initialize();
    }

    private void ShowOverallInfo()
    {
        if(numberFirst >= numberSecond)
        {
            // zamiana zmiennych
            int temp = numberFirst;
            numberFirst = numberSecond;
            numberSecond = temp;
        }
        for(int i = this.numberFirst; i <= numberSecond; i++)
        {
            IsEvenOrIsOdd d = new IsEvenOrIsOdd(i);
            if(d.CheckIsEven())
            {
                System.out.println("Liczba " + i + " jest parzysta");
            }
        }
    }

    public void Initialize()
    {
        int numberFirst;
        int numberSecond;

        while(true)
        {
            Scanner scan = new Scanner(System.in);
                while(true)
                {
                    System.out.println("Podaj liczbe 1: ");

                    if(scan.hasNextInt())
                    {
                        numberFirst = scan.nextInt();
                    }
                    else
                    {
                        System.out.println("Podana liczba jest niepoprawna");
                        scan.nextLine();
                        continue;
                    }

                    System.out.println("Podaj liczbe 2: ");

                    if(scan.hasNextInt())
                    {
                        numberSecond = scan.nextInt();
                    }
                    else
                    {
                        System.out.println("Podana liczba jest niepoprawna");
                        scan.nextLine();
                        continue;
                    }

                    break;
                }

            EvenList d = new EvenList(numberSecond, numberFirst);
            scan.hasNextLine();
            d.ShowOverallInfo();
        }
    }
}