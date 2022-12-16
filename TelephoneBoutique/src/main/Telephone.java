package main;

import java.util.UUID;
/**
 * Décrivez votre classe Telephone ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Telephone
{
    private String marque;
    private int anneeFabrique;
    private String siret;
    /**
     * Constructeur d'objets de classe Telephone
     */
    public Telephone(String marque, int anneeFabrique)
    {
        this.marque = marque;
        this.anneeFabrique = anneeFabrique;
        this.siret = UUID.randomUUID().toString();
    }
    /**
     * Accesseurs getter et setter
     */
    public String getMarque()
    {
        return this.marque;
    }
    public int getAnnee()
    {
        return this.anneeFabrique;
    }
        public String getSiret()
    {
        return this.siret;
    }
    public void setMarque(String marque)
    {
        this.marque = marque;
    }
    public void setAnnee(int anneeFabrique)
    {
        this.anneeFabrique = anneeFabrique;
    }
    /**
     * Méthode pour calculer la durée de sortie
     * @return     l'age du modele de telephone
     */
    public int ComputeAge()
    {
        int age = 2022 - this.getAnnee();
        return age;
    }
    
   
}