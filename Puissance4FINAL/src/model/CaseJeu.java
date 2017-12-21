package model;

public class CaseJeu  {
 private char couleur; // declare la couleur
 
 /**
  * Constructeur de CaseJeu
  */
 public CaseJeu() { 
  this.couleur = 'V'; // une case du jeu doit etre rempli par une couleur 
  					  // simplifier 
 }
 
 /**
  * verifie si la case est vide
  * @return vrai si case est vide, faux sinon
  */
 public boolean caseVide(){
  return this.couleur == 'V';  
 }

 /**
  * @return la couleur de la case
  */
 public char getCouleur() { // getter 
  return this.couleur;
 }
 
 /**
  * @param couleur a inserer dans la case
  */
 public void setCouleur(char couleur) { // setter
  this.couleur = couleur;
 }
}