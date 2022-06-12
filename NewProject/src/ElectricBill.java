
public class ElectricBill extends Accountholder {
		public static final String NUMBER_OF_UNITS_no = "number of units = ";
		public double total;
		ElectricBill(int num_units, String acct_num)
		{
		super();
		this.num_units = num_units;
		this.acct_num = acct_num;
		}
		void displayBill()
		{
		//compute bill amount
		Computecost();
		total = num_units * unit_cost;
		System.out.println(NUMBER_OF_UNITS_no + num_units);
		System.out.println("unit cost = " + unit_cost);
		System.out.println("Total cost = " + total);
		}
		private void Computecost() {
			boolean bcategory1 = num_units>500;
			if (bcategory1)
			unit_cost = 2.5;
			else {
				boolean bcategory2 = num_units >200;
				if (num_units<300 && bcategory2)
				unit_cost=1.5;

				else unit_cost=1.0;
			}
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		}
		}



