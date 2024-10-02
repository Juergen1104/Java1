package Klausur;

public class Buch {
  private String autor;
  private String titel;
  private String genre;

  public Buch(String a, String t, String g) {
    this.autor = a;
    this.titel = t;
    this.genre = g;
  }

  public String getGenre() {
    return this.genre;
  }
}
