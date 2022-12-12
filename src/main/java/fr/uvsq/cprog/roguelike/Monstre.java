package fr.uvsq.cprog.roguelike;

public class Monstre extends Personnage{

  private int damage;


  public Monstre(char asciiChar, int posX, int posY, int PV, int damage) {
    super(asciiChar, posX, posY, PV);
    this.damage = damage ;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void attaquer(Joueur joueur){
    joueur.setPV(joueur.getPV() - this.damage);
  }
}
