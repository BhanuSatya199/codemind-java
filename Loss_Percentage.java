import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        int a,b;
        double c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=(a-b)*100.0/a;
        System.out.printf("%.2f",c);
    }
}