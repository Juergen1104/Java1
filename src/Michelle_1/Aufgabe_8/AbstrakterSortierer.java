package Michelle_1.Aufgabe_8;

public abstract class AbstrakterSortierer {

    public void ausgeben(Sequenz s){
        for (int i=0;i<s.size();i++){
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
    }

    public abstract void sortieren(Sequenz s);

}
