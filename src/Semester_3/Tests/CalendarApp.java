package Semester_3.Tests;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;

public class CalendarApp extends JFrame {

  private JLabel monthLabel;
  private JPanel calendarPanel;

  public CalendarApp() {
    setTitle("Java Calendar");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    monthLabel = new JLabel("", JLabel.CENTER);
    JButton previousButton = new JButton("<<");
    JButton nextButton = new JButton(">>");

    calendarPanel = new JPanel(new GridLayout(7, 7));
    updateCalendar();

    previousButton.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            previousMonth();
          }
        });

    nextButton.addActionListener(
        new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            nextMonth();
          }
        });

    JPanel controlPanel = new JPanel();
    controlPanel.add(previousButton);
    controlPanel.add(monthLabel);
    controlPanel.add(nextButton);

    add(controlPanel, BorderLayout.NORTH);
    add(calendarPanel, BorderLayout.CENTER);

    setVisible(true);
  }

  private void updateCalendar() {
    Calendar calendar = new GregorianCalendar();
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH);

    monthLabel.setText(new DateFormatSymbols().getMonths()[month] + " " + year);

    calendarPanel.removeAll();

    String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    for (String day : daysOfWeek) {
      calendarPanel.add(new JLabel(day, JLabel.CENTER));
    }

    calendar.set(Calendar.DAY_OF_MONTH, 1);
    int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

    for (int i = 0; i < firstDayOfWeek; i++) {
      calendarPanel.add(new JLabel(""));
    }

    for (int i = 1; i <= daysInMonth; i++) {
      JButton dayButton = new JButton(Integer.toString(i));
      dayButton.addActionListener(
          new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              JOptionPane.showMessageDialog(null, "You clicked on day ");
            }
          });
      calendarPanel.add(dayButton);
    }

    revalidate();
    repaint();
  }

  private void previousMonth() {
    Calendar calendar = new GregorianCalendar();
    calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1);
    updateCalendar();
  }

  private void nextMonth() {
    Calendar calendar = new GregorianCalendar();
    calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
    updateCalendar();
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
        new Runnable() {
          public void run() {
            new CalendarApp();
          }
        });
  }
}
