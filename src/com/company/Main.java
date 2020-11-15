package com.company;

public class Main {

    public static <Complex> void main(String[] args) {

        Double[] senoide = new Double[0];
        double Ts = 1/1000;
        for (int n = 1; n < Math.pow(2,10); n++){
            senoide[n]=Math.sin(2* Math.PI*n*300*Ts);
        }




        //Número de muestras:'n'.
        /*int[] n = new int[0];
        for (int k = 0; k < 1023; k++){
            n[k] = k;
        }


        Signal Signal = new Signal(senoide);*/



        /*Signal.DFT(n,-1);
        for (int i = 0; i <= senoide.length; i++){
            c[i] = Signal.getX[i];
        }*/


        //System.out.println(senoide.length);

    }
}
