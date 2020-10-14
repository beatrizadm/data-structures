function fibonnaci(num) {
  var fibonnaciArray = [];

  var t1 = 0;
  var t2 = 1;

  if (num < 3) {
    if (num === 1) {
      fibonnaciArray.push(t1);
    }
  
    else if (num === 2) {
      fibonnaciArray.push(t1);
      fibonnaciArray.push(t2);
    }
  }

  else if (num >= 3) {
    fibonnaciArray.push(t1);
    fibonnaciArray.push(t2);

    var t3 = 0;

    for (var i = 3; i < num+1; i++) {
      t3 = t1 + t2;

      fibonnaciArray.push(t3);

      t1 = t2;
      t2 = t3;
    }
  }

  return fibonnaciArray;
}
