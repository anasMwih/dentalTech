package ma.dentalTech.repository.test;

import ma.dentalTech.configuration.ApplicationContext;
import ma.dentalTech.entities.users.Utilisateur;
import ma.dentalTech.repository.modules.users.api.UtilisateurRepository;

public class TestRepo {
    Utilisateur user = new Utilisateur();
    var userRepo ApplicationContext.getBean(UtilisateurRepository.class);
    void insertProcess(){

        // patient -> dm -> rdv -> consultation ->
        // ajouter des actes -> facture -> SF (Ordonnances , Certif)

    }
    void updateProcess(){

    }
    void deleteProcess(){

    }
    void selectProcess(){

    }

    public static void main(String[] args) {

    }
}
