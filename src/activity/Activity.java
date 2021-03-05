package activity;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Activity {
    String title, notes;
    Date dateCreated, dueDate;

    Activity(String title, String notes,  Date dueDate) {
        this.title = title;
        this.notes = notes;
        this.dateCreated = new GregorianCalendar().getTime();
        this.dueDate = dueDate;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getNotes() {
        return notes;
    }

    public Date getDateCreated() {
        return new Date(dateCreated.getTime());
    }

    public Date getDueDate() {return new Date(dueDate.getTime()); }


    // setters
    public void changeTitle(String title) {
        this.title = title;
    }

    public void changeNotes(String notes) {
        this.notes = notes;
    }


    // methods

    @Override
    public String toString() {
        return title + "\nDue: " + dueDate +
                "\nNotes: " + notes +
                "\nCreated: " + dateCreated;

    }

}
