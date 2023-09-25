package Michelle_2;

public class Aufgabe_2_1 {
    public static void main(String[] args){
       
	/* *** Aufgabenteil (a)  *** */
        // 1
	/* 
	    // TODO
            
	 */
	int n = IOTools.readInteger("n = ");

	boolean erg1;

        n = (n < 0) ? -n : n;

        while (n > 0) {
            n--;
            n--;
        }

        erg1 = (n == 0);
	
	System.out.println("(a) Ergebnis:   = " + erg1 + "\n");

        
 	System.out.println("\n***********************\n");


        /* *** Aufgabenteil (b)  *** */
        // 2
	/* 
           // TODO

        */
        
        int a = IOTools.readInteger("a = ");
        int A = a;    // Originalwert von a merken
        int b = IOTools.readInteger("b = ");
        int B = b;    // Originalwert von b merken
	int erg2;

	if ((a <= 0) && (b <= 0)) {
            while ((a != 0) && (b != 0)) {
                a++;
                b++;
            }
            erg2 = (a == 0) ? A : B;
        }
        else if ((a >= 0) && (b >= 0)) {
            while ((a != 0) && (b != 0)) {
                a--;
                b--;
            }
            erg2 = (a == 0) ? B : A;
        }
        else if (a < 0) {
            erg2 = B;
        }
        else {
            erg2 = A;
        }

	System.out.println("(b) Ergebnis:   = " + erg2 + "\n");

 	System.out.println("\n***********************\n");

        
	/* *** Aufgabenteil (c)  *** */
        // 2
	/* 
	   // TODO

	 */

        /* Hier werden zunaechst zwei Werte a, b mit
           a >= 0 und b >= 0 eingelesen
         */
        do {
            a = IOTools.readInteger("a = ");
        } while (a <= 0);
        do {
            b = IOTools.readInteger("b = ");
        } while (b <=0);

 
        
	int x=0,y=0,z=0;

	for (int i=1;i<=a;i++){
	    y += b;
	    for (int j=1;j<=a;j++,x++){}
	}

	for (int i=1;i<=b;i++){
	    y += a;
	    for (int j=1;j<=b;j++,z++){}
	}	
	
	int erg3 = x + y + z;
	
	System.out.println("(c) Ergebnis:   = " +  erg3);

 
        
 	System.out.println("\n***********************\n");

 
    }
}

