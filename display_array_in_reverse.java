import java .util.Scanner; 
public class display_array_in_reverse
{
    public static void revArr(int arr[],int idx)
    {
        if (arr.length==idx)
        {
           return;
        }
        revArr(arr,idx+1);
        
        System.out.println(arr[idx]);
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int [] arr= new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println("reverse is");
        revArr(arr,0);
        

    }
    
}
