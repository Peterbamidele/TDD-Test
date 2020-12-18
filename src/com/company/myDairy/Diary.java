package com.company.myDairy;

public class Diary {
    private Entry[] entries;

    public Diary (int numberOfDiaryEntry){
       this. entries = new Entry[numberOfDiaryEntry];
    }

    public  int getNumberOfDiaryEntries(){
        return entries.length;
    }

    public  Entry[] getEntries(){
        return entries;
    }

    public void addNewEntry(Entry newDairyEntry){
        entries[0] = newDairyEntry;
    }

//    public  String getEntryBody(){
//        return entryBody;
//    }



//
    }


