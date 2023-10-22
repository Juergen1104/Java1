package Michelle_1.Aufgabe_7;

public class DNA2AA {

  /* *** Aufgabenteil (a) *** */
  // 1
  private static boolean isDNA(String s) {

    if (s.matches("[ACTG+]*")) {
      return true;
    } else return false;
  }

  /* *** Aufgabenteil (b) *** */
  // 2
  private static StringBuffer dna2rna(String s) {

    StringBuffer stringBuffer = new StringBuffer(s);
    char[] array = new char[stringBuffer.length()];
    stringBuffer.getChars(0, stringBuffer.length(), array, 0);
    String replace = "";

    for (int i = 0; i < stringBuffer.length(); i++) {
      switch (array[i]) {
        case 'A':
          replace = "U";
          break;
        case 'T':
          replace = "A";
          break;
        case 'C':
          replace = "G";
          break;
        case 'G':
          replace = "C";
          break;
        default:
          System.out.println("Ungültiger Wert in DNA String : " + array[i]);
          break;
      }
      stringBuffer.replace(i, i + 1, replace);
    }
    return stringBuffer;
  }

  /* *** Aufgabenteil (c) *** */
  // 3
  private static String mapTriplet(String s) {

    String replaceString = "";

    switch (s) { // todo Umschlüsselung????
      case "UUU":
      case "UUC":
        replaceString = "Phe";
        break;
        //      case "UUA", "UUG", "CUU", "CUC", "CUA", "CUG":
        //        replaceString = "Leu";
        //        break;
        //      case "AUU", "AUC", "AUA":
        //        replaceString = "Ile";
        //        break;
        //      case "AUG":
        //        replaceString = "Met";
        //        break;
        //      case "GUU", "GUC", "GUA", "GUG":
        //        replaceString = "Val";
        //        break;
        //      case "UCU", "UCC", "UCA", "UCG", "AGU", "AGC":
        //        replaceString = "Ser";
        //        break;
        //      case "CCU", "CCC", "CCA", "CCG":
        //        replaceString = "Pro";
        //        break;
        //      case "ACU", "ACC", "ACA", "ACG":
        //        replaceString = "Thr";
        //        break;
        //      case "GCC", "GCU", "GCA", "GCG":
        //        replaceString = "Ala";
        //        break;
        //      case "UAU", "UAC":
        //        replaceString = "Tyr";
        //        break;
        //      case "CAU", "CAC":
        //        replaceString = "His";
        //        break;
        //      case "CAA", "CAG":
        //        replaceString = "Gln";
        //        break;
        //      case "AAU", "AAC":
        //        replaceString = "Asn";
        //        break;
        //      case "AAA", "AAG":
        //        replaceString = "Lys";
        //        break;
        //      case "GAU", "GAC":
        //        replaceString = "Asp";
        //        break;
        //      case "GAA", "GAG":
        //        replaceString = "Glu";
        //        break;
        //      case "UGU", "UGC":
        //        replaceString = "Cys";
        //        break;
        //      case "UGG":
        //        replaceString = "Trp";
        //        break;
        //      case "CGU", "CGC", "CGA", "CGG", "AGA", "AGG":
        //        replaceString = "Arg";
        //        break;
        //      case "GGU", "GGC", "GGA", "GGG":
        //        replaceString = "Gly";
        //        break;
        //      case "UAA", "UAG", "UGA":
        //        replaceString = "Stop";
        //        break;
    }
    return replaceString; // Dummy Return
  }

  // 3
  private static StringBuffer rna2aa(StringBuffer rnaBuf) {

    String rna2Amino = "";
    String amino = "";
    int laengeRnaBuf = rnaBuf.length();
    int startIndex = rnaBuf.indexOf("AUG");
    int aminoIndex = 0;

    StringBuffer resultBuffer = new StringBuffer();

    if (startIndex < 0) {
      System.out.println("kein Startsignal in Sequenz gefunden");
      return null;
    }
    for (int i = startIndex + 3; i < laengeRnaBuf - 2; i = i + 3) {
      rna2Amino = rnaBuf.substring(i, i + 3);
      amino = mapTriplet(rna2Amino);

      if (amino == "Stop") {
        int sequenceLenth = resultBuffer.length();
        resultBuffer.replace(sequenceLenth - 3, sequenceLenth, "   ");
        int s = 0;
        break;
      }
      resultBuffer.append(amino + " - ");
    }

    int a = 8;
    return resultBuffer;
  }

  public static void main(String[] args) {

    if (args.length == 1) { // Genau ein Argument erforderlich
      // 1

      if (isDNA(args[0])) {
        // StringBuffer rna = dna2rna(args[0]) ;
        StringBuffer rna = dna2rna("TACAAGCAGTTAGTCGTGGAAACACCAAGTATC");
        StringBuffer aminos = rna2aa(rna);

        System.out.println(rna);
        System.out.println(aminos);

      } else {
        System.out.println("String stellt keine DNA dar");
      }

    } else {
      System.out.println("Falsche Anzahl Argumente");
      System.out.println("Aufruf: java DNA2AA <DNA Sequenz>");
    }
  }
}
