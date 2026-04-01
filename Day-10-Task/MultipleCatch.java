package Day10.Task;
import java.util.*;
public class MultipleCatch {
    public static void main(String [] args)
    {
        int[] arr = new int[5];
        try
        {
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The Error is: "+e);
        }
        catch(Exception e)
        {
            System.out.println("The Eroro is: "+e);
        }
    }
}
