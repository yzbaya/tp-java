package tp2;

public class TestPoint {

	public static void main(String[] args) {
		
		 point p1=new point(3,5,'a');
		 p1.affiche();
		 
		 point p2=new point();
	     p2.affiche();

	     point p3=new point(p1);
         p3.affiche();
         
         System.out.println(p1.coincide_v1(p3));
         System.out.println(p2.coincide_v1(p3));
         
         //methode 2
         System.out.println(point.coincide_v2(p3,p1));

         
         System.out.println(p3);
	}
	

}
