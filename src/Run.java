import activity.ActivityFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {
    private JPanel mainPanel;
    private JLabel mainPanelLabel;
    private JPanel addNewActivityPanel;
    private JTextField titleTextField;
    private JLabel titleTextLabel;
    private JComboBox<String> dueDay;
    private JComboBox<String> dueMonth;
    private JComboBox<String> dueYear;
    private JLabel dueDateLabel;
    private JButton createActivityButton;
    private JTextField noteTextField;
    private JLabel noteLabel;
    private JPanel showActivitiesPanel;
    private JButton showAddPanelButton;
    private static JFrame jframe;

    SimpleDateFormat sdf = new SimpleDateFormat("E dd MMMM yyy");
    // can now use sdf.format(Date); to output the date!

    // The code that will be run on psvm
    private static void run() {
        Run r = new Run();
        jframe = new JFrame();
        jframe.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        jframe.setContentPane(r.getMainPanel());
        jframe.setSize(500, 200);
        jframe.getContentPane().setBackground(new Color(0, 255, 255));

    }

    // Default Selections
    private JPanel getMainPanel() {
        mainPanel.setVisible(true);
        addNewActivityPanel.setVisible(false);
        showActivitiesPanel.setVisible(true);

        mainPanelLabel.setText(" 2Do List - by Vincent Taylor");
        titleTextLabel.setText(" 2Do: ");
        titleTextField.setText("Enter What you plan to do here! ");

        dueDateLabel.setText(" The activity is due: ");
        createActivityButton.setText(" Create 2Do");
        noteLabel.setText(" Enter notes here: ");
        noteTextField.setText("No Notes Here!");

        dueDay.setSelectedIndex(0);
        dueMonth.setSelectedIndex(0);
        dueYear.setSelectedIndex(0);
        titleTextField.requestFocus();
        titleTextField.selectAll();

        // All Functionality Functions - e.g., Button functions
        viewAddActivityButtonAction();
        createActivityButtonAction();

        return mainPanel;
    }

    private void viewAddActivityButtonAction() {
        showAddPanelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //What the button does
                addNewActivityPanel.setVisible(true);
                showAddPanelButton.setVisible(false);
                jframe.pack();
            }
        });
    }

    private void createActivityButtonAction() {
        createActivityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //What the button does

                // Get title
                String title = titleTextField.getText();

                // Get Due Date
                int day = Integer.parseInt((String) dueDay.getSelectedItem());
                String month = (String) dueMonth.getSelectedItem();
                int year = Integer.parseInt((String) dueYear.getSelectedItem());
                int m = 0;
                switch (month) {
                    case "January":
                        m = 1;
                        break;
                    case "February":
                        m = 2;
                        break;

                    case "March":
                        m = 3;
                        break;

                    case "April":
                        m = 4;
                        break;

                    case "May":
                        m = 5;
                        break;

                    case "June":
                        m = 6;
                        break;

                    case "July":
                        m = 7;
                        break;

                    case "August":
                        m = 8;
                        break;

                    case "September":
                        m = 9;
                        break;
                    case "October":
                        m = 10;
                        break;

                    case "November":
                        m = 11;
                        break;

                    case "December":
                        m = 12;
                        break;
                }
                Date due = new Date(year - 1900, m -1, day);

                // Get Notes
                String note = noteTextField.getText();

                // Create Activity
                ActivityFactory.getInstanceOfActivity(title, note, due);
                /*
                JPanel newActivity = createActivityPanel(title, note , sdf.format(due));*/
            }
        });
    }

    private JPanel createActivityPanel(String title, String note, String due) {
        JPanel jp = new ToDoItem().createNewItem(title, note, due);

        return jp;
    }


    public static void main(String[] args) {
        run();
    }
}
