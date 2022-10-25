import java.util.ArrayList;
/**
 * @author Gruppe 29
 * @version 1.0 (25. Oktober 2022)
 * 
 * Die Klasse Bestellung verwaltet die Array-Liste, in der alle über die Fabrik bestellten
 * Produkte gespeichert werden. Dies können Sofas oder Stühle sein.
 */

public class Bestellung
{
    /** 
     * InstanzVariabeln:
    * 
    * Liste bestellteProdukte   = enthält alle Produkte, die bestellt worden sind
    * bestellBestaetigung       = gibt an, ob eine Bestellung erfolgreich bestätigt wurde oder nicht (boolean)
    * beschaffungsZeit          = gibt an, wie lange die Lieferzeit (in Tage) für die Produkte ist (int)
    * bestellNummer             = gibt an, welche Nummer einer Bestellung bei Empfang zugeordnet wurde (int)
    * anzahlS                   = geben an, wie viele Stühle/Sofas in einer Bestellung nachgefragt wurden (int)
    * 
    * 
     * Klassenvariabeln: 
    * 
    * BestellnummerGenerator = Generiert bei der ersten Bestellung die Nummer 1, danach wird bei jeder Bestellung +1 zu dieser Zahl addiert. 
    * Dies ergibt die Bestellnummer-Variable für jede Bestellung (damit nicht nur die Bestellungsanzahl Total ausgegeben wird)
    * Hier direkt auf 1 initialisiert, damit Bestellung 1 = 1. Danach bei jeder neuen Bestellung plus 1 (Siehe "++" im Konstruktor).
    */
    
    //Klassenvariablen:
    static private int BestellnummerGenerator=1;
    
    //Intanzvariablen:
    private ArrayList<Produkt> bestellteProdukte;
    private boolean bestellBestaetigung;
    private int beschaffungsZeit;
    private int bestellNummer;
    private int anzahlStuehle;
    private int anzahlSofas;
    
    /**
     * Konstruktor der Klasse Bestellung
     * Dieser initialisiert alle Instanzvariabeln der Klasse Bestellung
     */
    public Bestellung(int anzahlStuehle, int anzahlSofas)
    {
        // Instanzvariable initialisieren
        bestellteProdukte = new ArrayList<Produkt>();
        
        //Folgende Zeilen wahrscheinlich ändern 
        bestellBestaetigung = false;
        beschaffungsZeit = 0;
        bestellNummer = BestellnummerGenerator++;
        this.anzahlStuehle = anzahlStuehle;
        this.anzahlSofas = anzahlSofas;
    }

    /**
     * Method bestellungBestaetigen: BESCHREIBUNG JEFF HIER EINFÜGEN
     */
    
    public void bestellungBestaetigen()
    {
        for (int i = 0; i < anzahlStuehle; i++){
        bestellteProdukte.add(new Stuhl(0, 2, 10, 2, 1, 22));
        }
        
        for (int i = 0; i < anzahlSofas; i++){
        bestellteProdukte.add(new Sofa(0, 4, 5, 5, 1, 5, 60));
        }
        
        bestellBestaetigung = true;
    }
    
    /**
     * Methode gibBestellbestaetigung: 
     * Gibt die Bestellbestätigung aus.
     */
    public boolean gibBestellBestaetigung()
    {
        return bestellBestaetigung;
    }
    
    /**
     * Methode setzBeschaffungsZeit: 
     * Ermöglicht das manuelle Setzen der jeweiligen Beschaffungszeit in Abstimmung mit den Lieferanten
     */
    public void setzBeschaffungsZeit(int neueBeschaffungsZeit)
    {
        beschaffungsZeit = neueBeschaffungsZeit; 
    }
    
    /**
     * Methode gibBeschaffungszeit:
     * Gibt die gesetzte Beschaffungszeit aus
     */
    public int gibBeschaffungszeit()
    {
        return beschaffungsZeit;
    }
    
    /**
     * Methode toString:
     * Wandelt die Konsolenausgabe der Methode bestellungenAUsgeben in die Form String um, 
     * damit diese im Unit-Test auf Übereinstimmung getestet werden kann.
     */
    public String toString()
    {
        return "Bestellnummer:" + this.gibBestellNummer()+ "\nStühle bestellt:" + this.gibAnzahlStuehle()+ "\nSofas bestellt:" + this.gibAnzahlSofas();
    }
   
    /**
     * Methode gibBestellNummer:
     * Gibt die jeweilige Nummer einer Bestellung aus
     */
    public int gibBestellNummer()
    {
        return bestellNummer;
    }
    
    /**
     * Methode gibAnzahlStuehle:
     * Gibt die Anzahl bestellter Stühle in einer Bestellung aus
     */
    public int gibAnzahlStuehle()
    {
        return anzahlStuehle;
    }
    
    /**
     * Methode gibAnzahlSofas:
     * Gibt die Anzahl bestellter Sofas in einer Bestellung aus
     */
    public int gibAnzahlSofas()
    {
        return anzahlSofas;
    }
    
    /**
     * Methode resetBestellnummerGenerator:
     * Setzt die Klassenvariabel BestellnummerGenerator auf 0 zurück. Dies dient u. A. zum Unit-Testing.
     */
    public static void resetBestellnummerGenerator(){
        BestellnummerGenerator = 1;
    }
}
