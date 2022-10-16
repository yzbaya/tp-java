package tp3;

import java.util.Scanner;

public class mainMethode {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("donner n ");
		int n=obj.nextInt();
		
		/*methodes m= new methodes();
		m.factoriel(n);*/
		
		 System.out.println(methodes.factoriel(n));
		 System.out.println(methodes.somme(n));
		 System.out.println(methodes.racineCarré(n));
	}
	

}


