import java.util.Scanner;
public class display_array
{
    public static void disarr(int arr[],int idx)
    {
        if(arr.length==idx)
        {
             return;
        }
        System.out.println(arr[idx]);
        disarr(arr,idx+1);
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int []arr =  new int[n];
        for (int i=0;i<arr.length;i++)
        {
           arr[i]=scn.nextInt();
        }
        disarr(arr,0);
    }
    
}
