
/**
 * Beschreiben Sie hier die Klasse Produkt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Produkt
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //Zustandsvariable ist hier global, da public definiert = auch von anderen Klassen aufrufbar mit "Produkt.zustand"
    
    private int zustand;
    private int holzeinheiten;
    private int schrauben;
    private int farbeinheiten;
    private int kartoneinheiten;
    private int produktionsZeit;

    /**
     * Konstruktor für Objekte der Klasse Produkt
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
     * Wähle einer dieser Zustände: 
     * Zustand 1 = Holzarbeit 
     * Zustand 2 = Spritzlackierung
     * Zustand 3 = Montage
     * Zustand 4 = Verpackung
     */
    public void zustandAendern(int neuerZustand)
    {
        zustand = neuerZustand;
    }
    
    public int alktuellerZustand()
    {
        return zustand;
    }
    
    /**
     * Get & Set-Methoden: Da in VL kommuniziert, dass wir gleiche Variabeln in Stuhl / Sofa
     * in der Superklasse implementieren sollen, wandern die Get-Methoden ebenfalls hierher.
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
