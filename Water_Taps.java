import java.util.Scanner;
public class Demo{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=(a*b)/(a+b);
        System.out.println(c);
        
    }
}