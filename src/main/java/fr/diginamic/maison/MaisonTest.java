package fr.diginamic.maison;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaisonTest {

	@Test
	public void testPieceNull() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		assertNull(maison.getPieces()[0]);
	}
	
	@Test
	public void testPieceNegative() {
		Maison maison = new Maison();
		Cuisine cuisine = new Cuisine(1, -200);
		maison.ajouterPiece(cuisine);
		assertNotNull(maison.getPieces()[0]);
	}
}
