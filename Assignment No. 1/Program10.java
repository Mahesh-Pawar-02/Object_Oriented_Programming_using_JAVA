// Accept input (Character) from user

import java.util.*;

public class Program10
{
    public static void main(String[] Arg)
    {
        String str;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        str = sc.nextLine();
        System.out.println("Entered string is : "+str);

        sc.close();
    }
}

/* 
TEST CASE :

INPUT  : Enter first string : Mahesh Dinkar Pawar
OUTPUT : Entered string is : Mahesh Dinkar Pawar
*/