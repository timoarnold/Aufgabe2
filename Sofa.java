
/**
 * @author Gruppe 29
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Sofa bildet eine Erweiterung / Subklasse der Klasse Produkt. 
 * Sie erbt somit die Funktionalitäten sowie die globalen Variabeln der Klasse Produkt.
 * Zudem enthält sie Variabeln, welche für den Produkttyp <Sofa> einzigartig sind.
 */

public class Sofa extends Produkt
{
    /**
     * Instanzvariabeln:
     *
     * kissen           = Anzahl Kissen, welche zur Herstellung eines Produkts benötigt werden (int).
     */ 
    
    private int kissen;

    /**
     * Konstruktor für Objekte der Klasse Sofa
     * Dieser initialisiert alle Instanzvariabeln der Klasse Produkt
     */
    public Sofa(int zustand, int holzeinheiten, int schrauben, int kissen, int farbeinheiten, int kartoneinheiten, int produktionsZeit)
    {
        // Instanzvariable initialisieren -->nochmals anpassen
        super(zustand, holzeinheiten, schrauben, farbeinheiten, kartoneinheiten, produktionsZeit); 
        this.kissen = kissen;
       
    }

    /**
     * Methode getKissen:
     * Gibt die Anzahl benötigter Kissen für ein Sofa wieder
     */
    
    public int getKissen() {
        return kissen;
    }
    
    /**
     * Methode setKissen:
     * Setzt die Anzahl benötigter Kissen für ein Sofa
     */
    public void setKissen(int KissenFuerSofa){
        kissen = KissenFuerSofa;
    }
    
    
}
