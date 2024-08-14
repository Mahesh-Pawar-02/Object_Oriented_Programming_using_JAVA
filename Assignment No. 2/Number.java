// Number : even / odd / pssitive / negative

class Number
{
    private int No;
    Number()
    {
        No = 0;
    }
    Number(int No)
    {
        this.No = No;
    }

    public void is_positive(int x)
    {
        if(x > 0)
        {
            System.out.println(x+" is positive number.");
        }
    }
    public void is_negative(int x)
    {
        if(x < 0)
        {
            System.out.println(x+" is negative number.");
        }
    }
    public void is_even(int x)
    {
        if(x % 2 == 0)
        {
            System.out.println(x+" is even number.");
        }
    }
    public void is_odd(int x)
    {
        if(x % 2 != 0)
        {
            System.out.println(x+" is odd number.");
        }
    }
    public static void main(String Arg[])
    {
        int No = Integer.parseInt(Arg[0]);
        Number Num = new Number();
        Num.is_positive(No);
        Num.is_negative(No);
        Num.is_even(No);
        Num.is_odd(No);
    }
}

/* 
TEST CASE :

INPUT  : javac Number.java
         java Number 5
OUTPUT : 
         5 is positive number.
         5 is odd number.
*/