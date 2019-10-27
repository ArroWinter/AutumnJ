package ru.legacy;

import java.io.FileWriter;
import java.io.IOException;

public interface Itry {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw = new FileWriter("tmp.txt", false);
            fw.write("Hello sosed");
            fw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}