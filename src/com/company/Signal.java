package com.company;

public class Signal {
    private Double[] Senal;
    //private Complex[] x;

    //public Complex[] getX() {
    //    return x;
    //}

    public Signal(Double[] senal){
        this.Senal = senal;
    }

    public Complex[] DFT(int[] n, int flag){
        int N = this.Senal.length;
        double w0 = 2*Math.PI/N;
        Complex[] x = new Complex[N];
        for (int k = 0; k < N-1; k++) {
            x[k] = sum(this.Senal,flag,w0,k);
        }
        return x;
    }

    public Complex sum(Double[] Senal,int flag,double w0,int k){
        Complex complejo = new Complex(0,0);
        for (int i = 0;i < Senal.length - 1; i++) {
            double s = (flag*w0*k*i);
            complejo.exp(s);
            complejo = complejo.suma(complejo.times(Senal[i]));
        }
        return complejo;
    }
}
