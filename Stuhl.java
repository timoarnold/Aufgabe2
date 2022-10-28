
/**
 * @author Gruppe 29 
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Stuhl bildet eine Erweiterung / Subklasse der Klasse Produkt. 
 * Sie erbt somit die Funktionalitäten sowie die globalen Variabeln der Klasse Produkt.
 * Zudem enthält sie Variabeln, welche für den Produkttyp <Stuhl> einzigartig sind.
 */

public class Stuhl extends Produkt {
    /**
     * Instanzvariabeln: Materialien, die zur Herstellung eines Stuhl benötigt werden
     *
     * @param holzeinheiten: Anzahl Holzeiheiten, welche zur Herstellung eines Stuhls benötigt werden (int).
     * @param schrauben: Anzahl Schrauben, welche zur Herstellung eines Stuhls benötigt werden (int).
     * @param farbeinheiten: Anzahl Farbeinheiten, welche zur Herstellung eines Stuhls benötigt werden (int).
     * @param kartoneinheiten: Anzahl Kartoneinheiten, welche zur Herstellung eines Stuhls benötigt werden (int).
     * @param produktionsZeit: Produktionszeit in Stunden (int), die zur Produktion eines Stuhls nötig ist.
     */ 
    private static int holzeinheiten;
    private static int schrauben;
    private static int farbeinheiten;
    private static int kartoneinheiten;
    private static int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Stuhl: initialisiert alle Instanzvariabeln der Klasse Produkt
     * @param (Siehe oben)
     */
    public Stuhl() {
        super (1);
        holzeinheiten = 2;
        schrauben = 10;
        farbeinheiten = 2;
        kartoneinheiten = 1;
        produktionsZeit = 22;
    }
    
    /**
     * Gib die Anzahl Holzeinheiten wieder.
     * @patram holzeinheiten: Anzahl benötigter Holzeinheiten für die Produktion eines Stuhls.
     */
    public int getHolzeinheiten() {
        return holzeinheiten;
    }
    
    /**
     * Gib die Anzahl Schrauben wieder.
     * @param: Anzahl benötigter Schrauben für die Produktion eines Stuhls.
     */
    public int getSchrauben() {
        return schrauben;
    }
    
    /**
     * Gib die Anzahl Farbeinheiten wieder
     * @param: Anzahl benötigter Farbeinheiten für die Produktion eines Stuhls.
     */
    public int getFarbEinheiten() {
        return farbeinheiten;
    }
    
    /**
     * Gib die Anzahl Kartoneinheiten wieder.
     * @param: Anzahl benötigter Kartoneinheiten für die Produktion eines Stuhls.
     */
    public int getKartoneinheiten() {
        return kartoneinheiten;
    }
    
    /**
     * Gib die Produktionszeit wieder.
     * @param: Produktionszeit für ein Stuhl.
     */
    public int getProduktionsZeit() {
        return produktionsZeit;
    }
}
