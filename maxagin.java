public class maxagin {
    public static void main(String[]args)
    {
        int a[]={20,20,30,50,111,30303};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("the Maximmum element in the array is\n"+max);
    }
}
