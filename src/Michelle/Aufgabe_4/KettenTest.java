package Michelle.Aufgabe_4;

import static Michelle.Aufgabe_4.Ketten.abschluss;

public class KettenTest {
    public static void main(String[] args) {
        String[] ketten = new String[5];

        /* *** Aufgabenteil (b) *** */
        // 4

        String p1 = "xxx";
        String p2 = "ooo";
        String p3 = "[0]";

        // #-xxx-xxx-xxx-[0]-xxx-xxx-xxx-# 3 Aufrufe
        ketten[0] = abschluss(Ketten.verbinden(Ketten.verbinden(p1, 3), p3, Ketten.verbinden(p1, 3)));

        // #-xxx-ooo-xxx-ooo-xxx-ooo-xxx-# 3 Aufrufe
        ketten[1] = abschluss(Ketten.verbinden(Ketten.verbinden(p1, p2, p1), Ketten.verbinden(p2, p1, p2), p1));

        // #-xxx-xxx-ooo-ooo-[0]-ooo-ooo-xxx-xxx-# 5 Aufrufe todo
        ketten[2] = abschluss(Ketten.verbinden(Ketten.verbinden(Ketten.verbinden(p1, 2), (Ketten.verbinden(p2, 2)), p3), (Ketten.verbinden(Ketten.verbinden(p2, 2), Ketten.verbinden(p1, 2)))));

        // #-xxx-xxx-ooo-ooo-[0]-ooo-ooo-xxx-xxx-# 4 Aufrufe
        ketten[3] = abschluss(Ketten.verbinden((Ketten.verbinden(p1, p2, p3)), (Ketten.verbinden(p1, p3, p1)), (Ketten.verbinden(p3, p2, p1))));

        for (int i = 0; i < ketten.length; i++) {
            System.out.println((i + 1) + ")  " + ketten[i]);
        }
    }
}
