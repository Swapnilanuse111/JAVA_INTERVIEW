class abcc{
    public satatic void main(String args[])
    {
        try{
            int a=10,b=0;
            int c=a/b;
            System.out.println("Result: "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
}