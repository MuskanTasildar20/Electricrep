/**
 * 
 * javadoc is used at class level
 * @version 1.0.1
 * @author muskan Tashildar
 * 
 *
 */
public class ElictricBilll {
	
		int num_units;
		double unit_cost;
		String acct_num, name;
		ElictricBilll(int num_units, String acct_num)
		{
		this.num_units = num_units;
		this.acct_num = acct_num;
		}
		/**
		 * This is a parametrized Constructorr
		 * <p> Num_unit stores the value for Number of Unit
		 * <p> unit_cost stores the value for Unit Of Cost
		 * <p> Acc_number this stores the value of Account Number
		 * <p> name store the value of Account holders Name
		 * 
		 */
		void displayBill()
		{
		double total_cost;
		//compute bill amount
		if (num_units>500)
		unit_cost = 2.5;
		else if (num_units<300 && num_units >200)
		unit_cost=1.5;

		else unit_cost=1.0;
		total_cost = num_units * unit_cost;
		System.out.println("number of units = " + num_units);
		System.out.println("unit cost = " + unit_cost);
		System.out.println("Total cost = " + total_cost);
		}
		/**
		 * <p>This is a method to display Bills
		 * <p> Display the total cost of electric Bill
		 * <p> This is the main method 
		 * @param args args give the value of the object
		 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		}
		}



