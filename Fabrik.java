import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Fabrik.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fabrik
{
    // Instanzen gemäss Musterlösung
    // Feedback Cha: ich würde den untenstehenden Kommentar (und allgemein?) immer oberhalb des Codes machen, für weniger Verwirrung)
    private ArrayList<Bestellung> bestellungen; //basierend auf Typ Bestellung machen wir eine Liste namens bestellungen
    private int bestellungsNr;

    /**
     * Konstruktor für Objekte der Klasse Fabrik
     */
    public Fabrik()
    {
        // Instanzvariable initialisieren
        //bestellungen = Liste aller eingetroffenen Bestellungen vom Typ ArrayList
        bestellungen = new ArrayList<Bestellung>();
        bestellungsNr = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    //
    public void main()
    {
        //
    }
    
    /** 
    * Feedback Cha: Warum ist "chairs" auf Englisch? Und warum sofa im Singular? Ich würde beides auf Deutsch und entweder sg oder pl. :)
    * Sind die Kommentare innerhalb des Blocks (den geschweiften Klammern) nicht etwas verwirrend?
    * Wenn man nun eine Bestellung aufgibt, kann man hier schon angeben, ob es Stühle oder Sofas sein sollen? 
    * sagt die Funktion "bestellungen.add(new Bestellung());" dem System das? Oder muss man evtl. mit einer weiteren Funktion vorher angeben, was bestellt wird? 
    * vielleicht so: 
    * bestellungsNr = bestellungsNr+1;
    * Bestellung eineBestellung = new Bestellung(bestellungsNr, sofa, chairs);
    * bestellungen.add(new Bestellung);
    */
    public void bestellungAufgeben(int sofa, int chairs)
    {
           //Bestellung aufgeben -->referenziert Klasse Bestellung und called Konstruktorfunktion von Bestellung
           //Bestellung der Liste hinzufügen
           bestellungen.add(new Bestellung());
           //Bestellungsnummer erhöhen
           bestellungsNr= bestellungsNr+1;     
           
           //Print zur Übersicht
           System.out.println("Bestellung erfolgreich aufgegeben");
    }
    
    //public void speichereNotiz(String notiz)

    //{
      //  notizen.add(notiz);
    //}
    
    /**
    * Feedback Cha
    * Hier muss meiner Meinung rein, was geprintet werden soll. Untenstehend mein Input:
    * System.out.println("Bestellnummer: " + bestellung.gibBestellungsNr());
    * System.out.println("Anzahl Stühle: " + bestellung.gibAnzahlStuehle()); --> hier schauen, dass Stuehle konsistent geschrieben ist
    * System.out.println("Anzahl Sofas: " + bestellung.gibAnzahlSofas()); --> hier schauen, dass Sofas konsistent geschrieben ist
    * System.out.println("Beschaffungszeit: " + bestellung.gibBeschaffungsZeit());
    * System.out.println("Bestellbestätigung: " + bestellung.gibBestellBestaetigung());
    * System.out.println();
    */
    public void bestellungAusgeben()
    {
        //for(Klasse_BeschreibenderNamefür diese lokale Variable: in Liste bestellungen
        //Jedes El. der Liste "bestellungen" wird unter eineBestellung gespeichert und anschliessend geprintet
        for(Bestellung eineBestellung: bestellungen) {
            System.out.println(eineBestellung);
        }
    }
     /**
    * Feedback Cha
    * braucht es noch eine Methode um das Programm zu starten?
    */
    
}
