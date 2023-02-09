function out = digits2num(array)
    A = [size(array, 2)-1:-1 : 0]
    A = 10 .^ A
    B = array .* A
    C = cumsum(B, 2)
    D = C(:, end)
    out = D
endfunction

%!test "0"
%! assert(digits2num([0]) == 0);
%! assert(digits2num([0,0]) == 0);

%!test "1"
%! assert(digits2num([1]) == 1);
%! assert(digits2num([0,1]) == 1);

%!test "place value"
%! assert(digits2num([2]) == 2)
%! assert(digits2num([2,0]) == 20)
%! assert(digits2num([2,3,0]) == 230)