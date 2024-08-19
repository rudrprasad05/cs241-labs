/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudrprasad.music;

/**
 *
 * @author s11219309
 */
public class Note {
    public static final Note
    MIDDLE_C = new Note("Middle C"),
    C_SHARP  = new Note("C Sharp"),
    B_FLAT   = new Note("B Flat");
    // Etc.
    
    private String noteName;
    
    private Note(String noteName) {
        this.noteName = noteName;
    }
  
    public String toString() { 
        return noteName; 
    } 
}
