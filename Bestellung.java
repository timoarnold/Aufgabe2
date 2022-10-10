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
    /** 
    * Feedback Cha
    * hier würde ich jede Variabel noch kurz beschreiben. Bspw:
    * Die Liste bestellteProdukte enthält alle Produkte, die bestellt worden sind
    * Die bestellBestaetigung gibt an, ob eine Bestellung erfolgreich bestätigt wurde oder nicht (boolean)
    * Die Beschaffungszeit gibt an, wie lange die Lieferzeit (in Tage) für die Produkte ist
    * Anzahl der bestellten Stühle / Sofas
    * 
    * fehlt evtl noch der Integer: BeschaffungsZeit? (Die Beschaffungszeit gibt an, wie lange die Lieferzeit (in Tage) für die Produkte ist
    */
    /**
     * Klassenvariabeln 
     * BestellnummerGenerator: Hier direkt auf 1 initialisiert, damit bei jeder neuen Bestellung plus 1 (Siehe "++" im Konstruktor)
     */
    
    static private int BestellnummerGenerator=1;
       //intanzvariabeln
    private ArrayList<Produkt> bestellteProdukte;
    private boolean bestellBestaetigung;
    private int beschaffungsZeit;
    private int bestellNummer;
    private int anzahlStuehle;
    private int anzahlSofas;
    
    /**
    * Feedback Cha
    * Ich würde hier "für Objekte" weglassen
    * dafür würde ich noch beschreiben, was passiert. Bspw:
    * Hier werden alle globalen Variablen initialisiert (?)
    *
    * auch hier würde ich wieder die Kommentare ausserhalb vom Block machen... ist fürs Auge einfacher nachzuvollziehen meiner Meinung nach :)
    * 
    * public Bestellung() --> sollte man hier nicht eingeben können, was man bestellen kkann?
    * public Bestellung(int bestellungsNr, int anzahlStuehle, int anzahlSofas) --> hier wieder auf Vereinheitlichung von Sofa/sofas, chairs/Stuehle achten...
    * 
    * beim Inhalt bin ich mir noch unsicher bzgl Feedback, sorry!
    */
    
    /**
     * Konstruktor für Objekte der Klasse Bestellung
     */
    public Bestellung(int anzahlStuehle1, int anzahlSofas1)
    {
        // Instanzvariable initialisieren
        bestellteProdukte = new ArrayList<Produkt>();
        //Folgende Zeilen wahrscheinlich ändern 
        bestellBestaetigung = false;
        beschaffungsZeit = 0;
        bestellNummer = BestellnummerGenerator++;
        anzahlStuehle = anzahlStuehle1;
        anzahlSofas = anzahlSofas1;
    }

    /**
     * Methoden:
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    
    /**
    * Feedback Cha
    * Ich denke, hier müssen wir noch Stühle und Sofas hinzufügen, da sobald eine Bestellung eingegangen ist, die Stühle/Sofas erhöhrt werden müssen. Bspw.
    * 
    * Mit dieser methode wird ein Stuhl erstellt und zur Liste der bestellten Produkte hinzugefügt
    * private void stuhlHinzufuegen()
    * {
    * Stuhl stuhl = new Stuhl();
    bestellteProdukte.add(stuhl);
    * }
    * 
    * das gleiche mit Sofas wie oben
    */
    
   
    public void bestellungBestaetigen()
    {
        // tragen Sie hier den Code ein Hier wird wohl noch was kommen
        // Cha: bestellBestaetigung = true;
    }
    
    public boolean gibBestellBestaetigung()
    {
        return bestellBestaetigung;
        // nur eingeführ, damit Fehlermeldung weg -->Hier wird wohl noch was kommen, 
        // Cha: macht für mich Sinn
    }
    
    public void setzBeschaffungsZeit(int neueBeschaffungsZeit)
    {
        // Hier in Tage definiert, daher int (Siehe 2 Tage in Aufgabenstellung)
        beschaffungsZeit = neueBeschaffungsZeit; 
    }
    
    public int gibBeschaffungszeit()
    {
        return beschaffungsZeit;
    }
    
    /** Hier würde kommen: 
     * public int gibBestellungsNr()
     * return int ...
     *
     * Feedback Cha:
     * genau, aber einfach mit --> return bestellungsNr;
     *
     */
    
    
    /**
    *Feedback Cha
    * Nicht vergessen, die Methoden noch kurz zu beschreiben, was damit passiert...bsp:
    * Mit dieser Methode wird die Anzahl Stühle für die Bestellung ausgegeben
    * wieder schauen, dass wir Stuehle/Sofas vereinheitlichen
    */
   
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
    
     /**
    * Feedback Cha
    * können wir auchh noch die Lieferzeit abfragen?
    */
    
}
