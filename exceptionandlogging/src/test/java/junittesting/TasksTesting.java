package junittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import taskone.CompoundInterest;
import taskone.SimpleInterest;
import tasktwo.ConstructionCost;

public class TasksTesting {
	@Test
	public void takonetestone() {
		CompoundInterest compoundinterestobj=new CompoundInterest();
		assertEquals(3144.47,compoundinterestobj.compoundInterestCalculation(5000.00,5.00,10.00,"annually"),0.01);
		assertEquals(1381.40,compoundinterestobj.compoundInterestCalculation(5000.00,5.00,10.00,"halfyearly"),0.01);
		assertEquals(512.50,compoundinterestobj.compoundInterestCalculation(5000.00,5.00,8.00,"quarterly"),0.1);
		assertEquals(0.0,compoundinterestobj.compoundInterestCalculation(5000.00,5.00,8.00,"anyname"),0.1);
	}
	@Test
	public void taskonetesttwo() {
		SimpleInterest simpleintersetobj=new SimpleInterest();
		assertEquals(100.00,simpleintersetobj.simpleInterestCalculation(100.00,10.00,10.00),0.1);
	}
	
	@Test
	public void tasktwotest() {
		ConstructionCost constructionCostObject=new ConstructionCost();
		
		double a=constructionCostObject.costCalculation(12.00,"standard");
		assertEquals(14400.00,a,0.1);
		assertEquals(18000.00,constructionCostObject.costCalculation(12.00,"above standard"),0.1);
		assertEquals(21600.00,constructionCostObject.costCalculation(12.00,"high standard"),0.1);
		assertEquals(30000.00,constructionCostObject.costCalculation(12.00,"AutomatedHome"),0.1);
		
	}


}
