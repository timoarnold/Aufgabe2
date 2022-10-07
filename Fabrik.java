import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Fabrik.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fabrik
{
    // Instanzen gemäss MUsterlösung
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
    public void bestellungAusgeben()
    {
        //for(Klasse_BeschreibenderNamefür diese lokale Variable: in Liste bestellungen
        //Jedes El. der Liste "bestellungen" wird unter eineBestellung gespeichert und anschliessend geprintet
        for(Bestellung eineBestellung: bestellungen){
            System.out.println(eineBestellung);
        }
    }
}