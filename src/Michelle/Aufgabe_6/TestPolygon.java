package Michelle.Aufgabe_6;

public class TestPolygon {
    public static void main(String[] args){

        DrawingPane dp = new DrawingPane(); // Zeichenflaeche generieren

        /* *** Aufgabenteil (d) *** */

        // Muster-Rechteck, welches der Zeichenflaeche hinzugefuegt wird
        Rechteck r = new Rechteck(Farbe.BLAU,-25,-25,50,50);
        dp.addShape(r);


        // Muster-Rechtecke, die selbst nicht der DrawingPanel
        // hinzugefuegt werden
        Rechteck r1 = new Rechteck(Farbe.ROT, -205,150,25,25);
        Rechteck r2 = new Rechteck(Farbe.ROT, -205,-175,25,25);



        /* *********************** */

        dp.setVisible(true);  // Zeichenflaeche mit Objekten anzeigen
    }
}

