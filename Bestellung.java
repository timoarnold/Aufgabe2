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
    * 
    * fehlt evtl noch der Integer: BeschaffungsZeit? (Die Beschaffungszeit gibt an, wie lange die Lieferzeit (in Tage) für die Produkte ist
    * Flo: Ist unten aufgeführt und initialisiert. 
    * In nächsten Schritten wird wohl die Verknüpfung mit Produkt / Sofa / Stuhl nötig sein, um Materialien zu bestellen.
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
    * Feedback Cha
    *
    * auch hier würde ich wieder die Kommentare ausserhalb vom Block machen... ist fürs Auge einfacher nachzuvollziehen meiner Meinung nach :)
    * Flo: Dachte es ist ohne die "//* nicht direkt ersichtlich, welches die Klassenvariablen udn welches die Instanzvariablen sind :)
    * 
    * public Bestellung() --> sollte man hier nicht eingeben können, was man bestellen kkann?
    * Flo: angepasst :) Es steht Stüehle 1 und Sofas 1, damit unten nicht "anzahlStuehle=anzahlStuehle", da das verwirrend wäre.
    * 
    * public Bestellung(int bestellungsNr, int anzahlStuehle, int anzahlSofas) --> hier wieder auf Vereinheitlichung von Sofa/sofas, chairs/Stuehle achten...
    * Flo: Angepasst. bestellungsnummer muss nicht vom Kunden eingegeben werden. Daher hier nicht in Konstruktor.
    * 
    * beim Inhalt bin ich mir noch unsicher bzgl Feedback, sorry!
    * Flo: Alles gut :)
    */
    
    /**
     * Konstruktor der Klasse Bestellung
     * Dieser initialisiert alle Objekte der Klasse Bestellung
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
    * 
    * Flo: Guter Punkt. Aktuell werden die in der BestellungAUfgeben bestellten Stühle und Sofas in der Array bestellungen gespeichert. 
    * Allenfalls könnte man noch separate Funktionen in der Fabrikklasse erstellen, mit denen man "Total Anzahl Stühle und Total Anzahl Sofas" ausgeben kann.
    * Das ist jedoch noch nicht in Aufgabe 1 erwähnt als To Do.
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
    
    public String toString(){
        return "Bestellnummer:" + this.gibBestellNummer()+ "\nStühle bestellt:" + this.gibAnzahlStuehle()+ "\nSofas bestellt:" + this.gibAnzahlSofas();
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
    * 
    * Flo: Dies sind Methoden, welche im Rahmen der FUnktion bestellungAusgeben in der Fabrikklasse angesprochen werden.
    * So können die Anzahl Stühle und Sofas sowie die jeweilige Nummer der Bestellung angezeigt werden auf der Konsole.
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
    * Flo: Ja, können wir analog zu Stühle, Sofas und Nummer einfügen. ABER: die bestellten Mengen müssen dann jeweils zusammengerechnet werden.
    * Das kann ich mir gerne beim nächstem Mal anschauen :) 
    */
    
}
