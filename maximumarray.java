public class maximumarray 
{
    public static void main (String []args)
    {
        int arr[]={50,40,20,30,60};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is: "+max);
    }    
}
