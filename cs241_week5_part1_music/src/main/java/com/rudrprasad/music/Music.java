/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rudrprasad.music;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.C_SHARP);
        i.play(Note.B_FLAT);
    }
    public static void main(String[] args){
	Guitar guitar = new Guitar();
        Flute flute = new Flute();
        
        tune(guitar);
        tune(flute);

    
        System.out.println("End of program.");
  }
}
