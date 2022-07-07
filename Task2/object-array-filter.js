let objects = [
  { name: 'Василий', surname: 'Васильев' },
  { name: 'Иван', surname: 'Иванов' },
  { name: 'Пётр', surname: 'Петров' },
]

let sortArray = [];

function filter(obj, property, value ) {
  for(let i =0; i < obj.length; ++i ) {
    if((Object.keys(obj[i]).includes(property)) && Object.values(obj[i]).includes(value)) {
      for(let n =0; n < obj.length; ++n) {
        if((Object.entries(obj[i])[n]).includes(property) && (Object.entries(obj[i])[n]).includes(value)  ){
          sortArray.push( (obj[i]));
          return(sortArray);
        }
      }
    }
  }
}
console.log(" массив объектов на вход:\n " + objects );
console.log("фильтр: \n" + "object\n" + "surname\n "+"Иванов\n");
console.log("Вывод:");

// применяемые 3 фильтра
filter(objects, 'surname', 'Иванов');
console.log(sortArray);





