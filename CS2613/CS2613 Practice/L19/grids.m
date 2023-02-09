r = [-1:0.5:1]

[X,Y] = meshgrid(r,r)

Z = X.^2 - Y.^2

  surf(X,Y,Z)