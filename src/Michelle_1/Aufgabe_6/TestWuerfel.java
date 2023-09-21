package Michelle_1.Aufgabe_6;

public class TestWuerfel {

    public static void main(String[] args) {
        int n = 6, k = 3;
        Wuerfel[] wuerfel = new Wuerfel[n];

        /* *** Aufgabenteil (c) *** */
        // 2
        wuerfel[0] = new ZahlenWuerfel(6);
        wuerfel[1] = new ZahlenWuerfel(6);
        wuerfel[2] = new ZahlenWuerfel(12);
        wuerfel[3] = new ZahlenWuerfel(12);
        wuerfel[4] = new Farbwuerfel();
        wuerfel[5] = new Farbwuerfel();

        for (int i = 1; i < k + 1; i++) {
            System.out.println(i + ". Wurf");
            for (int j = 0; j < wuerfel.length; j++) {
                wuerfel[j].werfen();
                System.out.println(wuerfel[j].toString());
            }
        }
    }
}
