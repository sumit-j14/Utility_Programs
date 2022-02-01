//Finds in O(1) whether prime or not
// N log( log (n)) time complexity approximately equal to N
public class SieveOfEratosthenes {
	static boolean sieveOfEratosthenes()
	{
		int n=1000000;
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++)
		{
			if (prime[p] == true)
			{
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}
        //querries
		int querry=102;
		return prime[querry];
	}

	public static void main(String args[])
	{
	boolean answer=sieveOfEratosthenes();
	System.out.println(answer);
	}
}
