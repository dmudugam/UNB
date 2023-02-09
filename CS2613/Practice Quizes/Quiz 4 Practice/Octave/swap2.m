function out=swap(array,a,b)
  a_mask=(array == a);
  b_mask=(a!=b) * (array == b);
  other = (array != a) .* (array != b);
  out = a_mask .* b + b_mask .* a + other .* array;
end

%!test
%!shared M1, M2
%! M1 = [0,0;0,1;
%!       1,0;1,1];
%! M2 = [1,1;1,0;
%!       0,1;0,0];
%! assert(swap(M1,1,0) == M2);
%!assert (swap(M1,0,1) == M2);
%!assert (swap(M1,1,1) == M1);
%!test
%! M3=[1,2;
%!     3,4];
%! assert(swap(M3,1,4) == [4,2;
%!                         3,1])
