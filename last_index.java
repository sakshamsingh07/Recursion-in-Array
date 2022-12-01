import java.util.Scanner; 
public class last_index 
{
    public static int li(int []arr,int idx, int x)
    {
        if(idx==arr.length)
        {
              return -1;
        }
        int recAns=li(arr,idx+1,x);
        if (recAns==-1)
        {
       
            if(arr[idx]==x)
       
            {
               return idx;
            }
            else
            {
                return recAns;
            }
        }
             else
            {
             return recAns;
            }
        
    }
    public static void main(String []args)
    {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []arr= new int[n];
        for(int i =0; i < arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int x= scn.nextInt();
        int ans=li(arr,0,x);
        System.out.println(ans);
    }
    
}
