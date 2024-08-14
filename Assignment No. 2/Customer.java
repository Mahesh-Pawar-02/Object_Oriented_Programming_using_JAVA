// Number : even / odd / pssitive / negative

import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Customer
{
    int Cust_Id = 0;
    int iNo = 0;
    int iCnt = 0;
    String Name, Cust_No, Address;

    static void search(String Cust_No, Customer Arg[])
    {
        int iCnt = 0;
        int flag = 0;

        for(iCnt = 0; iCnt < Arg.length; iCnt++)
        {
            if(Cust_No.equals(Arg[iCnt].Cust_No))
            {
                Arg[iCnt].Display();
                flag = 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Record not found...!");
        }
    }

    void Display()
        {
            System.out.println("Customer id is = "+Cust_Id);
            System.out.println("Customer name is = "+Name);
            System.out.println("Customer address is = "+Address);
            System.out.println("Contact number is = "+Cust_No);
        }
    
    public static void main(String Arg[])
    {
        int No = 0;
        int iCnt = 0;
        String number;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many customer you want");
        No = sc.nextInt();

        Customer c[] = new Customer[No];
        for(iCnt = 0; iCnt < No; iCnt++)
        {
            c[iCnt] = new Customer();

            System.out.println("Enter the Customer ID");
            c[iCnt].Cust_Id = sc.nextInt();

            System.out.println("Enter the Customer name");
            c[iCnt].Name = sc.next();

            System.out.println("Enter the Customer address");
            c[iCnt].Address = sc.next();
            
            System.out.println("Enter the contact number");
            c[iCnt].Cust_No = sc.next();
        }

        System.out.println("*************Customer Information*************");
        for(iCnt = 0; iCnt < No; iCnt++)
        {
            c[iCnt].Display();
        }
        System.err.println("Enter the number which you want to search");
        number = sc.next();
        search(number, c);
}
}

/* 
TEST CASE :

INPUT  : javac Customer.java
         java Number 5
OUTPUT : 
         5 is positive number.
         5 is odd number.
*/