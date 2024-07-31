import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        int a,b,c,res;
        Scanner read=new Scanner(System.in);
        a=read.nextInt();
        b=read.nextInt();
        c=read.nextInt();
        res=2*(a+b)*c;
        System.out.println(res);
    }
}