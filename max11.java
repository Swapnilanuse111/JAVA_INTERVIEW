public class max11 {
    public static void main(String[]args)
    {
        int a[]={2200,20,30,7676,499999999,22};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("The maximumum number int the array is \n"+max);
    }
}
