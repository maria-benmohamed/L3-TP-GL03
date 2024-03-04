package mesClasses;
import java.io.Serializable;
import java.util.Scanner;

public class TP4 implements Serializable {
    public static void main(String[] args) {
        Annuaire a=new Annuaire();
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter a command: ");
		String cmd = reader.nextLine();
		
		while (!cmd.startsWith(".")){
			if (cmd.startsWith("+")){
				System.out.println("Entrer le numéro de fiche: ");
				int no = Integer.parseInt(reader.nextLine());
				System.out.println("Entrer d'address de fiche: ");
				String adr = reader.nextLine();
				a.addFiche(new Fiche(no,cmd.substring(1),adr));
				System.out.println("La fiche a été ajoutée avec succès !");
			}
			else{ 
			    if (cmd.startsWith("?")){
			         Fiche f =a.chercherFiche(cmd.substring(1));
			         if(f!=null){
			        	 System.out.println(f);
			         } 
			         else{
			        	 System.out.println("La fiche recherchée ne se retouve pas dans l'annuaire");
			         }
			    }
			    else{
			    	if (cmd.startsWith("!")) {
			    		System.out.println("----- Before Sorting --------");
			    		a.afficherFiche();
			    		System.out.println("----- After Sorting --------");
			    		a.afficherFicheTriee (); 
			    	}
			    	else{
					   System.out.print("Erreur Commande !!");
			    	}
			    }
		    }
			System.out.println("Enter a command: ");
			cmd = reader.nextLine();
		}
		reader.close();
	  	a.Serialize();
    } 
}
