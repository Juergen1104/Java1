package Michelle_1.Aufgabe_8;

public class IndizierteSequenz {
    private int[] werte;

    public IndizierteSequenz(int n){
        this.werte = new int[n];
        for (int i=0;i <n;i++){
            this.werte[i] = (int)(Math.random()*100) + 1;
        }
    }

    /* *** Aufgabenteil (b) *** */


}
