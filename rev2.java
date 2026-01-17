public class rev2 {
    public static void main(String[]args)
    {
        String Org="MOM";
        
        String rev="";

        int len=Org.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+Org.charAt(i);
        }
        if(rev.equals(Org))
        {
            System.out.println(Org+"\nString Is palindrome");
        }
        else{
            System.out.println(Org+"\nString Is Not Palindrome");
        }
  
    }
}
