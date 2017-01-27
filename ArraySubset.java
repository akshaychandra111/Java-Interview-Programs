/*Program to Reverse an array in subset of N.
Example:
input: Array = [1,2,3,4,5,6,7,8,9,10], N = 3
output: [3,2,1,6,5,4,9,8,7,10]

1. First Line takes the size of array n 
2. Second line takes the subset s
3. Third line onwards array elements

Note: if subset 's' is greater than n print -1

Example
10
3 
1
2
3
4
5
6
7
8
9
10
output 
3
2
1
6
5
4
9
8
7
10
*/

import java.util.*;
class ArraySubset
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int sz 	   = sc.nextInt();
        int sub    = sc.nextInt();
        if(sub > sz)
        { 
        	System.out.print(-1); 
        	System.exit(1); 
        }
        int a[]   = new int [sz];
        for(int i=0; i<sz; i++)
            a[i] = sc.nextInt();
        sc.close();  
        
        int[] r    = new int[sz];
        int index  = 0;
        int y      = 0;
        for(int i=0; i<sz; i++)
        {
            //int x = sub+i;
            if( (i+1) % sub == 0)
            {
                int x=i;
                for(int j=0;j<sub;j++)
                {
                    r[index++] = a[x--];
                }
                y  =  i;
            }
            else if( i == (sz-1))
            { 
            	for(int j=y+1; j<sz; j++) 
            		r[index++] = a[j]; 
            }
        }
        
        for(int x:r)
        {
            System.out.println(x);
        }
        
    }
}