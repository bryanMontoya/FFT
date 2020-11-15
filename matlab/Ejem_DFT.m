N = 2^10;
n = 0:N-1;
N = 2^nextpow2(N);   %Potencia de 2 m�s cercana por encima del valor N.
w01 = 2*pi*300;
w02 = 2*pi*700;
Ts = 1/4800;
Fs = 1/Ts;
x = (3*cos(w01*n*Ts)).*(5*sin(w02*n*Ts));
F = DFT(x,n,-1)/N;
frec = Fs*linspace(0,1,N/2+1)/2;
P1 = 2*abs(F(1:N/2+1));
plot(frec, P1);