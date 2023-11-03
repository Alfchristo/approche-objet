package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte user1 = new Compte(1, -300);
        System.out.println(user1); // TP 05
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(2,458);
        comptes[1] = new Compte.TauxCompte(3,2500,2);
        for (Compte compte : comptes){
            System.out.println(compte);
        }
        System.out.println(comptes[1]);
    }
}
