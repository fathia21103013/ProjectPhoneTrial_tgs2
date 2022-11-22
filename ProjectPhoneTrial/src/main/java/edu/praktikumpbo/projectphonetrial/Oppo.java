/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.projectphonetrial;

/**
 *
 * @author ASUS
 * Nama : Fathia Ismi Rahma
 * NIM  : 21103013
 */
public class Oppo implements Phone{
    private int volume;
    private boolean isPowerOn;
    
    public Oppo() {
        this.volume = 50;
    }
    
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Welcome to Oppo");
        System.out.println("Android version 3.0");
    }
    
    @Override
        public void powerOff() {
        isPowerOn = false;
        System.out.println("Good Bye");
    }
        
    @Override
        public void volumeUp() {
        if (isPowerOn) {
            int MAX_VOLUME = 0;
        if (this.volume == MAX_VOLUME) {
        System.out.println("Volume FULL");
        System.out.println("sudah " + this.getVolume() + "%");
    } else {
        this.volume += 10;
        System.out.println("Volume Now: " + this.getVolume());}
    } else {
        System.out.println("Oppo Off");
        }
    }
       
        public void volumeDown() {
        if (isPowerOn) {
            int MIN_VOLUME = 0;
         if (this.volume == MIN_VOLUME) {
        System.out.println("Volume = 0%");
    } else {
        this.volume -= 10;
        System.out.println("Volume Now: " + this.getVolume());
        }
    } else {
         System.out.println("Oppo Off");
        }
    }
    public int getVolume() {
    return this.volume;
    }

    @Override
    public void voulmeUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void voulmeDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void PowerOn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void PowerOff() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void VolumeUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void VolumeDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}