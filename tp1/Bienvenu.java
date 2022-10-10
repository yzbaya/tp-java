package tp1;
import java.util.Scanner;
public class Bienvenu {
	public static void main(String args[]) {
		//tasna3 l objet(tasna3 9aleb lel gateau)
		Scanner sc = new Scanner(System.in);
		System.out.println("Quel est votre prénom ? ");
		String prenom = sc.nextLine();
		System.out.println("donner un entier ");
		int x = sc.nextInt();
		System.out.println("\nBienvenu " + prenom + " !");
		System.out.println("l'entier " + x + " !");
		} }
