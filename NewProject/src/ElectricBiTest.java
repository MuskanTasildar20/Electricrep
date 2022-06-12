import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElectricBiTest {
	static ElectricBi el1;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		el1=new ElectricBi(1500,"Muskan");
		
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
		System.out.println("Here it starts");
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("Here it end");
	}

	@Test
	void testdisplayBill() {
		char result=el1.displayBill();
		assertTrue('M',1500);
		
	}

	private void assertTrue(char c, int i) {
		// TODO Auto-generated method stub
		
	}

}
