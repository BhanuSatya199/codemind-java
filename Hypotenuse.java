import java.util.Scanner;
public class Demo{
    public static void main(String[] args)
    {
        float a,b,p;
        double c;
        Scanner read=new Scanner(System.in);
        a=read.nextFloat();
        b=read.nextFloat();
        p=(a*a)+(b*b);
        c=Math.sqrt(p);
        System.out.printf("%.2f",c);
    }
}