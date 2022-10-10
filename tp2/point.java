package tp2;
import java.util.Scanner;

public class point {
	
	 int abs;
	 int ord;
	 char nom;
	 
	point (int abs,int ord, char nom){
	 this.abs=abs;
	 this.ord=ord;
	 this.nom=nom;
	}
		 
		 
   point (){}
   
   
   point (point p){
    abs=p.abs;
    ord=p.ord;
    nom=p.nom;
	}
	
   boolean coincide_v1(point p){
       return( (this.abs==p.abs)&&(this.ord==p.ord)&&(this.nom==p.nom));
   }
  static boolean coincide_v2(point p1,point p2) {
	   
	  return( (p1.abs==p2.abs)&&(p1.ord==p2.ord)&&(p1.nom==p2.nom));
   }
   
   
   
	 void affiche ()
	 {
		 System.out.println(nom +"("+abs+","+ord+")");
	 } 
	 @Override
		public String toString () {
		 
			String s=nom +"("+abs+","+ord+")";
			return s;
		}
	 
}
