
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
    public int zustand;

    /**
     * Konstruktor für Objekte der Klasse Produkt
     */
    public Produkt()
    {
        // Instanzvariable initialisieren
        zustand = 0;
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
