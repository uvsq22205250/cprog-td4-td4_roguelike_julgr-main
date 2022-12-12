package fr.uvsq.cprog.roguelike;

public enum Arme {
  BATON(" ! ", 1),
  HACHE(" ? ", 2),
  PISTOLET(" > ", 3);

  String asciiChar;
  int damage ;
  Arme(String asciiChar, int damage){
    this.asciiChar = asciiChar;
    this.damage  = damage ;
  }
  @Override
  public String toString(){
    return this.asciiChar;
  }
  public int getDamage(){
    return this.damage ;
  }
}
