import java.util.*;

class Spiral 
{
	public static void main(String[] args)
	{
		Scanner sc 	= new Scanner(System.in);
		System.out.println("Enter the matrix order:");
		int n 		= sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter the matrix elements:");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		printSpiral(arr, n, n);
	}
	public static void printSpiral(int[][] A,int r, int c)
	{
		int Top = 0, Bot = r-1, Left = 0, Right = c-1;
		int dir = 0; //0 for down 1 for right 2 for up 3 for left
		while(Top <= Bot && Left <= Right)
		{
			if(dir == 0)
			{
				for(int i=Top; i<=Bot; i++)
				{
						System.out.print(A[i][Left]+" ");
				}
				Left++;
				dir = 1;
			}
			else if(dir == 1)
			{
				for(int i=Left; i <= Right;i++)
				{
					System.out.print(A[Bot][i]+" ");
				}
				Bot--;
				dir = 2;
			}
			else if(dir == 2)
			{
				for(int i=Bot; i>=Top; i--)
				{
					System.out.print(A[i][Right]+" ");
				}
				Right--;
				dir = 3;
			}
			else if(dir == 3)
			{
				for(int i=Right;i>=Left;i--)
				{
					System.out.print(A[Top][i]+" ");
				}
				Top++;
				dir = 0;
			}
			
		}
	}
}