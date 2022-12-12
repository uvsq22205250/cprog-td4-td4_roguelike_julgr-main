package fr.uvsq.cprog.roguelike;

public class Joueur extends Personnage{

  private int points;
  private Arme arme ;

  public Joueur(char asciiChar, int posX, int posY, int PV, int points, Arme arme) {
    super(asciiChar, posX, posY, PV);
    this.points = points ;
    this.arme = arme ;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public Arme getArme() {
    return arme;
  }

  public void setArme(Arme arme) {
    this.arme = arme;
  }

  public void attaquer(Monstre monstre, Arme arme){
    monstre.setPV(monstre.getPV()- arme.getDamage());
  }
}
