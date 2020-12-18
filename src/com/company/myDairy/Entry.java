package com.company.myDairy;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {
    private String entryTitle;
    private LocalDateTime entryDateAndTime;
    private String entryBody;

    public Entry(String entryTitle) {
        this.entryTitle = entryTitle;
        entryDateAndTime = LocalDateTime.now();
        this.entryBody = entryBody;
    }
//
//    public void setEntryTitle(String newEntryTitle) {
//        this.entryTittle
//    }

    public void setEntryTitle(String newEntryTitle) {
        entryTitle = newEntryTitle;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return entryDateAndTime.now();
    }

    public void setEntryBody(String entryBody) {
        this.entryBody = entryBody;
    }

    public String getEntryBody() {
        return entryBody;
    }

//    public String ViewEntry() {
//        String preview = ("Title: " + getEntryTitle() + "\n"
//                + "Entry Date: " + getEntryDateAndTime().toLocalDate() + "\n"
//                + "Entry Body: " + getEntryBody());
//        return preview;
//    }

    public String viewEntry() {
        String preview = ("Title: " + getEntryTitle() + "\n"
                + "Entry Date: " + getEntryDateAndTime().toLocalDate() + "\n"
                + "Entry Body: " + getEntryBody());
        return preview;
    }

    @Override
    public String toString() {
        return viewEntry();

    }


}
