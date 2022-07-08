function degreeUp(x, n) {
    let result = x;
    result= x**n;
  
    return (Math.floor(result * 1000) / 1000);
  }
//   
  
  let x = prompt("x?", '');
  let n = prompt("n?", '');
  
  if (n < 1) {
    alert("мы тут в степень возводим а не корень берем!");
  } else {
    alert( degreeUp(x, n) );
  }