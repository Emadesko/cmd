import java.util.Scanner;

import Entities.Commande;
import Entities.Statut;
import Servicies.CommandeServices;

public class App {
    public static Scanner scanner=new Scanner(System.in);
    public static CommandeServices CommandeServices=new CommandeServices();
    public static void main(String[] args) throws Exception {
        int choix;
        String reference,date;
        double montant;
        do{
            System.out.println("1. Enregistrer une commande "); 
            System.out.println("2. Lister toutes les Commandes"); 
            System.out.println("3. Lister les Commandes par statut"); 
            System.out.println("4. Quitter"); 
            choix=scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    Commande commande=new Commande();
                    do{
                        System.out.println("Donnez la reference de la Commande: "); 
                        reference=scanner.nextLine();
                        commande.setReference(reference);
                        System.out.println(CommandeServices.checkReference(commande));
                    }while(CommandeServices.checkReference(commande));

                    System.out.println("Donnez la date de la commande: "); 
                    date=scanner.nextLine();
                    commande.setReference(reference);
                    do{
                        System.out.println("Donnez le montant de la commande: "); 
                        montant=scanner.nextDouble();

                        scanner.nextLine();
                    }while(montant<=0);
                    commande.setReference(reference);
                
                    CommandeServices.addCommande(commande);
                    break;
                case 2:
                    CommandeServices.listerCommandes();
                    break;
                case 3:
                    CommandeServices.listerCommandes(choixStatut());;
                default:
                    break;
            }
        }while(choix!=4);

    }

    public static Statut choixStatut(){
        int choix;
        do {
            System.out.println("Choisissez le statut"); 
            System.out.println("1:Payées"); 
            System.out.println("2:Impayées"); 
            choix=scanner.nextInt();
            scanner.nextLine();
        } while (choix!=1 && choix!=2 );
        return choix==1?Statut.Payées:Statut.Impayées;
    }
   
}
