package UseOfContructor;

public class Mobile 
{
	private String name;
	private double cost;
	private String plateform;
	
	
	Mobile()
	{
		name = "raju";
		plateform = "railway station";
	}
	
	Mobile(String C_name,double C_cost,String C_plateform)
	{
	    String name = C_name;
		double cost = C_cost;
		String plateform = C_plateform;
	
		
		System.out.println("Company name:"+name);
		System.out.println("price of mobile phone:"+cost);
		System.out.println("Operating System in Mobile phone:"+plateform);
	}
}	
