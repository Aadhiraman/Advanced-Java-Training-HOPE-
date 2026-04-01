
import java.util.*;
public class ExceptionArrIndxOutofBounds {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0;i<=size;i++)
            {
                arr[i] = sc.nextInt();
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The Exception is: "+e.getMessage());
        }
    }
}
