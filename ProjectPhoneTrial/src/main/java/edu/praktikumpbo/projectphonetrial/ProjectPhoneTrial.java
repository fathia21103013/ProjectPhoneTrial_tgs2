/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.projectphonetrial;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class ProjectPhoneTrial {

    public static void main(String[] args) { {
    
    Phone redmi = new Xiaomi();
    
    PhoneUser dian = new PhoneUser(redmi);
    
    dian.turnOnThePhone();
    
    Scanner input = new Scanner(System.in);
    String aksi;
    System.out.println("=== APLIKASI INTERFACE ===");
    System.out.println("Pilih Jenis Hp Anda ");
    System.out.println("[A] Xiaomi");
    System.out.println("[B] Samsung");
    System.out.println("[C] Iphone");
    System.out.println("[D] Oppo");
    System.out.println("[X] Keluar");
    System.out.println("--------------------------");
    System.out.print("Pilih aksi> ");
    aksi = input.nextLine();
    
    while (true) {
    System.out.println("[1] Nyalakan HP");
    System.out.println("[2] Matikan HP");
    System.out.println("[3] Perbesar Volume");
    System.out.println("[4] Kecilkan Volume");
    System.out.println("[0] Keluar");
    System.out.println("--------------------------");
    aksi = input.nextLine();
    
    if(aksi.equalsIgnoreCase("1")){
        dian.turnOnThePhone();
    } else if (aksi.equalsIgnoreCase("2")){
        dian.turnOffThePhone();
    } else if (aksi.equalsIgnoreCase("3")){
        dian.makePhoneLouder();
    } else if (aksi.equalsIgnoreCase("4")){
        dian.makePhoneSilent();
    } else if (aksi.equalsIgnoreCase("0")){
        System.exit(0);
    } else {
         System.out.println("Kamu memilih aksi yang salah!");
         }
        }
    }
}

    void choosePhone(String aksi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
