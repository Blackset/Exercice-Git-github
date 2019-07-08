public class Calculatrice {
	
	
	Static Scanner clavier = new Scanner(System.in);
	public static void main (String [] args){
		int nbre1 =0 , nbre2=0;
		System.out.println("Entrer le nombre1:");
		nbre1 = clavier.nextInt();
		
		
		System.out.println("Entrer le nombre2:");
		nbre2 = clavier.nextInt();
		
		
		System.out.println("La somme de "+ nbre1+ " et "+ nbre2 + " est: " (nbre1+nbre2));
		System.out.println("La différence de "+ nbre1+ " et "+ nbre2 + " est: " (nbre1-nbre2));
		System.out.println("La multiplication de "+ nbre1+ " et "+ nbre2 + " est: " (nbre1*nbre2));
		System.out.println("La division "+ nbre1+ " et "+ nbre2 + " est: " (nbre1/nbre2));
	}
	
	
	
	
}