function out = nearest(v, k, data)
  for i=1:rows(data)
    dist(i)=norm(v(2:end) - data(i,2:end)); %(2:end basically getting only from indexes 2 to end. i is the value from data index
  endfor
  [sorted, indices]=sort(dist); %indices is are the indexes for the dist so before sorting sorted eg [4,7,5]  indices after sorting [1,3,2]
  out = sort(indices(1:k));
endfunction

%!test
%! v = [0,1,1]
%! data = [0,0,0; 0,0,1; 0,1,0; 1,1,1]
%! assert(nearest(v,1,data) == 4)
%! assert(nearest(v,3,data) == [2,3,4])

