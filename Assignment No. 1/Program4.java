// Relational operators

class Program4
{
    public static void main(String[]arg)
    {
        int a = 10;
        int b = 30;

        System.out.println("Value of a is : "+a);
        System.out.println("Value of b is : "+b);

        System.out.println("a > b is "+(a > b));
        System.out.println("a < b is "+(a < b));

        System.out.println("a <= b is "+(a <= b));
        System.out.println("a >= b is "+(a >= b));
        

        System.out.println("a == b is "+(a == b));
        System.out.println("a != b is "+(a >= b));
    }
}

/*
Test Case : 

    Value of a is : 10
    Value of b is : 30
    a > b is false
    a < b is true
    a <= b is true
    a >= b is false
    a == b is false
    a != b is false
*/