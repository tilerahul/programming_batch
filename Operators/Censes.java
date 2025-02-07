class Censes
{
	public static void main(String args[])
	{
		long curPopulation = 312032486;
		final long fiveYearSeconds = 365*24*60*60*5;

		long totalBirth = fiveYearSeconds/7;
		long totalDeath = fiveYearSeconds/13;
		long totalImmigrant = fiveYearSeconds/45;

		long newPopulation = curPopulation + totalBirth - totalDeath + totalImmigrant;

		System.out.println("Population after five year : "+newPopulation);
	}
}