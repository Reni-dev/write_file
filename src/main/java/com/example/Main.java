/*
 * Készítő: Hanák Renáta
 * Osztály: Szoft 2/N
 * Dátum: 2025-10-24
 * Fájl neve: Main.java
 */

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dolgozat: feladat-04\n");
        System.out.println("A program szöveget ír ki fájlba\n\n");
    
        Write write = new Write();
        write.writeContent("Pálinkás jó reggelt!");
    }
}