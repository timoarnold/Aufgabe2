
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
    
    /**
    * Feedback Cha
    * vielleicht in den Kommentaren noch kurz beschreiben, was es für verschiedene Zustände gibt? 1: Bestellt, 2: In Produktion, 3: Bereit für Auslieferung, 4: Ausgeliefert
    */
    
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
        zustand = 0;
        holzeinheiten =0;
        schrauben = 0;
        farbeinheiten =0;
        kartoneinheiten =0;
        produktionsZeit =0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    
    //Gebe neuen Zustand ein (neuerZustand) des Typs int. ->Gibt mit void aus (muss nichts ausgeben)
    //
    /**
     * Beispielsweise: 
     * Zustand 1 = Holzarbeit 
     * Zustand 2 = Spritzlackierung
     * Zustand 3 = Montage etc. 
     * -->spätere Einprogrammierung
     */
    public void zustandAendern(int neuerZustand)
    {
        // Zustand ändern -->ist hier int. DIes müsste in einem nächsten Schritt noch mit Zuständen zugeordnet werden (allenfalls Begrenzung auf eine gewisse Anazhl Zustände)
        zustand = neuerZustand;
    }
    
    public int alktuellerZustand()
    {
        //Gibt den aktuellen Zustand wieder (hier wie oben beschrieben als int entsprechend Eingabe)
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
