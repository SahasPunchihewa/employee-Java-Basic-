package Sahas;

public class oddno
{
    int sum=0;
    public oddno()
    {
        for(int i=49;i>30;i-=2)
        {
            sum=sum+i;
            System.out.println(i);
        }
        System.out.println("Sum = "+sum);
    }
    public static void main(String args[])
    {
        new oddno();
    }
}
