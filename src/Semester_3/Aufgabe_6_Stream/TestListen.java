package Semester_3.Aufgabe_6_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestListen {
  public static void main(String[] args) {
    Teilnehmer[] teilnehmer = TestData.getTeilnehmerFeld();

    List<Teilnehmer> teilnehmerNeu = Arrays.asList(teilnehmer);

    List<Teilnehmer> sortedTeilnehmer =
        teilnehmerNeu.stream()
            .sorted(
                Comparator.comparing(Teilnehmer::getZeit).thenComparing(Teilnehmer::getJahrgang))
            .toList();

    sortedTeilnehmer.forEach(System.out::println);

    //    List<Student> sortedStudents = Arrays.stream(students)
    //            .sorted(Comparator.comparing(Student::getGrade).reversed()
    //                    .thenComparing(Student::getAge))
    //            .collect(Collectors.toList());
    //
    //    for (Student student : sortedStudents) {
    //      System.out.println(student.getName() + ", " + student.getGrade() + ", " +
    // student.getAge());
    //    }

    //    /* *** Aufgabe 2c *** */
    //
    //    Liste liste[] = new Liste[3];
    //    liste[0] = new Liste();
    //    liste[1] = new SortierteListe();
    //    liste[2] = new ListenFeld();
    //
    //    for (Teilnehmer ele : teilnehmer) {
    //      liste[0].insert(ele);
    //      liste[1].insert(ele);
    //      liste[2].insert(ele);
    //    }
    //
    //    liste[0].print();
    //    System.out.println("------------------");
    //    liste[1].print();
    //    System.out.println("------------------");
    //    liste[2].print();
  }
}
