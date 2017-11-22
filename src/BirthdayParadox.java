import java.util.Random;

public class BirthdayParadox {
	public static void main(String[] args)
	{
		boolean dup = false;
		for(int n = 5; n < 101; n +=5) //Increasing by 5
		{
			Random rand = new Random();
			double pairs = 0;
			int array[] = new int [n];
			for(int trial = 1; trial < 100000; trial++) // 100,000 trials
			{
				for(int j = 0; j < n; j++) //assigning random numbers to an array
				{
					array[j] = rand.nextInt(366) + 1;					
				}

				for(int a = 0; a < array.length; a++)//Two for loops check for duplicates
				{
					for(int b = a + 1; b < array.length; b++)
					{
						if(array[a] == array[b])//If there is a match
						{
							pairs++;
							dup = true;//Then add a pair to the count and exit loop
							break;
						}
					}
					if(dup){
						dup = false;
						break;
					}
				}
			}
			System.out.println("The probability that two people in a room will have the same birthday is " + pairs / 100000 * 100 + "% when you have " + n + " people in a room");
		}
	}
}