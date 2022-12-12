package fr.uvsq.cprog.roguelike;

public enum WorldComponents {
  MUR(" M "),
  SOL(" . "),
  BORDURE(" # "),
  SORTIE(" [] ")

  ;
  String componentAsciiChar ;
  WorldComponents(String componentAsciiChar){
    this.componentAsciiChar = componentAsciiChar ;
  }

  @Override
  public String toString(){
    return this.componentAsciiChar;
  }

  public String getComponentAsciiChar() {
    return componentAsciiChar;
  }

  public void setComponentAsciiChar(String componentAsciiChar) {
    this.componentAsciiChar = componentAsciiChar;
  }

}
