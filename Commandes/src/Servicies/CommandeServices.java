package Servicies;

import Entities.Commande;
import Entities.Statut;

public class CommandeServices {
    private final int N=10;
    private Commande [] tCommande=new Commande[N];
    int n;
    public void addCommande(Commande C){
        if (n<N) {
            tCommande[n]=C;
            n++;
        }
    } 
    public void listerCommandes(){
        for (int i=0;i<n;i++){
            System.out.println(tCommande[i].toString());
        }
    }

    public void listerCommandes(Statut statut){
        for (int i=0;i<n;i++){
            if (tCommande[i].getStatut()==statut) {
                System.out.println(tCommande[i].toString());
            }
        }
    }

    public Commande[] tableau(){
        return tCommande;
    }
    
    public boolean checkReference(Commande reference){
        
        for (int i=0;i<n;i++){
            if (tCommande[i].equals(reference)){
                
                return true;
            }
        }
        return false;
    }
}
