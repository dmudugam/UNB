function ret = swap(m, a, b)
    m1 = (m == a)
    m2 = (m == b)
    m(m1) = b
    m(m2) = a
    ret = m
endfunction



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