package test;

import static org.junit.Assert.*;

import org.escoladeltreball.helloworld.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

	private static Main main;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.print("in setUpBeforeClass method");
		main = new Main();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.print("in tearDownAfterClass method");
		main = null;
	}

	@Before
	public void setUp() throws Exception {
		System.out.print("in setUp method");
		main = new Main();
	}

	@After
	public void tearDown() throws Exception {
		System.out.print("in tearDown method");
		main = new Main();
	}

	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] {1, 2, 3}));
		assertEquals(0, main.findSmallest(new int[] {4, 0, 1, 2, 3}));
		assertEquals(-2, main.findSmallest(new int[] {1, -2, 3}));
		assertEquals(3, main.findSmallest(new int[] {3}));
		assertEquals(1, main.findSmallest(new int[] {1, 1, 1}));
	}
	
	
	@Test
	public final void testSum() {
		assertEquals(6, main.sum(new int[] {1, 2, 3}));
		assertEquals(2, main.sum(new int[] {1, -2, 3}));
	}

	@Test
	public final void testFrequency() {
		assertEquals(0, main.frequency(new int[] {1, 2, 3}, 0));
	}

	@Test
	public final void testFrequencyPercentage() {
		int[] values = {3, 4, 3, 5, 1, 2, 3, 0};
		assertEquals(37.5, main.frequencyPercentage(values, 3), 1e-4);
	}

	public final void testMerge() {
		int[] values = {3, 7, 9, 10, 13, 21};
		int[] valuees = {11};
		assertEquals(3, 7, 9, 10, 11, 13, 21, main.merge(values, n));
	}
}
