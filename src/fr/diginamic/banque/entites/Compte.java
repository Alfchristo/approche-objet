package fr.diginamic.banque.entites;

public class Compte {
    private int numCompte;
    private double soldeCompte;

    public Compte(int nvNumCompte, double nvSoldeCompte){
        this.numCompte = nvNumCompte;
        this.soldeCompte = nvSoldeCompte;
    }
    public int getNumCompte() {
        return numCompte;
    }
    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }
    public double getSoldeCompte() {
        return soldeCompte;
    }
    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString(){
        return "Numero de Compte:"+ " " + this.numCompte +
                ",Votre Solde" + " " + this.soldeCompte;
    } // TP 6

   public static class TauxCompte extends Compte {
        private double tauxRem;
        public TauxCompte(int numCompte, double soldeCompte, double tauxRem)
        {
            super(numCompte, soldeCompte);
            this.tauxRem = tauxRem;
        }
       public double getTauxRem() {
           return tauxRem;
       }
       public void setTauxRem(double tauxRem) {
           this.tauxRem = tauxRem;
       }
       @Override
       public String toString(){
           return super.toString() + " "+ "et votre taux de rémunération est"+" " + tauxRem +"%";
       }
   }  // TP 7
}
