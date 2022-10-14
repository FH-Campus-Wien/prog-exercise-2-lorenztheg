package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void largestNumber(){
        double number = 0;
        int count = 1;
        double largestNumber = 0;
        do
            {
            System.out.print("Number " + (count++) + ": ");
            number = scanner.nextDouble();
            if (number > largestNumber){
                largestNumber = number;
            }

        }
        while (number >0);
            {
                if (count==2)
                    {
                        System.out.println("No number entered.");
                    }
            else
                {
                    System.out.print("The largest number is ");
                    System.out.printf("%.2f",largestNumber);
                    System.out.println();
                }
            }
    }

    //todo Task 2
    public void stairs(){
        int number =1;
        System.out.print("n: ");
        int n = scanner.nextInt();
        if (n <=0)
            {
                System.out.println("Invalid number!");
            }
        else
            {
                for (int i = 1; i <= n; i++)
                {
                    for (int b = 0; b<i; b++)
                        {
                            System.out.print((number++) + " ");
                        }
                System.out.println();
                }
            }
    }

    //todo Task 3
    public void printPyramid(){
        final int rows = 6;
        for (int i = 1; i <= rows; i++)
            {
                for(int f = 5; f >=i; f--)
                    {
                        System.out.print(" ");
                    }
                for (int v=0; v<i*2-1;v++)
                    {
                        System.out.print("*");
                    }
                System.out.println();
             }

        // i +2 -1
    }

    //todo Task 4
    public void printRhombus() {
        System.out.print("h: ");
        int h; // Höhe bzw Reihen
        h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);
        int spaces = 0;
        if (h / 2 * 2 == h) {                                                    // der Check ob es eine gerade Zahl ist
            System.out.println("Invalid number!");          // und wäre damit nicht für die Raute geeignet
        } else {
            int row;
            for (row = 0; row < h; row++) {
                for (spaces = row; spaces < h / 2; spaces++) {
                    System.out.print(" ");
                }
                System.out.println(c);
            }
        }
    }
    //todo Task 5
    public void marks(){
        int countOfMarks = 1;
        int mark = 0;
        int fails =0;
        float sumOfMarks = 0;
        float average = 0;
        do
        {
            System.out.print("Mark " + (countOfMarks++) + ": ");
            mark = scanner.nextInt();

            if(countOfMarks ==2)
                {
                    sumOfMarks = mark;
                    average = sumOfMarks/(countOfMarks-1);
                }
            if (mark == 5 && countOfMarks == 2)
                {
                    fails++;
                }
            else if (mark == 5)
                {
                    fails++;
                    sumOfMarks = sumOfMarks + mark;
                    average = sumOfMarks/(countOfMarks-1);
                }
            else if (mark > 5)
                {
                    System.out.println("Invalid mark!");
                    countOfMarks--;
                }
            else if (mark >=1 && countOfMarks != 2)
                {
                    sumOfMarks = sumOfMarks + mark;
                    average = sumOfMarks/(countOfMarks-1);
                }
        }
        while (mark != 0);
        System.out.print("Average: ");
        System.out.printf("%.2f",average);
        System.out.print(System.lineSeparator());
        System.out.println("Negative marks: " + fails);
    }

    //todo Task 6
    public void happyNumbers(){
        System.out.print("n: ");
        int n = scanner.nextInt();
            int square = 0;
            while (n>9)
            {
                while (n!=0)
                    {
                        int remain = n % 10;
                        square += Math.pow(remain,2);
                        n = n/10;
                    }
                    n=square;
                    square = 0;
            }
            if (n == 1)
                {
                    System.out.println("Happy number!");
                }
            else
                {
                    System.out.println("Sad number!");
                }
        }


    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}