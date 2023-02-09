## usage: passes = checkdiet(TABLE, MINS, DIET)
##
## Check if DIET passes the min daily requirements
##   TABLE(i,j) is the amount of nutrient i in food j
##   MINS(i) = minimum amount of nutrient i required
##   DIET(j) = amount of food j in proposed diet
function yesno = checkdiet(table, mins, diet)
    td = table .* diet
    tdcomp = mins <= cumsum(td, 2)(:, end)
    yesno = prod(tdcomp(1:end))
end
%!test
%! assert(checkdiet(eye(3),ones(3,1),ones(3,1)) == 1)
%!test
%! assert(checkdiet(eye(3),zeros(3,1),[1;0;0]) == 1)
%!test
%! assert(checkdiet(eye(3),[1;0;0],zeros(3,1)) == 0)
%!test
%! assert(checkdiet(eye(3),[1;0;0],0.5*ones(3,1)) == 0)
%!test
%! assert(checkdiet(ones(3,3),[1;0;0],0.5*ones(3,1)) == 1)