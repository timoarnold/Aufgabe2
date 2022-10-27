
/**
 * @author Gruppe 29
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Sofa bildet eine Erweiterung / Subklasse der Klasse Produkt. 
 * Sie erbt somit die Funktionalitäten sowie die globalen Variabeln der Klasse Produkt.
 * Zudem enthält sie Variabeln, welche für den Produkttyp <Sofa> einzigartig sind.
 */

public class Sofa extends Produkt {
    /**
     * Instanzvariabeln:
     *
     * holzeinheiten        = Anzahl Holzeiheiten, welche zur Herstellung eines Sofas benötigt werden (int).
     * schrauben            = Anzahl Schrauben, welche zur Herstellung eines Sofas benötigt werden (int).
     * kissen               = Anzahl Kissen, welche zur Herstellung eines Sofas benötigt werden (int).
     * farbeinheiten        = Anzahl Farbeinheiten, welche zur Herstellung eines Sofas benötigt werden (int).
     * kartoneinheiten      = Anzahl Kartoneinheiten, welche zur Herstellung eines Sofas benötigt werden (int).
     * produktionsZeit      = Produktionszeit in Stunden (int), die zur Produktion eines Sofas nötig ist.
     */ 
    
    private static int holzeinheiten;
    private static int schrauben;
    private static int kissen;
    private static int farbeinheiten;
    private static int kartoneinheiten;
    private static int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Sofa
     * Dieser initialisiert alle Instanzvariabeln der Klasse Produkt
     */
    public Sofa() {
        super(1); 
        holzeinheiten = 4;
        schrauben = 5;
        kissen = 5;
        farbeinheiten = 1;
        kartoneinheiten = 5;
        produktionsZeit = 60;
    }

    /**
     * Methode getHolzeinheiten():
     * Gibt die Anzahl benötigter Holzeinheiten für die Produktion eines Sofa zurück.
     */
    public int getHolzeinheiten() {
        return holzeinheiten;
    }
    
    /**
     * Methode getSchrauben():
     * Gibt die Anzahl benötigter Schrauben für die Produktion eines Sofa zurück.
     */
    public int getSchrauben() {
        return schrauben;
    }
    
    /**
     * Methode getKissen():
     * Gibt die Anzahl benötigter Kissen für die Produktion eines Sofa zurück.
     */
    public int getKissen() {
        return kissen;
    }
    
    /**
     * Methode getFarbEinheiten():
     * Gibt die Anzahl benötigter Farbeinheiten für die Produktion eines Sofa zurück.
     */
    public int getFarbEinheiten() {
        return farbeinheiten;
    }
    
    /**
     * Methode getKartoneinheiten():
     * Gibt die Anzahl benötigter Kartoneinheiten für die Produktion eines Sofa zurück.
     */
    public int getKartoneinheiten() {
        return kartoneinheiten;
    }
    
    /**
     * Methode getProduktionsZeit():
     * Gibt die Produktionszeit für ein Sofa zurück.
     */
    public int getProduktionsZeit() {
        return produktionsZeit;
    }
}
