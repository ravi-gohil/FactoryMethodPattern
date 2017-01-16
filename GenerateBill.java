import java.io.*;
public class GenerateBill {
	public static void main(String args[]) throws IOException{
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the plan name for which you want to Generate Bill :");
		System.out.println("1 for Domestic \n2 for Commercial \n3 for Institutional");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = null;
		switch (br.readLine()){
			case "1": 
				planName = "domestic";
				break;
			case "2": 
				planName = "commercial";
				break;
			case "3": 
				planName = "Institutional";
				break;
			default :
				System.out.println("Wrong Input");
				System.exit(0);

		}
		
		System.out.println("Enter the number of Unit :");
		int units =Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		System.out.println("Bill amount for the plan "+planName+" of units "+units+" is :");
		p.getRate();
		p.calculateBill(units);
	}
}
