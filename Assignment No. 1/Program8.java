// Accept input (int) from user

import java.util.*;

public class Program8
{
    public static void main(String[] Arg)
    {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        n = sc.nextInt();

        System.out.println("Entered Number is : "+n);

        sc.close();
    }
}

/*
TEST CASE :

INPUT  : Enter Number : 10
OUTPUT : Entered Number is : 10

*/