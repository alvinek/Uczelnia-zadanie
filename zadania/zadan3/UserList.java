package zadan3;

import java.util.Scanner;

public class UserList
{

    public UserList()
    {
        Initialize();
    }

    public void Initialize()
    {
        while(true)
        {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Podaj wielkosc tabeli: ");
        
        int n = 0;
        while(true)
        {
            
            if(s.hasNextInt())
            {
                n = s.nextInt();
                break;
            }
            else
            {
                System.out.println("Podaj poprawna liczbe");
                continue;
            }
        }

        System.out.println("Podawaj elementy tablicy");
        int nArray[] = new int[n];

        try
        {
            int i = 0;
            for(i = 0; i<n; i++)
            {
                nArray[i] = s.nextInt();
            }
        }
        catch(Exception e)
        {
            System.out.println("Krytyczny blad: Nie mozna dodac tego elementu.");
            return;
        }

        // wartosc i numer pozycji najwiekszego elementu
        // wartosc i numer pozycji najmniejszego elementu
        // srednia wartosci wszystkich elementow tablicy
        // liczba dodatnich elementow tablicy

        int biggestElement = nArray[0];

        for(int number : nArray)
        {
            if(biggestElement < number)
                biggestElement = number;
        }

        int smallestElement = nArray[0];

        for(int number : nArray)
        {
            if(smallestElement > number)
                smallestElement = number;
        }

        int addedElements = 0;

        for(int number : nArray)
        {
            addedElements += number;
        }

        double averageOfElements = (double)addedElements / (nArray.length + 1);

        String elementsAboveZero = "";

        for (int i : nArray) {
            if(i > 0)
            {
                elementsAboveZero += i + ",";
            }
        }

        // usuwamy przecinek na koncu
        if(!elementsAboveZero.equals(""))
        elementsAboveZero = elementsAboveZero.substring(0, elementsAboveZero.length()-1);

        System.out.println("Najwiekszy element: " + biggestElement);
        System.out.println("Najmniejszy element: " + smallestElement);
        System.out.println("Srednia elementow: " + averageOfElements);
        System.out.println("Dodatnie elementy: " + elementsAboveZero);
        s.nextLine();
        }
    }
}