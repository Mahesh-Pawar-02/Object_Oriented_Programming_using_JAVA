// Even or Odd (if - else if )

public class Program7
{
    public static void main(String[]Arg)
    {
        int a = 90, b = 60;

        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);

        if(a > b)
        {
            System.out.println("a is larger than b");
        }
        else if (a < b)
        {
            System.out.println("a is smaller than b");
        }
        else
        {
            System.out.println("a and b are equal");
        }
    }
}

/*
TEST CASE : 

    Value of a is : 90
    Value of b is : 60
    a is larger than b
*/