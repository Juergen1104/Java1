package Michelle.Aufgabe_3;

public class Aufgabe_3_4 {

    /* Aufgabenteil (a) */
    // 4
    public static void maskBlock(int[][] img, int x0, int deltaX, int y0, int deltaY){


    }

    /* Aufgabenteil (b) */
    // 2
    public static void blockify(int[][] img, int deltaX, int deltaY) {


    }

    public static void main(String[] args){
        int deltaX=0, deltaY=0;
        do {
            deltaX = IOTools.readInteger("Blockgroesse x: ");
            deltaY = IOTools.readInteger("Blockgroesse y: ");
        } while ((deltaX < 2) || (deltaY < 2));

        int[][] img = ImageTools.getImageDataFromFile("src/Michelle/Aufgabe_3/Lincoln2.png");

        blockify(img,deltaX,deltaY);
        ImageTools.writeImageDataToFile(img,"Blocks-" + deltaX + "-" + deltaY + ".png");
    }
}
