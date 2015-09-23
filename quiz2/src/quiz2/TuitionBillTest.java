package quiz2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TuitionBillTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertFalse("Assertion didnt work",TuitionBill.getmonthlypayment(10000, 4,0.1)==307.5626736111111);
	
		assertFalse("Assertion didnt work",TuitionBill.getTotalTuitionFee(10000, 4,0.1)==14641.0);}

	
		// TODO Auto-generated method stu
	}


