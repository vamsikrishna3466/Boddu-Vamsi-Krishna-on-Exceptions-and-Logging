package taskone;

public class Quaterly implements Period {
	public double calculation(double amount,double timeperiod)
	{
		return Math.pow(amount,timeperiod/4);
	}


}
