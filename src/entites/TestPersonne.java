package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne pers1 = new Personne();
        pers1.nom = "Dupont";
        pers1.prénom = "Patrick";
        pers1.codePostal = 34000;

        Personne pers2 = new Personne();
        pers2.nom = "DuJardin";
        pers2.prénom = "Mathilde";
        pers2.codePostal = 34000;
    }
}
