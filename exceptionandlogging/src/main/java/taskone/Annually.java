package taskone;

public class Annually implements Period {
	public double calculation(double amount,double timeperiod)
	{
		return Math.pow(amount,(int)timeperiod);
	}

}
