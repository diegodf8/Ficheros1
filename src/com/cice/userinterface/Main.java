package com.cice.userinterface;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("Texto.txt");
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

    }
}
