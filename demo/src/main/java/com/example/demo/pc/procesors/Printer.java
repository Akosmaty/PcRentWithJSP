package com.example.demo.pc.procesors;

import com.example.demo.pc.Cases;
import com.example.demo.pc.Gpu;
import com.example.demo.pc.PC;
import com.example.demo.pc.Procesors;
import com.example.demo.pc.cases.X1;
import com.example.demo.pc.cases.X2;
import com.example.demo.pc.gpu.GTX1660S;
import com.example.demo.pc.gpu.RTX3090;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Printer {

    public  static Procesors ChoosProcesor(int p){

        System.out.println(p);
        Procesors userprocesor = new I7();

        switch (p) {
            case (1):
                userprocesor = new I3();


                break;
            case (2):
                userprocesor = new I5();

                break;
            case (3):
                userprocesor = new I7();

                break;




        }


        return userprocesor;
    }

    public static Cases ChoosCase(int c){
        Cases usercase = new X2();



        switch (c) {
            case (1):
                usercase  =new X1();


                break;
            case (2):
                usercase  = new X2();

                break;


        }


        return usercase;

    }

    public static Gpu ChoosGpu(int g){

        Gpu usergpu = new RTX3090();

        switch (g) {
            case (1):
                usergpu = new GTX1660S();


                break;
            case (2):
                usergpu = new RTX3090();

                break;



        }


        return usergpu;


    }
    public static void print (ArrayList name){

        for (int i = 0; i < name.size(); i++) {

            System.out.print(name.get(i) + "\n");
        }


    }
    public static ArrayList printerF (PC name) throws FileNotFoundException {

        ArrayList<String> printer = new ArrayList<String>();
        printer.add("Twoj nowy PC sklada sie z :");
        printer.add("Procesor (nazwa, taktowanie, generacja, cena):");
        printer.add(name.getModel());
        printer.add(name.getClock());
        printer.add(name.getGeneration());
        printer.add(name.getPrice());
        printer.add("Obudowa (nazwa, rozmiar, cena):");
        printer.add(name.getC_model());
        printer.add(name.getC_Size());
        printer.add(name.getC_Price());
        printer.add("Karta graficzna (nazwa, taktowanie, pamiec, cena):");
        printer.add(name.getG_model());
        printer.add(name.getG_Clock());
        printer.add(name.getG_Memory());
        printer.add(name.getG_Price());
        int overalPrice = Integer.parseInt(name.getPrice()) + Integer.parseInt(name.getG_Price()) + Integer.parseInt(name.getC_Price());
        printer.add("Cena za calosc jest rowna:" + overalPrice);

        return printer;
    }


}
