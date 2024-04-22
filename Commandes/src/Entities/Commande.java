package Entities;

public class Commande {
    private static int nbrCommande;
    private int id;
    private String reference,date; 
    private double montant;
    private Statut statut;
    public Commande() {
    }
    public Commande(String reference, String date, double montant, Statut statut) {
        nbrCommande++;
        this.id = nbrCommande;
        this.reference = reference;
        this.date = date;
        this.montant = montant;
        this.statut = statut;
    }
    public static int getNbrCommande() {
        return nbrCommande;
    }
    public int getId() {
        return id;
    }
    public String getReference() {
        return reference;
    }
    public String getDate() {
        return date;
    }
    public double getMontant() {
        return montant;
    }
    public Statut getStatut() {
        return statut;
    }
    public static void setNbrCommande(int nbrCommande) {
        Commande.nbrCommande = nbrCommande;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    // public boolean equals(String ref){
    //     return 
    // }

    public String toString() {
        return "id=" + id + ", reference=" + reference + ", date=" + date + ", montant=" + montant
                + ", statut=" + statut;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((reference == null) ? 0 : reference.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Commande other = (Commande) obj;
        if (reference == null) {
            if (other.reference != null)
                return false;
        } else if (!reference.equals(other.reference))
            return false;
        return true;
    }
    
}
