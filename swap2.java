public class swap2 {
    public static void main(String[]args)
    {
        int a=20,b=30;
        System.out.println("Befor Swapping Two number\t"+a+" "+b);

        a=a+b;//20+30=50
        b=a-b;//50-30=20
        a=a-b;//50-20=30

        System.out.println("After Swapping two  numbers\t "+a+" "+b);


    }
}
