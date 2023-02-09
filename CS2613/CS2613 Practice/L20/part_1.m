a = [4;4];
beta = 7.5;
range = [-4:0.1:8];
[X Y] = meshgrid(range,range);

tic();
f=@(X, Y) delta(beta,a,[X;Y]);
Z=arrayfun(f,X,Y);
toc();
surf(X,Y,Z);