a = [4;4];
beta = 7.5;

%% Generating vectors
range = [-4:0.05:8];

% duplicating rows and columns
[X Y] = meshgrid(range,range);

%% Multiple return values
[rows cols] = size(X);
Z=zeros(rows,cols);

for i = 1:rows
  for j = 1:cols
    Z(i,j) = delta(beta,a,[X(i,j);Y(i,j)]);
  endfor
endfor
surf(X,Y,Z);