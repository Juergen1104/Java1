package Michelle.Aufgabe_3;

public class Aufgabe_3_4 {

    /* Aufgabenteil (a) */
    // 4
    public static void maskBlock(int[][] img, int x0, int deltaX, int y0, int deltaY) {

        int summePixelWerte = 0;
        int anzahlPixel = 0;
        int mittelwert = 0;

        for (int i = x0; i < x0 + deltaX - 1; i++) {

            if (i > img.length - 1) {
                break;
            }

            for (int j = y0; j < y0 + deltaY - 1; j++) {

                if (j > img[i].length - 1) {
                    break;
                }

                summePixelWerte = summePixelWerte + img[i][j];
                anzahlPixel++;

            }
        }

        try {

            mittelwert = summePixelWerte / anzahlPixel;

        } catch (ArithmeticException e) {

            System.out.println(summePixelWerte);
        }


        for (int i = x0; i < x0 + deltaX - 1; i++) {
            if (i > img.length - 1) {
                break;
            }
            for (int j = y0; j < y0 + deltaY - 1; j++) {
                if (j > img[i].length - 1) {
                    break;
                }
                img[i][j] = mittelwert;
            }
        }

        summePixelWerte = 0;
        summePixelWerte = 0;
        mittelwert = 0;
    }

    /* Aufgabenteil (b) */
    // 2
    public static void blockify(int[][] img, int deltaX, int deltaY) {

        int laenge = (img[0].length / deltaY + 1) * (img.length / deltaX + 1);

        int[] xWerte = new int[laenge];
        int[] yWerte = new int[laenge];
        int zaehler = 0;

        for (int i = 0; i < img.length - 1; i = i + deltaX) {
            for (int j = 0; j < img[i].length - 1; j = j + deltaY) {
                xWerte[zaehler] = i;
                yWerte[zaehler] = j;
                zaehler++;
            }
        }

        for (int i = 0; i < xWerte.length - 1; i++) {
            maskBlock(img, xWerte[i], deltaX, yWerte[i], deltaY);
        }


    }

    public static void main(String[] args) {
        int deltaX = 50, deltaY = 100;
//        do {
//            deltaX = IOTools.readInteger("Blockgroesse x: ");
//            deltaY = IOTools.readInteger("Blockgroesse y: ");
//        } while ((deltaX < 2) || (deltaY < 2));

        // Breite 1200 Hoehe 1576

        int[][] img = ImageTools.getImageDataFromFile("src/Michelle/Aufgabe_3/Lincoln2.png");

        blockify(img, deltaX, deltaY);
        ImageTools.writeImageDataToFile(img, "Blocks-" + deltaX + "-" + deltaY + ".png");
    }
}
