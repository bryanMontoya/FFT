
N = 2^10;
n = 0:N-1;
N = 2^nextpow2(N);   %Potencia de 2 m�s cercana por encima del valor N.
w01 = 2*pi*300;
w02 = 2*pi*700;
Ts = 1/4800;
Fs = 1/Ts;
x = (3*cos(w01*n*Ts)).*(5*sin(w02*n*Ts));
g = x(1:N/2)+x(N/2+1:end);
n = 1:N/2;
F2k = DFT(g,n,-1);
W = exp(-1i*2*pi/N);
h = (x(1:N/2)-x(N/2+1:end)).*W.^(n);
F2kp1 = DFT(h,n,-1);
F = [F2k;F2kp1];
F = F(:)/N;
F = F';
figure
frec = Fs*linspace(0,1,N/2+1)/2;
P1 = 2*abs(F(1:N/2+1));
plot(frec, P1);