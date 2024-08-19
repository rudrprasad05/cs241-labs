/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudrprasad.music;

/**
 *
 * @author s11219309
 */
public class Guitar extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Guitar is playing " + n);
    }
}
