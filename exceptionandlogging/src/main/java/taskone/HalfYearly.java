package taskone;

public class HalfYearly implements Period {
	public double calculation(double amount,double timeperiod)
	{
		return Math.pow(amount,timeperiod/2);
	}


}
