function ret = arraydelta(beta,a,X,Y)
    ret beta * (a(1) * X + a(2) * Y) - (beta - 1) * (X .*X + Y .*Y);
    endfunction