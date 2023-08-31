/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author 
 * @version 20.10.2015
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettServer;
    private Textfeld hatTextfeldIp;
    private Knopf hatKnopfAnfrage;
    private Etikett hatEtikettZeit;
    private Etikett hatEtikettKeineZeit;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(500, 200);

        hatEtikettServer = new Etikett(46, 47, 100, 25, "Server:");
        // Ausrichtung
        hatEtikettServer.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldIp = new Textfeld(150, 47, 100, 25, "IP");
        // Ausrichtung
        hatTextfeldIp.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfAnfrage = new Knopf(255, 47, 100, 25, "Anfrage");
        hatKnopfAnfrage.setzeBearbeiterGeklickt("hatKnopfAnfrageGeklickt");
        hatEtikettZeit = new Etikett(47, 81, 100, 25, "Zeit:");
        // Ausrichtung
        hatEtikettZeit.setzeAusrichtung(Ausrichtung.LINKS);
        hatEtikettKeineZeit = new Etikett(151, 81, 204, 25, "- keine Zeit -");
        // Ausrichtung
        hatEtikettKeineZeit.setzeAusrichtung(Ausrichtung.LINKS);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfAnfrage fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfAnfrageGeklickt()
    {
       Connection lConnection = new Connection(hatTextfeldIp.inhaltAlsText(),13);
       hatEtikettKeineZeit.setzeInhalt(lConnection.receive());
    }

}
