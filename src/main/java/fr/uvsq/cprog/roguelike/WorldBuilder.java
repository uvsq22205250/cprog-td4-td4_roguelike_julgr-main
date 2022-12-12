package fr.uvsq.cprog.roguelike;
import java.util.ArrayList;

public class WorldBuilder implements Builder{
  private World world ;

  public WorldBuilder(){
    this.reset();
  }


  @Override
  public void reset() {
    this.world = new World();
  }

  @Override
  public void initMapBordure() {

    String[][] tempCarte = this.world.getMap();
    for(int i = 0 ; i < this.world.getWorldHeight() ; i++){
      for(int j = 0 ; j <this.world.getWorldWidth() ; j++){
        if(i == 0 || i == 19 || j == 0 || j == 19){
          tempCarte[i][j] = WorldComponents.BORDURE.toString();

        }
      }
    }
    this.world.setMap(tempCarte);

  }

  @Override
  public void initMapMur() {
    int nbreMurs = (int)(this.world.getWorldHeight() * this.world.getWorldWidth() * 0.2) ;
    this.world.setNbreMur(nbreMurs);
    String[][] tempCarte = this.world.getMap();
    int murCompteur = 0 ;
    while(murCompteur < nbreMurs){
      int randomMurPoistionX = (int)Math.random()*18 + 1 ;
      int randomMurPoistionY = (int)Math.random()*18 + 1 ;
      if(isItValidPosition(tempCarte, randomMurPoistionX, randomMurPoistionX)){
        tempCarte[randomMurPoistionX][randomMurPoistionY] = WorldComponents.MUR.toString() ;
        murCompteur ++ ;
      }

    }
    this.world.setMap(tempCarte);
  }

  @Override
  public void addJoueur(Joueur joueur) {

  }

  @Override
  public void addMonstres(ArrayList<Monstre> monstres) {

  }

  private static boolean isItValidPosition(String[][]carte, int i , int j ){
    if( ! (carte[i][j] == null) ){
      return  false;
    }
    return  true ;
  }
}
