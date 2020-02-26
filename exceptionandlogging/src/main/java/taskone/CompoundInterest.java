
package taskone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CompoundInterest {
	private static final Logger LOGGER=LogManager.getLogger(CompoundInterest.class);
	public double compoundInterestCalculation(double princple,double rateofinterest,
			double timeperiod,String type)
	{
		double amount=0.0;
		Period periodTypeObject=null;
		double value=(1+(rateofinterest)/100.00);
		if(type.equalsIgnoreCase("Annually"))
				{
			periodTypeObject=new Annually(); 
				}
		else if(type.equalsIgnoreCase("halfyearly"))
		{
	periodTypeObject=new HalfYearly(); 
		}
		else if(type.equalsIgnoreCase("quarterly"))
		{
	periodTypeObject=new Quaterly(); 
		}
		else
		{
			LOGGER.debug("The compound interest for principal {} for {} at {} rate of Interest is {} ",princple,type,rateofinterest,amount);
			return 0.0;
		}
		amount=periodTypeObject.calculation(value, timeperiod);
		LOGGER.debug("The compound interest for principal {} for {} at {} rate of Interest is {} ",princple,type,rateofinterest,amount);
		return (amount*princple-princple);
	}
}
