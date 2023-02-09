function out=rowfun(fun,mat)

cells = num2cell(mat, 2)
out = cellfun(fun, cells)
endfunction

%!test
%!shared data
%! data = [0,0,0; 0,0,1; 0,1,0; 1,1,1];
%! assert(rowfun(@norm,data), [0;1;1;sqrt(3)], eps)

%!assert(rowfun(@(v)(dot(v,v)),data), [0;1;1;3], eps)

%!assert(rowfun(@prod,data), [0;0;0;1], eps)
