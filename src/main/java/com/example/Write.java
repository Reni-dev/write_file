/*
 * Készítő: Hanák Renáta
 * Osztály: Szoft 2/N
 * Dátum: 2025-10-24
 * Fájl neve: Write.java
 */


package com.example;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Write implements Writable {

    @Override
    public void writeContent(String content) {
        try {
            tryWriteContent(content);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void tryWriteContent(String content) throws IOException {
        FileWriter fw = new FileWriter("text.txt", StandardCharsets.UTF_8);
        System.out.println("\n...szöveg fájlba írása folyamatban...\n");
        fw.write(content);
        fw.close();
        System.out.println("Sikeres fájlba írás!");
    }


    // private String readContent() {
    //     Scanner sc = new Scanner(System.in, "UTF-8");
    //     System.out.println("Add meg a szöveget: ");
    //     String text = sc.nextLine();

    //     System.out.println("\n\n...szöveg bekérése folyamatban...\n");
    //     System.out.println("Bekért szöveg: "+ text + " -> Sikeresen bekérve!");
    //     sc.close();

    //     return text;
    // }
}
