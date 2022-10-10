package tp1;

import java.util.Scanner;

public class Prix {
	 
   public static void main(String[] args) {
	   
		float prix; 
		float remise;
	    float prix_ar;
	    Scanner MyObj = new Scanner(System.in);
	    System.out.println("donner le prix ");
	      prix = MyObj.nextFloat();
	     System.out.println("donner le remise");
	     remise = MyObj.nextFloat();
	    prix_ar=prix -(prix * remise )/100;
	    System.out.println( prix_ar);

  }
}
