// Logical operators

public class Program5 
{
    public static void main(String[]Arg)
    {
        int a = 35, b = 25;

        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);

        System.out.println("Logical AND && result is "+((a % 5 == 0) && (a % 7 == 0)));
        System.out.println("Logical OR || result is :"+((b % 7 == 0) || (b % 3 == 0)));

        System.out.println("Logical NOT ! result is "+(!(a > b)));
    }
    
}

/*
Test case : 

    Value of a is :35
    Value of b is :25
    Logical AND && result is true
    Logical OR || result is :false
    Logical NOT ! result is false
*/