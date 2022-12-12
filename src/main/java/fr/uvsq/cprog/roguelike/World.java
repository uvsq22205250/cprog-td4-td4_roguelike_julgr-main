package fr.uvsq.cprog.roguelike;

import java.util.ArrayList;

public class World {
  private Joueur joueur ;
  private ArrayList<Monstre> monstres ;
  private ArrayList<Arme> armes ;
  private ArrayList<WorldComponents> worldComponents;
  private final int worldWidth = 20 ;
  private final int  worldHeight = 20 ;
  private String[][] map;
  private String mapAsString ;

  private int level ;

  private int nbreMur ;


  public World(Joueur joueur, int level) {
    this.joueur = joueur;
    this.map = new String[this.worldHeight][this.worldWidth];
    this.monstres = new ArrayList<>();
    this.armes = new ArrayList<>();
    this.level = level ;
  }

  public World(){

  }

  public Joueur getJoueur() {
    return joueur;
  }

  public void setJoueur(Joueur joueur) {
    this.joueur = joueur;
  }

  public ArrayList<Monstre> getMonstres() {
    return monstres;
  }

  public void setMonstres(ArrayList<Monstre> monstres) {
    this.monstres = monstres;
  }

  public ArrayList<Arme> getArmes() {
    return armes;
  }

  public void setArmes(ArrayList<Arme> armes) {
    this.armes = armes;
  }

  public ArrayList<WorldComponents> getWorldComponents() {
    return worldComponents;
  }

  public void setWorldComponents(ArrayList<WorldComponents> worldComponents) {
    this.worldComponents = worldComponents;
  }

  public int getWorldWidth() {
    return worldWidth;
  }

  public int getWorldHeight() {
    return worldHeight;
  }

  public String[][] getMap() {
    return map;
  }

  public void setMap(String[][] map) {
    this.map = map;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  private String setMapAsString(){
    StringBuffer temp = new StringBuffer() ;
    for(int i = 0 ; i< this.worldHeight ; i++){
      for(int j = 0 ; j < this.worldWidth ; j++){
          temp.append(this.map[i][j]);
      }
      temp.append("\n");
    }
    this.mapAsString =  String.valueOf(temp);
    return mapAsString ;

}

  public int getNbreMur() {
    return nbreMur;
  }

  public void setNbreMur(int nbreMur) {
    this.nbreMur = nbreMur;
  }

  @Override
  public String toString(){
    return this.mapAsString;
}
}
