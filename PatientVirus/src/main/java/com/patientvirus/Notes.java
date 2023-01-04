package com.patientvirus;
import java.io.*;
import java.io.ObjectOutputStream;

public abstract class Notes {
    private String notesName;
    public Notes(String notesName){
        this.notesName = notesName;
    }
    public abstract void addNotes(String note);
    public abstract void showNotes();
    public void saveNotes(){}
}
