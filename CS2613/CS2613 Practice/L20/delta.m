## compute βa·b - (β-1)b·b
## a, b are assumed to be column vectors
function ret = delta(beta, a, b)
  ret = beta * dot(a,b) - (beta-1) * dot(b,b);
endfunction

%% delta(0,a,b) = |b|²
%!test
%! b = rand(2,1);
%! a = rand(2,1);
%! assert ( delta(0,a,b), norm(b)^2, eps )

%% delta(1,a,b) = a.b
%!test
%! b = rand(2,1);
%! a = rand(2,1);
%! assert ( delta(1,a,b), a'*b, eps )

%% delta(2,a,b) = 2a.b - |b|^2
%!test
%! b = rand(2,1);
%! a = rand(2,1);
%! assert ( delta(2,a,b), 2*a'*b - norm(b)^2, eps )