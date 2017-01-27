/*
 Given a square matrix, find the longest path(no of steps) of 1s with choices of moves being either RIGHT or DOWN
 */

class LongestPath {

	int a[][] ={{1,0,0,0,0},
			 	{0,0,0,0,0},
			 	{0,1,1,0,0},
			 	{0,0,1,1,1},
			 	{0,1,0,0,0}};
	

	public static void main(String[] args) {
		LongestPath lp = new LongestPath();
		
		int n = 5, max = 0;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				int x = lp.getMax(i,j);
				if(x > max)
					max = x;
			}
		}
		System.out.println(max);
	}
	public int getMax(int R, int C)
	{
		int count = 0;
		if(R >= a.length || C >= a.length || a[R][C]==0) //5 is an invalid index for the matrix
			return 0;
		if(a[R][C] == 1)
			count = 1;
		
		count += Math.max(getMax(R+1, C),getMax(R, C+1));
		return count;
	}
}
