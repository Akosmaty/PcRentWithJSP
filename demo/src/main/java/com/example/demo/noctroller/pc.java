package com.example.demo.noctroller;

import java.util.ArrayList;

public class pc {
  public int pro;
  public int cas;
  public int gpu;
  public String arra;


    public String getArra() {
        return arra;
    }

    public void setArra(ArrayList arra) {
      String adding = "";
       for (int i = 0; i< arra.size();i++){

           adding = adding+" " + arra.get(i);
       }

        this.arra =adding;
    }

    public int getPro() {
        return pro;
    }

    public void setPro(int pro) {
        this.pro = pro;
    }

    public int getCas() {
        return cas;
    }

    public void setCas(int cas) {
        this.cas = cas;
    }

    public int getGpu() {
        return gpu;
    }

    public void setGpu(int gpu) {
        this.gpu = gpu;
    }
}
