
/** 
 * @author Gruppe 29
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Produkt bildet die Superklasse der beiden Produkte Stuhl & Sofa.
 * Sie enthält globale Variabeln für diese beiden Produkte / Variabeln, welche bei Stuhl & Sofa identisch sind.
 */
public class Produkt
{
    /**
     * Instanzvariabeln:
     * 
     * zustand              = Beschreibt den aktuellen Zustand eines Produkts (int). 
     *                        Anmerkung: Bisher noch int-Wert, der manuell eingegeben werden kann für jeden Produkt-Zustand (bspw. "in Holzarbeit = 1")
     * holzeinheiten        = Anzahl Holzeiheiten, welche zur Herstellung eines Produkts benötigt werden (int).
     * schrauben            = Anzahl Schrauben, welche zur Herstellung eines Produkts benötigt werden (int).
     * farbeinheiten        = Anzahl Farbeinheiten, welche zur Herstellung eines Produkts benötigt werden (int).
     * kartoneinheiten      = Anzahl Kartoneinheiten, welche zur Herstellung eines Produkts benötigt werden (int).
     * produktionsZeit      = Produktionszeit in Stunden (int), die zur Produktion eines Produkts nötig ist.
     */
    
    private int zustand;
    private int holzeinheiten;
    private int schrauben;
    private int farbeinheiten;
    private int kartoneinheiten;
    private int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Produkt.
     * Dieser initialisiert alle Instanzvariabeln der Klasse Produkt
     */
    public Produkt(int zustand, int holzeinheiten, int schrauben, int farbeinheiten, int kartoneinheiten, int produktionsZeit)
    {
        // Instanzvariable initialisieren
        zustand = 1;
        this.holzeinheiten = holzeinheiten;
        this.schrauben = schrauben;
        this.farbeinheiten = farbeinheiten;
        this.kartoneinheiten = kartoneinheiten;
        this.produktionsZeit = produktionsZeit;
    }

    /**
     * Methode zustandAendern:
     * Manuelle Wahl eines Produktzustands, wobei:
     * Zustand 1 = Holzarbeit 
     * Zustand 2 = Spritzlackierung
     * Zustand 3 = Montage
     * Zustand 4 = Verpackung
     * Achtung: Hier ist zu beachten, dass de Zustandsreihenfolge bei Sofa & Stuhl nicht identisch ist.
     */
    public void zustandAendern(int neuerZustand)
    {
        zustand = neuerZustand;
    }
    
    /**
     * Methode aktuellerZustand:
     * Gibt den aktuellen Zustand eines Produkts wieder.
     */
    public int alktuellerZustand()
    {
        return zustand;
    }
    
    /**
     * Fortfolgende: Get & Set-Methoden: 
     * Diese Methoden setzen und geben die jeweiligen Materialwerte. Diese können aus den Subklassen Sofa & Stuhl angesprochen werden
     * und dienen der künftigen Implementierung weiterer Programm-Funktionalitäten.
     */
    
    public int getHolzeinheiten() {
        return holzeinheiten;
    }
    
    public void setHolzeinheiten(int HolzFuerProdukt){
        holzeinheiten = HolzFuerProdukt;
    }
    
    public int getSchrauben() {
        return schrauben;
    }
    
    public void setSchrauben(int SchraubenFuerProdukt){
        holzeinheiten = SchraubenFuerProdukt;
    }
    
    public int getFarbEinheiten() {
        return farbeinheiten;
    }
    
    public void setFarbEinheiten(int FarbeFuerProdukt){
        holzeinheiten = FarbeFuerProdukt;
    }
    
    public int getKartoneinheiten() {
        return kartoneinheiten;
    }
    
    public void setKartoneinheiten(int KartonFuerProdukt){
        holzeinheiten = KartonFuerProdukt;
    }
    
    public int getProduktionsZeit() {
        return produktionsZeit;
    }
    
    public void setProduktionsZeit(int ProduktionszeitFuerProdukt){
        holzeinheiten = ProduktionszeitFuerProdukt;
    }  
}
