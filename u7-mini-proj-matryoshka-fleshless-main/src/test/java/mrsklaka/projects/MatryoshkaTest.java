package mrsklaka.projects;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MatryoshkaTest {
	@Test
	void testHowManyWearingBabushkas() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		Matryoshka three = new Matryoshka(two,"Natasha", java.awt.Color.RED, true);
		Matryoshka four = new Matryoshka(three,"Vladimir", java.awt.Color.BLACK, false);
		assertEquals(2,four.howManyWearingBabushkas());
	}

	@Test
	void testHowManyWearingBabushkas2() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		assertEquals(1,one.howManyWearingBabushkas());
	}

	@Test
	void testHowManyWearingBabushkas3() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, false);
		assertEquals(0,one.howManyWearingBabushkas());
	}
	@Test
	void testRedHeadCount() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		Matryoshka three = new Matryoshka(two,"Natasha", java.awt.Color.RED, true);
		Matryoshka four = new Matryoshka(three,"Vladimir", java.awt.Color.BLACK, false);
		assertEquals(2,four.redHeadCount());
	}
	@Test
	void testRedHeadCount2() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		assertEquals(1,two.redHeadCount());
	}
	@Test
	void testRedHeadCount3() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		assertEquals(0,one.redHeadCount());
	}
	@Test
	void testLastName() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		Matryoshka three = new Matryoshka(two,"Natasha", java.awt.Color.RED, true);
		Matryoshka four = new Matryoshka(three,"Vladimir", java.awt.Color.BLACK, false);
		assertEquals("Vladimir",four.lastName());

	}
	@Test
	void testLastName2() {
		Matryoshka one = new Matryoshka("Vladimir", java.awt.Color.BLACK, false);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		Matryoshka three = new Matryoshka(two,"Natasha", java.awt.Color.RED, true);
		Matryoshka four = new Matryoshka(three,"Tatiana", java.awt.Color.PINK, true);
		assertEquals("Vladimir",four.lastName());
	}
	@Test
	void testLastName3() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		assertEquals("Tatiana",one.lastName());
	}
}
