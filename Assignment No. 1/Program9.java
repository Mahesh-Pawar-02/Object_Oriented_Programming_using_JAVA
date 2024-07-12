// Accept input (Character) from user

import java.util.*;

public class Program9
{
    public static void main(String[] Arg)
    {
        char ch;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character : ");
        ch = sc.next().charAt(0);

        System.out.println("Entered character is : "+ch);

        sc.close();
    }
}

/* 
TEST CASE :

INPUT  : Enter character : 10
OUTPUT : Entered character is : 10
*/