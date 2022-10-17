
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
    public Produkt(int zustand, int holzeinheiten, int schrauben, int farbeinheiten, int kartoneinheiten, int produkttionsZeit)
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
    
}
