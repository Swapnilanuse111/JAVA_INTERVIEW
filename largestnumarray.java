class largestnumarray
{
    public static void main(String[]args)
    {
        int a[]={9,30,-30,33,50,90};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            System.out.println("Largest Number In array is"+max);
        }
    }
}