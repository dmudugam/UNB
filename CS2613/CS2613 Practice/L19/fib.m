function ret = fib(n)
  a = 0;
  b = 1;
  temp = 0;
  for i=0:n
    temp = a;
    a = b;
    b = temp + b;
  endfor
  ret = temp
endfunction

%!assert (fib(0) == 0);
%!assert (fib(1) == 1);
%!assert (fib(2) == 1);
%!assert (fib(3) == 2);
%!assert (fib(4) == 3);
%!assert (fib(5) == 5);