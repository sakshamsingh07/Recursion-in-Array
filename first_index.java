import java.util.Scanner; 
public class first_index
{
    public static int fi(int []arr , int idx ,int x)
    {
        if (idx==arr.length)
        {
            return -1;
        }
        if (arr[idx]==x)
        {
            return idx;
        }
        return fi(arr ,idx+1,x);
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr= new int[n];
        for (int i =0; i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int x= scn.nextInt();
        int ans=fi(arr,0,x);
        System.out.println(ans);


    }
    
}
