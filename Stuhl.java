
/**
 * @author Gruppe 29 
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Stuhl bildet eine Erweiterung / Subklasse der Klasse Produkt. 
 * Sie erbt somit die Funktionalitäten sowie die globalen Variabeln der Klasse Produkt.
 * Zudem enthält sie Variabeln, welche für den Produkttyp <Stuhl> einzigartig sind.
 */

public class Stuhl extends Produkt
{
    /**
     * Instanzvariabeln:
     *
     * holzeinheiten        = Anzahl Holzeiheiten, welche zur Herstellung eines Stuhls benötigt werden (int).
     * schrauben            = Anzahl Schrauben, welche zur Herstellung eines Stuhls benötigt werden (int).
     * farbeinheiten        = Anzahl Farbeinheiten, welche zur Herstellung eines Stuhls benötigt werden (int).
     * kartoneinheiten      = Anzahl Kartoneinheiten, welche zur Herstellung eines Stuhls benötigt werden (int).
     * produktionsZeit      = Produktionszeit in Stunden (int), die zur Produktion eines Stuhls nötig ist.
     */ 
    static private int holzeinheiten;
    static private int schrauben;
    static private int farbeinheiten;
    static private int kartoneinheiten;
    static private int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Stuhl
     * Dieser initialisiert alle Instanzvariabeln der Klasse Produkt
     */
    public Stuhl(int zustand)
    {
        super (zustand);
        holzeinheiten = 2;
        schrauben = 10;
        farbeinheiten = 2;
        kartoneinheiten = 1;
        produktionsZeit = 22;
    }
    
    /**
     * Methode getHolzeinheiten():
     * Gibt die Anzahl benötigter Holzeinheiten für die Produktion eines Stuhls zurück.
     */
    public int getHolzeinheiten() {
        return holzeinheiten;
    }
    
    /**
     * Methode getSchrauben():
     * Gibt die Anzahl benötigter Schrauben für die Produktion eines Stuhls zurück.
     */
    public int getSchrauben() {
        return schrauben;
    }
    
    /**
     * Methode getFarbEinheiten():
     * Gibt die Anzahl benötigter Farbeinheiten für die Produktion eines Stuhls zurück.
     */
    public int getFarbEinheiten() {
        return farbeinheiten;
    }
    
    /**
     * Methode getKartoneinheiten():
     * Gibt die Anzahl benötigter Kartoneinheiten für die Produktion eines STuhls zurück.
     */
    public int getKartoneinheiten() {
        return kartoneinheiten;
    }
    
    /**
     * Methode getProduktionsZeit():
     * Gibt die Produktionszeit für ein Stuhl zurück.
     */
    public int getProduktionsZeit() {
        return produktionsZeit;
    }
}
