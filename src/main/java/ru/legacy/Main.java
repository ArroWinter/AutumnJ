package ru.legacy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Student st = new Student(1, "Prikhodko", "Pavel", "Alekseevich", "+79833228339", "IP-712");
        Teacher tc = new Teacher(2, "Ivanov", "Fidor", "Vasilievich", "772677", "Anime");
        System.out.println(st.getGroup() + " " + st.getFirstName() + " " + st.getSecondName() + " " + st.getLastName());
        System.out.println(tc.getDepartment() + " " + tc.getFirstName() + " " + tc.getSecondName() + " " + tc.getLastName());
        try {
            FileWriter fw = new FileWriter("tmp.txt", false);
            fw.write(st.getGroup() + " " + st.getFirstName() + " " + st.getSecondName() + " " + st.getLastName() + "\n");
            fw.write(tc.getDepartment() + " " + tc.getFirstName() + " " + tc.getSecondName() + " " + tc.getLastName() + "\n");
            fw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try {
            FileReader fr = new FileReader("tmp.txt");
            Scanner in = new Scanner(fr);
            System.out.println(fr);
            fr.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
