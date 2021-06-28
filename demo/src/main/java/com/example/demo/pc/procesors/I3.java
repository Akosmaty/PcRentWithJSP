package com.example.demo.pc.procesors;

import com.example.demo.pc.Procesors;
import com.example.demo.pc.TextReader;
import com.example.demo.pc.TextReaderArr;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class I3 implements Procesors {


    public String getName() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I3.txt");
        return data.get(1);
    }

    public String getClock() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I3.txt");
        return data.get(2);
    }

    public String getGeneration() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I3.txt");
        return data.get(3);
    }

    public String getPrice() throws FileNotFoundException {
        ArrayList<String> data = new TextReaderArr().getTextOut("I3.txt");
        return data.get(4);
    }
}