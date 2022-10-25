

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * Die Test-Klasse FabrikTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class FabrikTest
{
    private Fabrik fabrik; 

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @BeforeEach
    public void setUp()
    {
       fabrik = new Fabrik(); 
    }

    /**
     * Gibt das Testgerüst wieder frei. -->Brauchen wir sicher nicht
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @AfterEach
    public void tearDown()
    {
        
    }
    
    @Test
    public void TestBestellungsNummer(){
        //Act
        fabrik.bestellungAufgeben(2,3);
        fabrik.bestellungAufgeben(1,1);

        //Assert
        assertEquals(2, fabrik.gibBestellungsNr());
        
        /**
         * Getestet, ob richtige Bestellnummer, wenn Instanz Fabrik 
         * erzeugt und 2 Testbestellungen aufgegeben.
         */
    }
    
    @Test
    public void TestBestellungAusgeben(){
        //Act
        fabrik.bestellungAufgeben(2,3);
        fabrik.bestellungAufgeben(6,6);
        
        //Assert
        assertEquals("Bestellnummer:"+1+"\nStühle bestellt:"+2+"\nSofas bestellt:"+3,fabrik.gibBestellungen().get(0).toString());
        assertEquals("Bestellnummer:"+2+"\nStühle bestellt:"+6+"\nSofas bestellt:"+6,fabrik.gibBestellungen().get(1).toString());
        /**
         * Hier wird getestet, ob die erste (Index 0) und die zweite (Index 1) Bestellung der ArrayList bestellungen den Erwartungen entspricht.
         * Merke: Testfabrik.gibBestellungen().get(0).toString() entspricht System.out.println(eineBestellung) aus Fabrik.bestellungAusgeben
         */
    
    }
    
    @Test
    public void TestBestellungAufgeben(){
        //Act
        fabrik.bestellungAufgeben(4,7);
        
        
        //Assert
        assertEquals(4, fabrik.gibBestellungen().get(0).gibAnzahlStuehle());
        assertEquals(7, fabrik.gibBestellungen().get(0).gibAnzahlSofas());
        
        Bestellung.resetBestellnummerGenerator();
        /**
         * BestellnummerGenerator wird nach diesem Test auf 1 zurückgesetzt, damit die Bestellnummern in weiteren Unit-Tests erneut 
         * von Anfang an hochzählen können. 
         */
    
    }
}

