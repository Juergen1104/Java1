package Michelle_3;

public class Aufgabe_3_2 {

    // 3
    public static int[][] diff(int[][] img1, int[][] img2) {
        int h = img1.length;
        int w = img1[0].length;

        int[][] diffImg = new int[h][w];
        int diff = 0;

        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < w - 1; j++) {

                int a = img1[i][j];
                int b = img2[i][j];

                diff = Math.abs(img1[i][j] - img2[i][j]);

                if (diff > 50) {
                    diffImg[i][j] = diff;
                }
            }
        }
        return diffImg;
    }

    public static void detectMovingObject(int[][] img1, int[][] img2, int[][] img3) {
        int[][] diffImg1 = diff(img1, img2); // Differenzbild (Bild1 - Bild2)
        int[][] diffImg2 = diff(img1, img3); // Differenzbild (Bild1 - Bild3)


        if ((diffImg1 != null) && (diffImg2 != null)) {
            // Ausgabe der Diff-Bilder in Dateien
            ImageTools.writeImageDataToFile(diffImg1, "diff-1-2.png");
            ImageTools.writeImageDataToFile(diffImg2, "diff-1-3.png");
        }

        int h = img1.length;
        int w = img1[0].length;

        int[][] resImg1 = new int[h][w];
        int[][] resImg2 = new int[h][w];
        int[][] resImg3 = new int[h][w];


        for (int i = 0; i < h - 1; i++) {
            for (int j = 0; j < w - 1; j++) {

                if ((diffImg1[i][j] > 0) && (diffImg2[i][j] > 0)) {
                    resImg1[i][j] = 255;
                }
                if ((diffImg1[i][j] != 0) && (diffImg2[i][j] == 0)) {
                    resImg2[i][j] = 255;
                }
                if ((diffImg2[i][j] != 0) && (diffImg1[i][j] == 0)) {
                    resImg3[i][j] = 255;
                }
            }
        }


        if ((resImg1 != null) && (resImg2 != null) && (resImg2 != null)) {
            ImageTools.writeImageDataToFile(resImg1, "object-1.png");
            ImageTools.writeImageDataToFile(resImg2, "object-2.png");
            ImageTools.writeImageDataToFile(resImg3, "object-3.png");
        }

    }


    public static void main(String[] args) {

        // todo chagne file location back to original location

        // String filename1 = "bilder/bild-0.jpg";
        //String filename2 = "bilder/bild-1.jpg";
        //String filename3 = "bilder/bild-2.jpg";
        String filename1 = "src/Michelle_3/bilder/bild-0.jpg";
        String filename2 = "src/Michelle_3/bilder/bild-1.jpg";
        String filename3 = "src/Michelle_3/bilder/bild-2.jpg";


        int[][] img1 = ImageTools.getImageDataFromFile(filename1);
        int[][] img2 = ImageTools.getImageDataFromFile(filename2);
        int[][] img3 = ImageTools.getImageDataFromFile(filename3);

        detectMovingObject(img1, img2, img3);

    }
}
