package zadan3;

import java.util.Scanner;

public class BMIClass
{
    double height;
    double weight;

    public BMIClass(double height, double weight)
    {
        this.height = height;
        this.weight = weight;
    }

    public BMIClass()
    {
        Initialize();
    }

    public String getOverallInfo()
    {
        double bmi = weight / Math.pow(height/100, 2);
        String resultFormat = String.format("%.2f", bmi);
        return "Twoja waga: " + weight + "KG\nTwoja wysokość: " + height + "CM\nTwoje BMI wynosi: " + resultFormat;
    }

    public void Initialize()
    {
        Scanner userInputScan = new Scanner(System.in);
        
        double weight = 0, height = 0;

        while(true)
        {
            System.out.println("Podaj wage w KG: ");

            if(userInputScan.hasNextDouble())
                weight = userInputScan.nextDouble();

            System.out.println("Podaj wzrost w CM: ");

            if(userInputScan.hasNextDouble())
                height = userInputScan.nextDouble();

            if(weight == 0 || height == 0)
            {
                System.out.println("Podano 0, lub nie udało sie przetworzyć podanych liczb");
                userInputScan.nextLine();
                continue;
            }
            
            if(height > 250 || weight > 300)
            {
                System.out.println("Wzrost lub/i waga wydaja sie nienaturalne. Czy jestes pewien? Y/N");

                System.out.println("Waga: " + weight + " kg");
                System.out.println("Wzrost: " + height + " cm");


                userInputScan.nextLine();

                String s = userInputScan.nextLine();

                if(s.toLowerCase().equals("y"))
                    break;
                
                continue;
            }

            break;
        }

        userInputScan.close();

        BMIClass d = new BMIClass(height, weight);
        System.out.println(d.getOverallInfo());
    }
}