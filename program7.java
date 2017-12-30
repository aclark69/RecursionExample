import java.util.*;

public class program7 {

	public static void main(String[] args)

	{

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter an integer with 2-10 digits");

		int n = keyboard.nextInt();

		

		System.out.println("Enter a digit to check for number of occurences");

		int d = keyboard.nextInt();

		

		

		//frequencyCount();

		int x = frequencyCount(n, d);
		System.out.println(x);
	}

	public static int frequencyCount(int n, int d)

	{

		if(n<10)

		{

			if(n==d)

				return 1;

			else

				return 0;

		}

		else

		{

			return frequencyCount((n/10),d) +

			frequencyCount((n%10), d);

		}

	}



}


