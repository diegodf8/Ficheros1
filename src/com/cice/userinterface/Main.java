package com.cice.userinterface;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("C:\\Users\\Diego_Yako\\Desktop\\Text.txt");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String cadena = bufferReader.readLine();
            System.out.println(cadena);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex2){
            ex2.printStackTrace();
        }

    }
}
