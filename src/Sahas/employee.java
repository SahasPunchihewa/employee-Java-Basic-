package Sahas;
import java.util.*;
public class employee
{
    Scanner sc;
    String empno,name;
    int hw,hr,bs,gw,bonus,ns;
    public employee()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter Employee Number : ");
        empno=sc.nextLine();
        System.out.println("Enter Employee Name : ");
        name=sc.nextLine();
        System.out.println("Enter Houres Worked : ");
        hw=sc.nextInt();
        System.out.println("Enter Hourly Rate : ");
        hr=sc.nextInt();
        System.out.println("Enter Basic Salary : ");
        bs=sc.nextInt();
        gw=hw*hr;
        if(hw>100)
        {
            bonus=20000;
        }
        else
        {
            bonus=10000;
        }
        ns= gw+bonus+bs;
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Employee Number : "+empno);
        System.out.println("Employee Name : "+name);
        System.out.println("Net Salary : "+ns);

    }
    public static void main(String args[])
    {
        new employee();
    }
}
