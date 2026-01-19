import java.util.Scanner;

public class rev1
{
    public static void main(String[]args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your String");

            String str=sc.next();
            String rev="";
            int len=str.length();
            for(int i=len-1;i>=0;i--)
            {
               rev=rev+str.charAt(i);
            }
             System.out.println(rev);
        }

    }    
}
