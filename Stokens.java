
/**
 * Write a description of class StringTokenizer here.
 * 
 * @author (Yaswanth) 
 * @version (08-08-2015)
 */
import java.util.*;
public class Stokens
{

   
    public static void main(String args[])
    {
         int c=0,c1=0;
       StringTokenizer s1 = new StringTokenizer("A quick brown fox jumps over the lazy dog");
       System.out.println(s1.countTokens());
        while(s1.hasMoreTokens())
       {c++;
        if (c==3||c==5)
           System.out.println(s1.nextToken());
        else
        s1.nextToken();
        }
       
       
    }
    
}
