package uvsq.pglp_3_3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testConstructeurDynamiqueRobot() {
			DynamiqueRobot rb=new DynamiqueRobot(1,5);
			assert(rb.orientation==1 && rb.position==1);		
	}
	
	@Test
	public void testConstructeurStatiqueRobot() {
			StatiqueRobot rb=new StatiqueRobot(1,5);
			assert(rb.orientation==1 && rb.position==1);		
	}
	@Test
	public void testConstructeurDynamiqueOrientientation() {
			DynamiqueRobot rb=new DynamiqueRobot(5,5);
			assert(rb.orientation==1 && rb.position==5);		
	}
	@Test
	public void testConstructeurStatiqueOrientation() {
			DynamiqueRobot rb=new DynamiqueRobot(6,5);
			assert(rb.orientation==1 && rb.position==6);		
	}
	
	
}
