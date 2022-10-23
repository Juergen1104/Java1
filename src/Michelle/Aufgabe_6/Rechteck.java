package Michelle.Aufgabe_6;

/* ***    Aufgabenteil (c)    *** */

class Rechteck extends Polygon {

    public Rechteck(Farbe farbe, double x, double y, double breite, double hoehe) {

        super();

        Punkt[] punkt = new Punkt[4];
        punkt[0] = new Punkt(x, y);                              // unten links
        punkt[1] = new Punkt(x + breite, y);                  // unten rechts
        punkt[2] = new Punkt(x + breite, y + hoehe);       // oben rechts
        punkt[3] = new Punkt(x, y + hoehe);                   // oben links


        Rechteck r1 = new Rechteck(farbe, punkt);
        this.setFarbe(r1.getFarbe());
        this.ecken = r1.ecken;


    }

    public Rechteck(Farbe farbe, Punkt[] ecken) {
        super(farbe, ecken);

    }


    public Rechteck(double x, double y, double breite, double hoehe) {

        Rechteck rechteck = new Rechteck(Farbe.SCHWARZ, x, y, breite, hoehe);
    }

    public Rechteck(Rechteck rechteck) {

        super(rechteck.ecken);
        super.setFarbe(rechteck.getFarbe());




        //todo

    }


}



