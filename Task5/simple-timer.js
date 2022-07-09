 {
  let input = document.querySelector(".input-pole");
  let counter = document.querySelector(".counter");
  let time = 0;
  let timer;
  input.addEventListener("input",calcTime);


  function getTime(){

    let seconds = input.value;
    console.log(seconds)
  
    return(seconds);
 }

function calcTime(){

  time = 0;
  time = getTime();
  clearInterval(timer);
  
  timer = setInterval(()=>{
    
    console.log(time);
    counter.textContent = `${time}`;
    if (time <= 0){
       clearInterval(timer);
    }

    time-=1;

 } ,1000)

}
    

 }



  





















  
//   
  
 