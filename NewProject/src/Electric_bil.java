/**
 * javadoc is done at class level
 * @author muskan tasildar
 * @version 1.0.0
 */
public class Electric_bil {
	
		int num_units;
		double unit_cost;
		String acct_num, name;
		Electric_bil(int num_units, String acct_num)
		{
		this.num_units = num_units;
		this.acct_num = acct_num;
		}
		/**
		 * This is a parameterized constructor
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
		 * This is the main method
		 * @param args args is the abject
		 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		}
		}



