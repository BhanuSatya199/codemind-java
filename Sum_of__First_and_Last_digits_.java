import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        int num;
        Scanner read=new Scanner(System.in);
        num=read.nextInt();
        int r=num%10;
        while(num>9)
        {
            num=num/10;
        }
        System.out.println(r+num);
        } 
}