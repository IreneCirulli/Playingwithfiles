package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	FileWriter fw  = new FileWriter("Temp.txt", true);

        fw.write(" ");

        fw.close();

        FileReader fr = new FileReader("Temp.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        System.out.println(line);

        while((line =br.readLine())!= null)
            System.out.println(line);

        br.close();
        fr.close();
    }
}
