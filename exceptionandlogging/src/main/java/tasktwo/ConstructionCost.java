package tasktwo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
	private static final Logger LOGGER=LogManager.getLogger(ConstructionCost.class);
	public  double costCalculation(double area,String material)
	{
		
		Cost costObject;
		if(material.equalsIgnoreCase("standard"))
		{
			costObject=new StandardMaterial();
		}
		else if(material.equalsIgnoreCase("above standard"))
		{
			costObject=new AboveStandardMaterial();
		}
		else if(material.equalsIgnoreCase("high standard"))
		{
			costObject=new HighStandardMaterial();
		}
		else
		{
			costObject=new AutomatedHome();
		}
		double materialcost=costObject.materialCostCalculation();
		LOGGER.debug("The Total Material cost for Area {} of materialtype {} is {}",area,material,materialcost);
		return (materialcost*area);
	}

}
