package fr.diginamic.enumerations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeasonTest {

	@Test
	public void testExistingLabel() {
		Season season = Season.valueOfLabel("Spring");
		assertEquals(Season.SPRING, season);
	}

	@Test
	public void testNonExistingLabel() {
		Season season = Season.valueOfLabel("Springs");
		assertNull(season);
	}

	@Test
	public void testLabelNull() {
		Season season = Season.valueOfLabel(null);
		assertNull(season);
	}
}
