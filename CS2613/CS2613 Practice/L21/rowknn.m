function ratio=rowknn(k,training, testing)
  classes=rowfun(@(row)(findclass(row,k,training)),testing);
  correct=length(find(classes(1)));
  ratio = correct/rows(testing);
endfunction