
{
  let x = prompt("число для перевода в десятичной?", '');
  let n = prompt("новое основание?", '');

  if (n < 2){ 
    alert("🤬");
    alert("Это пример для умных, переведи сам число " + x + " из десятичной, в систему с основанием " + n + " 🤡 " );
  } else
  if (n >16) {
    alert("мы тут переводим только до 16ричной( мне лень писать алфавит весь ) ");
  } else {
    alert( calcNumber(x, n) );
  }


  function calcNumber(x, n) {
    let newNum = [];
    let number;
    let result;

    number = x;

    while (number != 0) {

    result = number % n
    number = calcWhole(number,n);
    if ( result > 9) {
      result = translateToADC(result);
    }
    
    newNum.unshift(result);

    }

    return (newNum.join(""));

    
  }
//   

  function calcWhole(val, by){
    return (val - val % by) / by;
}

 function translateToADC(num){

  switch (num) {
    case 10: num = 'A' ;
    break;
    case 11: num = 'B' ;
    break;
    case 12: num = 'C' ;
    break;
    case 13: num = 'D' ;
    break;
    case 14: num = 'E' ;
    break;
    case 15: num = 'F' ;
    break;
    case 16: num = 'G😡' ;
    break;
  }
   return(num);

 }
}