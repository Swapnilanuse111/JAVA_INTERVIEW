public class maxiarray {
    public static void main(String[]args)
    {
        int a[]={40,20,43,62,50,55};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("The Maximum Element is in the array is "+max);
    }
}
