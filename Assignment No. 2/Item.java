// Item class example

public class Item
{
    int iNo = 0;
    String Name, Dname;
    float Price;
    static int cnt = 0;

    Item()
    {
        cnt++;
    }

    Item(int iNo, String Name, String Dname, float Price)
    {
        this.iNo = iNo;
        this.Name = Name;
        this.Price = Price;
    }

    void Display()
    {
        System.out.println("Id is = "+this.iNo);
        System.out.println("Item name is = "+this.Name);
        System.out.println("Department name is = "+this.Dname);
        System.out.println("Price is = "+this.Price);
        System.out.println("Number of object is created = "+cnt);
    }

    public static void main(String[] Arg)
    {
        Item i = new Item();
        i.Display();
        System.out.println("---------------------------------------------");
        Item i1 = new Item(123, "Pen", "Stationary",100);
        i1.Display();
    }
}

/* 
TEST CASE :

Id is = 0
Item name is = null
Department name is = null
Price is = 0.0
Number of object is created = 1
---------------------------------------------
Id is = 123
Item name is = Pen
Department name is = null
Price is = 100.0
Number of object is created = 1

*/