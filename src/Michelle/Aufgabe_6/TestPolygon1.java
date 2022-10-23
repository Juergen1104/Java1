package Michelle.Aufgabe_6;

public class TestPolygon1 {
    public static void main(String[] args) {

        DrawingPane dp = new DrawingPane(); // Zeichenflaeche generieren


        Punkt punkt1 = new Punkt(2, 4);
        Punkt punkt2 = new Punkt(punkt1);
        Punkt punkt3 = new Punkt(punkt1);
        Punkt punkt4 = new Punkt(7, 22);

        Punkt[] ecken = new Punkt[4];

        ecken[0] = new Punkt(1, 10);
        ecken[1] = new Punkt(2, 20);
        ecken[2] = new Punkt(3, 30);
        ecken[3] = new Punkt(4, 40);

        Polygon polygon = new Polygon(Farbe.ROT, ecken);

     //   polygon.move( 5,  40);

        polygon.scale(12,3);

        Rechteck rechteck = new Rechteck(Farbe.BLAU, 1,2,3,4);


        int a = 0;



//        /* *** Aufgabenteil (d) *** */
//
//        // Muster-Rechteck, welches der Zeichenflaeche hinzugefuegt wird
//        Rechteck r = new Rechteck(Farbe.BLAU,-25,-25,50,50);
//        dp.addShape(r);
//
//
//        // Muster-Rechtecke, die selbst nicht der DrawingPanel
//        // hinzugefuegt werden
//        Rechteck r1 = new Rechteck(Farbe.ROT, -205,150,25,25);
//        Rechteck r2 = new Rechteck(Farbe.ROT, -205,-175,25,25);
//
//
//
//        /* *********************** */
//
//        dp.setVisible(true);  // Zeichenflaeche mit Objekten anzeigen
    }
}

