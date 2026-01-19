public class pal {
    public static void main(String[]args)
    {
        String str="MOM";
        
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            str=str+rev.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println(str+"Given String is palindrome");
        }
        else
        {
            System.out.println(str+"Given String is not palindrome");
        }
    }
}
