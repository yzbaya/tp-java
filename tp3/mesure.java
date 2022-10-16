package tp3;

public class mesure {
   int val;
   static int nbMesure;
   static int sommeMesure;
   final int min=-100;
   final int max=100;
  mesure(int v){
	  
	 
	if (val<min||val>max) {
		System.out.println(val+"hors intervalle");
	}
	else
	{
		this.val=v;
		nbMesure++;
		sommeMesure= sommeMesure+val;
		
	}
	
  }
  
  void affiche() {  
	  
	  System.out.println(val);
  }
  
  static void  afficheMoy() {
	  float moy;
	  if (nbMesure>0) {
		  
		  moy=sommeMesure/nbMesure;
		  System.out.println(moy);
	  }
	  else {
		  System.out.println("zero mesure");
	  }
  }
}
//static ki iwalli me 3andha 7atta 3ale9a b 7atta objet 
