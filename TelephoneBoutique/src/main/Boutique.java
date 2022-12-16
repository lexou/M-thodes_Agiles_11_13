package main;
import java.util.UUID;
import java.util.*;
/**
 * 在这里给出对类 Boutique 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class Boutique
{
        private String uniqueID;
        private String nomBoutique;
        private ArrayList<Telephone> tel;
    /**
     * Constructeur Boutique
     */
    public Boutique(String nomBoutique)
    {
        this.uniqueID = UUID.randomUUID().toString();
        this.nomBoutique = nomBoutique;
        this.tel = new ArrayList<Telephone> ();
    }
    /**
     * Getter et Setter
     */
    public String getUniqueID()
    {
        return this.uniqueID;
    }
    public String getNomBoutique()
    {
        return this.nomBoutique;
    }
    public void setNomBoutique(String nom)
    {
        this.nomBoutique = nom;
    }
    /**
     * Methode pour ajouter le téléphone dans la boutique
     * @param Telephone telephone
     */
    public void add(Telephone telephone)
    {
        this.tel.add(telephone);
    }
    /**
     * Methode pour afficher la durée de sortie
     * @param Telephone telephone
     */
        public int afficheTelephoneAge(Telephone telephone)
    {
        int position = tel.indexOf(telephone);
        return this.tel.get(position).ComputeAge();
    }
}

