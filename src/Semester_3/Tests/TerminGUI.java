package Semester_3.Tests;

import java.awt.*;
import javax.swing.*;

public class TerminGUI extends JFrame {
  private JComboBox<Integer> yearComboBox;
  private JComboBox<String> monthComboBox;
  private JComboBox<Integer> dayComboBox;
  private JComboBox<Integer> hourComboBox;
  private JComboBox<Integer> minuteComboBox;
  private JTextField descriptionTextField;
  private JTextArea termListTextArea;

  public TerminGUI() {
    setTitle("Terminverwaltung");
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel mainPanel = new JPanel(new GridLayout(8, 2));

    // Labels
    JLabel yearLabel = new JLabel("Jahr:");
    JLabel monthLabel = new JLabel("Monat:");
    JLabel dayLabel = new JLabel("Tag:");
    JLabel hourLabel = new JLabel("Stunde:");
    JLabel minuteLabel = new JLabel("Minute:");
    JLabel descriptionLabel = new JLabel("Beschreibung:");
    JLabel termListLabel = new JLabel("Termine:");

    // Combo Boxes
    yearComboBox = new JComboBox<>(new Integer[] {2023, 2024, 2025});
    monthComboBox =
        new JComboBox<>(
            new String[] {
              "Januar",
              "Februar",
              "März",
              "April",
              "Mai",
              "Juni",
              "Juli",
              "August",
              "September",
              "Oktober",
              "November",
              "Dezember"
            });
    dayComboBox = new JComboBox<>(generateIntegerArray(1, 31));
    hourComboBox = new JComboBox<>(generateIntegerArray(0, 23));
    minuteComboBox = new JComboBox<>(generateIntegerArray(0, 59));

    // Text Fields
    descriptionTextField = new JTextField();
    termListTextArea = new JTextArea();
    termListTextArea.setEditable(false);

    // Buttons
    JButton addTermButton = new JButton("Termin hinzufügen");
    JButton showListButton = new JButton("Liste anzeigen");

    // Action Listeners (Implementieren Sie die Interaktion in der nächsten Aufgabe)
    addTermButton.addActionListener(e -> addTerm());
    showListButton.addActionListener(e -> showList());

    // Add components to the main panel
    mainPanel.add(yearLabel);
    mainPanel.add(yearComboBox);
    mainPanel.add(monthLabel);
    mainPanel.add(monthComboBox);
    mainPanel.add(dayLabel);
    mainPanel.add(dayComboBox);
    mainPanel.add(hourLabel);
    mainPanel.add(hourComboBox);
    mainPanel.add(minuteLabel);
    mainPanel.add(minuteComboBox);
    mainPanel.add(descriptionLabel);
    mainPanel.add(descriptionTextField);
    mainPanel.add(termListLabel);
    mainPanel.add(termListTextArea);
    mainPanel.add(addTermButton);
    mainPanel.add(showListButton);

    add(mainPanel);
    setVisible(true);
  }

  private Integer[] generateIntegerArray(int start, int end) {
    Integer[] array = new Integer[end - start + 1];
    for (int i = 0; i <= end - start; i++) {
      array[i] = start + i;
    }
    return array;
  }

  // Dummy method for adding a term
  private void addTerm() {
    String term =
        String.format(
            "%02d.%02d.%d %02d:%02d - %s%n",
            dayComboBox.getSelectedItem(),
            monthComboBox.getSelectedIndex() + 1,
            yearComboBox.getSelectedItem(),
            hourComboBox.getSelectedItem(),
            minuteComboBox.getSelectedItem(),
            descriptionTextField.getText());

    termListTextArea.append(term);
    clearFields();
  }

  // Dummy method for showing the list
  private void showList() {
    // Implementieren Sie die Anzeige der Termine in der Liste hier
  }

  private void clearFields() {
    dayComboBox.setSelectedIndex(0);
    monthComboBox.setSelectedIndex(0);
    yearComboBox.setSelectedIndex(0);
    hourComboBox.setSelectedIndex(0);
    minuteComboBox.setSelectedIndex(0);
    descriptionTextField.setText("");
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new TerminGUI());
  }
}
