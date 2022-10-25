import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Bestellung.
 * 
 * @author (Gruppe 29) 
 * @version (Version 2)
 */
//Testkommentar
public class Bestellung
{
    /** 
    * InstanzVariablen:
    * 
    * Liste bestellteProdukte   = enthält alle Produkte, die bestellt worden sind
    * bestellBestaetigung       = gibt an, ob eine Bestellung erfolgreich bestätigt wurde oder nicht (boolean)
    * Beschaffungszeit          = gibt an, wie lange die Lieferzeit (in Tage) für die Produkte ist
    * Anzahl bestellter S       = gibt an, wie viele Stühle und Sofas in einer Bestellung nachgefragt wurden
    */
   
   
    /**
     * Klassenvariablen: 
     * 
     * BestellnummerGenerator = Generiert bei der ersten Bestellung die Nummer 1, danach wird bei jeder Bestellung +1 zu dieser Zahl geadded. 
     * Dies ergibt die Bestellnummer-Variable für jede Bestellung (damit nicht nur die Bestellungsanzahl Total ausgegeben wird)
     * Hier direkt auf 1 initialisiert, damit Bestellung 1 = 1 & bei jeder neuen Bestellung plus 1 (Siehe "++" im Konstruktor)
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
     * Dieser initialisiert alle Objekte der Klasse Bestellung
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
     * Methoden:
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
    
    public boolean gibBestellBestaetigung()
    {
        return bestellBestaetigung;
    }
    
    public void setzBeschaffungsZeit(int neueBeschaffungsZeit)
    {
        beschaffungsZeit = neueBeschaffungsZeit; 
    }
    
    public int gibBeschaffungszeit()
    {
        return beschaffungsZeit;
    }
    
    public String toString()
    {
        return "Bestellnummer:" + this.gibBestellNummer()+ "\nStühle bestellt:" + this.gibAnzahlStuehle()+ "\nSofas bestellt:" + this.gibAnzahlSofas();
    }
   
    public int gibBestellNummer()
    {
        return bestellNummer;
    }
    
    public int gibAnzahlStuehle()
    {
        return anzahlStuehle;
    }
    
    public int gibAnzahlSofas()
    {
        return anzahlSofas;
    }
    
    public static void resetBestellnummerGenerator(){
        BestellnummerGenerator = 1;
    }
}
