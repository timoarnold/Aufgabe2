import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Bestellung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bestellung
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Produkt> bestellteProdukte;
    private boolean bestellBestaetigung;
    private int beschaffungsZeit;
    private int anzahlStuehle;
    private int anzahlSofas;
    /**
     * Konstruktor für Objekte der Klasse Bestellung
     */
    public Bestellung()
    {
        // Instanzvariable initialisieren
        bestellteProdukte = new ArrayList<Produkt>();
        //Folgende Zeilen wahrscheinlich ändern 
        bestellBestaetigung = false;
        beschaffungsZeit = 0;
        anzahlStuehle = 0;
        anzahlSofas = 0;
    }

    /**
     * Methoden:
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void bestellungBestaetigen()
    {
        // tragen Sie hier den Code ein Hier wird wohl noch was kommen
    }
    
    public boolean gibBestellBestaetigung()
    {
        return bestellBestaetigung;//nur eingeführ, damit Fehlermeldung weg -->Hier wird wohl noch was kommen
    }
    
    public void setzBeschaffungsZeit(int neueBeschaffungsZeit)
    {
        //Hier in Tage definiert, daher int (Siehe 2 Tage in Aufgabenstellung)
        beschaffungsZeit = neueBeschaffungsZeit; 
    }
    
    public int gibBeschaffungszeit()
    {
        return beschaffungsZeit;
    }
    
    /** Hier würde kommen: 
     * public int gibBestellungsNr()
     * return int ...
     */
    
    public int gibAnzahlStuehle()
    {
        return anzahlStuehle;
    }
    
    public int gibAnzahlSofas()
    {
        return anzahlSofas;
    }
    
    
}
