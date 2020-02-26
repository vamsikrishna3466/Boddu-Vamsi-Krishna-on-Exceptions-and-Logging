package taskone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	private static final Logger LOGGER=LogManager.getLogger(SimpleInterest.class);
	public double simpleInterestCalculation(double princple,double rateofinterest,
			double timeperiod)
	{
		double simpleinterest;
		
		simpleinterest=((princple)*(timeperiod)*(rateofinterest))/100;
		LOGGER.debug("The Simple interest for principal {} at {} rate of Interest is {} ",princple,rateofinterest,simpleinterest);
		return simpleinterest;
	}

}
