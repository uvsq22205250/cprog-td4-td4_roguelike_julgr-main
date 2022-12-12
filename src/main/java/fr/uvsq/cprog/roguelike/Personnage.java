package fr.uvsq.cprog.roguelike;

public class Personnage {
  private int posX, posY, PV ;
  private char asciiChar;

  public Personnage(char asciiChar, int posX, int posY, int PV){
    this.asciiChar = asciiChar;
    this.posX = posX ;
    this.posY = posY ;
    this.PV = PV ;
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  public int getPV() {
    return PV;
  }

  public void setPV(int PV) {
    this.PV = PV;
  }

  public char getAsciiChar() {
    return asciiChar;
  }

  public void setAsciiChar(char asciiChar) {
    this.asciiChar = asciiChar;
  }

  public void move(int dx, int dy){
    this.setPosX(this.posX + dx);
    this.setPosY(this.posY + dy);
  }

  @Override
  public String toString(){
    return String.valueOf(this.asciiChar);
  }
}
