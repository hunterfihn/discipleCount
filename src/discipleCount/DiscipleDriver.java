package discipleCount;

public class DiscipleDriver 
{

	public static void main(String[] args) 
	{
		int result = trainDisciples();
		System.out.println("Years: "+ result);
		System.out.println("");
		int fiftyYears = disciplesUnder50();
		System.out.println("The closest whole number of disciples is 3, and would achieve 7.7 Billion in: " + fiftyYears + " years.");

	}
	
	public static int trainDisciples()
	{
		long disciples = 13L;
		long pop = 7700000000L;
		int years = 0;
		System.out.println("Year: " + years + " / # of Disciples: " + disciples);
		
		while(disciples <= pop)
		{
			
			disciples = disciples * 3;
			years = years + 3;
			System.out.println("Year: " + years + " / # of Disciples: " + disciples);

		}
		
		return years;
	}
	
	public static int disciplesUnder50()
	{
		int years2 = 0;
		long disciples2 = 13L;
		long pop2 = 7700000000L;
		while(years2 < 50 && disciples2 <= pop2)
		{
			
			disciples2 = disciples2 * 4;
			years2 = years2 + 3;
			//System.out.println(disciples2);
		}
		return years2;
	}

}

