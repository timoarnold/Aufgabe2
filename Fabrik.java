import java.util.ArrayList;
import java.io.*;
/**
 * Beschreiben Sie hier die Klasse Fabrik.
 * 
 * @author (Gruppe 29) 
 * @version (Version 2)
 * Test test
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
     * Flo: Hier wäre ich froh um Hilfe
     */
    
    public static void main(String[] args){
        
        System.out.println("Ausgabe aus der main()-Methode:");
        Fabrik fabrik= new Fabrik();
        
        boolean weiterBestellen = true;
        boolean invaliderInput = false;
        
        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Willkommen bei AEKI");
        
        while(weiterBestellen){
            int anzahlSofas;
            int anzahlStühle;
            String weiterBestellenString;
            
            try{
                if(!invaliderInput){
                    System.out.println("Geben Sie die Anzahl Sofas an, welche Sie bestellen möchten: ");
                    anzahlSofas = Integer.parseInt(infile.readLine().trim());
                    System.out.println("Geben Sie die Anzahl Stühle an, welche Sie bestellen möchten: ");
                    anzahlStühle = Integer.parseInt(infile.readLine().trim());
                    fabrik.bestellungAufgeben(anzahlSofas, anzahlStühle);
                    }
                System.out.print("Möchten Sie weiter bestellen? (ja/nein)");
                weiterBestellenString = infile.readLine();
                if(weiterBestellenString.equals("ja")){
                    weiterBestellen = true;
                    invaliderInput = false;
                    } 
                else if(weiterBestellenString.equals("nein")){
                    weiterBestellen = false;
                    invaliderInput = false;
                    }
                else{
                    System.out.println("Invalider Input, geben sie ja oder nein ein.");
                    invaliderInput = true;
                    }
                } 
            catch (Exception E){
                System.out.println("Invalider Input, geben sie eine Zahl ein.");
                }
            
            }
        fabrik.bestellungenAusgeben();
        }
        
    
    /** 
     * Durch bestellungAufgeben wird eine neue Instanz der Klasse Bestellung erstellt und in der Array "bestellungen" gespeichert.
     * Zudem wird hier festgelegt, dass die Bestellung nur positive Werte enthalten darf (Keine Minusbestellungen).
     */
    public void bestellungAufgeben(int sofa, int stuhl){
          if (sofa<0 || stuhl<0 || sofa+stuhl==0){
               System.out.println("Bitte geben sie eine positiven Bestellbetrag ein");
           }
           else {

               Bestellung bestellung = new Bestellung(sofa, stuhl);
               bestellungsNr++;
               bestellung.bestellungBestaetigen();
              
               bestellungen.add(bestellung);
           
               System.out.println("Bestellung erfolgreich aufgegeben");
           }
           
    }
    
    public int gibBestellungsNr(){
        return bestellungsNr;
    }
    
    public ArrayList<Bestellung> gibBestellungen(){
        return bestellungen;
    }
   
    /**
    * Für jede "eineBestellung aus der Liste bestellungen, gibt es de unten programmierte Meldung wieder"
    */
    public void bestellungenAusgeben() {

        System.out.println("Total Bestellungen bisher:"+bestellungsNr);
        
        for(Bestellung eineBestellung: bestellungen) {
            
            System.out.println(eineBestellung);
            
        }
    }
    
    /**
     * Gibt spezifische Bestellung wider
    */
    public void bestellungAusgeben(int spannendeBestellungNr) {
        
        
        System.out.println("Details der Bestellung mit der Nummer:" + spannendeBestellungNr);
        
        for(Bestellung eineBestellung: bestellungen) {
            
            if(spannendeBestellungNr==eineBestellung.gibBestellNummer()){
            System.out.println(eineBestellung);
            }
    
        }
    
    }
}