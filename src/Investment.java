import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	double getCurrentValue(int afterHowManyMonth)
	{
		//return the current value of this investment taking
		//time and an average 8% yearly or 0.67% monthly return
		//over afterHowManyMonths number of months
		
		double value = 0;
		
		for(int i=1; i <= afterHowManyMonth; i ++)
		{
			for (Contribution a : theContributions)
			{
				if (i == (a).monthNumber)
				{
					value += a.amount;
				}
						
			}
			value *= 1.0067;
		}
		
		return value;
		
	}
	
	double getTotalContributions()
	{
		double total =0;
		
		for (Contribution i : theContributions)
		{
			total += i.amount;
		}
		
		return total;
	}
	
}
