package com.sircus.CompositionsPointsCartesiens;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a,b,c,d, result;
		
		
		JOptionPane.showMessageDialog(null, "**** Calcul de points cartesiens **** ");
		
		
		// ---------------------- Premier point cartesiens ------------------------
		JOptionPane.showMessageDialog(null, "Veuillez entrer les coordonnees du 1er point ");
		a = Double.parseDouble(JOptionPane.showInputDialog(null,"coordonnees X du 1er point :"));
		b = Double.parseDouble(JOptionPane.showInputDialog(null,"coordonnees Y du 1er point :"));
		
		Point2dim P1 = new Point2dim(a,b);
		
		
		// ---------------------- Deuxieme point cartesiens -----------------------
		
		JOptionPane.showMessageDialog(null, "Veuillez entrer les coordonnees du 2eme point ");
		c = Double.parseDouble(JOptionPane.showInputDialog(null,"coordonnees X du 2eme point"));
		d = Double.parseDouble(JOptionPane.showInputDialog(null,"coordonnees Y du 2eme point"));
	
		Point2dim P2 = new Point2dim(c,d);
		
		
		// -------------- Resultat de la distance entre les 2 points --------------

		result = Math.sqrt((Math.pow(P2.getX()- P1.getX(), 2))+Math.pow(P2.getY()- P1.getY(), 2));
		JOptionPane.showMessageDialog(null, "La distance entre les deux points est = "+result);

	}

}
