package tp3;

import java.util.Scanner;

public class mainMesure {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		int n=obj.nextInt();
		for(int i=1;i<n;i++)
		{
			int v=obj.nextInt();
		
		mesure m= new  mesure(v);
         m.affiche();
		}
		mesure.afficheMoy();
        // m.afficheMoy();
		/* mesure m2= new  mesure(mesure.nbMesure);
         m2.affiche();
         
         
		 mesure m3= new  mesure(mesure.sommeMesure);
         m3.affiche();*/

         
         
         
         
         
         
         
         
         
         
  
	}

}
