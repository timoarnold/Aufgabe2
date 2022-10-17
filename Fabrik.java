import java.util.ArrayList;
import java.io.*;
/**
 * Beschreiben Sie hier die Klasse Fabrik.
 * 
 * @author (Gruppe 29) 
 * @version (Version 2)
 */
public class Fabrik
{
    /** 
     * Instanzen gemäss Musterlösung,
     * Basierend auf Typ Bestellung machen wir eine Liste namens bestellungen
    */
   
    private ArrayList<Bestellung> bestellungen; 
    private int bestellungsNr;

    /**
     * Konstruktor für Objekte der Klasse Fabrik
     */
    
    public Fabrik()
    {
        /**
         *Instanzvariable initialisieren
         *bestellungen = Liste aller eingetroffenen Bestellungen vom Typ ArrayList
        */
       
        bestellungen = new ArrayList<Bestellung>();
        bestellungsNr = 0;
    }

    /**
     * Main-Methode
     * bisher noch nicht aufgesetzt
     */
    //
    
    public static void main(String[] args){
                 
        //String anzStuhl, anzSofa;
        //int sofa, stuhl, anzahlStuehle1, anzahlSofas1;
        
        System.out.println("Ausgabe aus der main()-Methode:");
        
        //anzahlSofas1 = Integer.parseInt(args[0]);
        //anzahlStuehle1 = Integer.parseInt(args[1]);
        
        //Fabrik Test1= new Fabrik();
        
        ////1:1 so aus VL-Folien eigefügt:
        //BufferedReader infile =
        //new BufferedReader ( new InputStreamReader (System.in));
        //System.out.println("Bitte gib die Anzahl Sofas an, die du bestellen möchtest");
        
        
    }
        //fakrik1 = new Fabrik ();
        //While / for-Schleife: Solang nicht XY passiert, geht die Main-Methode alles durch und gibt XY aus..
    

    
    
    /** 
    * Wenn man nun eine Bestellung aufgibt, kann man hier schon angeben, ob es Stühle oder Sofas sein sollen? -->Ja, wird im UI angezeigt :)
    * sagt die Funktion "bestellungen.add(new Bestellung());" dem System das? Oder muss man evtl. mit einer weiteren Funktion vorher angeben, was bestellt wird? 
    * vielleicht so: 
    * bestellungsNr = bestellungsNr+1;
    * Bestellung eineBestellung = new Bestellung(bestellungsNr, sofa, chairs);
    * bestellungen.add(new Bestellung);
    * 
    * Flo: Durch bestellungAufgeben wird eine neue Instanz der Klasse Bestellung erstellt und in der Array "bestellungen" gespeichert.
    * Zudem wird hier festgelegt, dass die Bestellung nur positive Werte enthalten darf (Keine Minusbestellungen).
    */
    public void bestellungAufgeben(int sofa, int stuhl){
    
           /**
            * Check, ob Bestellungseingabe gültig oder nicht -->Merke: "||" bedeutet hier logisches "oder".
            * Merke auch "=" ist eine Zuweisung / "==" ein Vergleich
            */
          
          if (sofa<0 || stuhl<0 || sofa+stuhl==0){
               System.out.println("Bitte geben sie eine positiven Bestellbetrag ein");
           }
           else {
               
               /**Bestellung aufgeben -->referenziert Klasse Bestellung und callt Konstruktorfunktion von Bestellung
                * Bestellung der Liste "bestellungen" hinzufügen
                */
              
               bestellungen.add(new Bestellung(sofa,stuhl));
           
               //Bestellungsnummer erhöhen
               bestellungsNr= bestellungsNr+1;     
           
               //Print zur Übersicht
               System.out.println("Bestellung erfolgreich aufgegeben");
           }
           
    }
    
    /**
    * Feedback Cha
    * Hier muss meiner Meinung rein, was geprintet werden soll. Untenstehend mein Input:
    * System.out.println("Bestellnummer: " + bestellung.gibBestellungsNr());
    * System.out.println("Anzahl Stühle: " + bestellung.gibAnzahlStuehle()); --> hier schauen, dass Stuehle konsistent geschrieben ist
    * System.out.println("Anzahl Sofas: " + bestellung.gibAnzahlSofas()); --> hier schauen, dass Sofas konsistent geschrieben ist
    * System.out.println("Beschaffungszeit: " + bestellung.gibBeschaffungsZeit());
    * System.out.println("Bestellbestätigung: " + bestellung.gibBestellBestaetigung());
    * System.out.println();
    * 
    * Flo: Ergänzt & unterste 2 get-Funktionen in Dummy-FUnktionen innerhalb Kommentare, 
    * da noch keine entsprechende Variable in Klasse Bestellung implementiert
    */
   
    public void bestellungAusgeben() {
        //
        /**Für jede "eineBestellung aus der Liste bestellungen, gibt es de unten programmierte Meldung wieder"
         */
         //for(Klasse_BeschreibenderNamefür diese lokale Variable: in Liste bestellungen
        //Jedes El. der Liste "bestellungen" wird unter eineBestellung gespeichert und anschliessend geprintet
        System.out.println("Total Bestellungen bisher:"+bestellungsNr);
        
        for(Bestellung eineBestellung: bestellungen) {
            
            System.out.println("Bestellnummer:" + eineBestellung.gibBestellNummer());
            System.out.println("Stühle bestellt:" + eineBestellung.gibAnzahlStuehle());
            System.out.println("Sofas bestellt:" + eineBestellung.gibAnzahlSofas());
        }
            
            /** Aternativ auch noch: 
             * System.out.println("Beschaffungszeit:" + eineBestellung.gibxxxxxx()); -->Sobald eine entsprechende Variable erstellt in Bestellungen
             * System.out.println("Bestellbestätigung:" + eineBestellung.gibxxxxx());-->Sobald eine entsprechende Variable erstellt in Bestellungen
             */
    
    }
     /**
    * Feedback Cha
    * braucht es noch eine Methode um das Programm zu starten?
    * 
    * Flo: Programm wird aktuell durch die Klasse Fabrik gestartet, bei Erstellung einer Instanz. 
    * Main ist noch to do.
    */
    
}
