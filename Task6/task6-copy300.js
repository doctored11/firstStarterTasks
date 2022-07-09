{
  let h2 =document.createElement('h2');
  let input = document.createElement('input');
  // h2.textContent = 'h2'
  let print;
  document.body.append(h2);
  document.body.append(input);
  input.addEventListener("input", printText);

  

  function printText(){
    clearTimeout(print);
   print =  setTimeout(() => {
    
      h2.textContent = `${input.value}`;
      
    }, 300);
  }




}