function F=DFT(x,n,flag)  %x:funcion o señal   flag: -1(DFT)  1(DFT inversa)
    N=length(x);
    w0=2*pi/N;
    for k=0:N-1
        F(k+1)=sum(x.*exp(flag*1i*w0*k*n));
    end
end