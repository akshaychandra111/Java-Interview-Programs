import java.util.*;
public class TowersOfHanoi {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int i 		= sc.nextInt();
		sc.close();
		toh(i, "Source", "Buffer", "Destination");
	}
	public static void toh(int n, String s, String b, String d)
	{
		if(n >= 1)
		{	
			toh(n-1, s, d, b);
			System.out.println("Move "+n+" block from "+s+" and put it in "+d);
			toh(n-1, b, s, d);
		}
		
	}
}