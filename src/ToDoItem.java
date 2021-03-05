import javax.swing.*;
import java.awt.*;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Date;

public class ToDoItem {
    private JPanel activityPanel;
    private JTextPane notePane;
    private JLabel titleLabel;
    private JLabel dueDate;
    private JButton doneButton;
    private JButton DeleteButton;
    private JButton editButton;



    public JPanel createNewItem(String title, String notes, String due) {
        activityPanel.setBackground(new Color(255, 0, 0));
        notePane.setText(notes);
        titleLabel.setText(title);
        dueDate.setText(due);
        doneButtonAction(title);
        DeleteButtonAction();
        editButtonAction();

        activityPanel.add(notePane);

        return activityPanel;
    }

    private void doneButtonAction(String title) {
/*        AttributedString as = new AttributedString(title);
        titleLabel.setText(String.valueOf(as));
        activityPanel.setBackground(new Color(0, 0, 255));*/
    }

    private void DeleteButtonAction() {

    }
    private void editButtonAction() {

    }

}
