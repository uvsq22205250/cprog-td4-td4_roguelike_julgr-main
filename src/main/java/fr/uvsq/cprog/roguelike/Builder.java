package fr.uvsq.cprog.roguelike;

import java.util.ArrayList;

public interface Builder {

  void reset();
  void initMapBordure();
  void initMapMur() ;

  void addJoueur(Joueur joueur) ;
  void addMonstres(ArrayList<Monstre> monstres);


}
