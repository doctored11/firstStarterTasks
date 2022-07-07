

let arrayOfEmails = new Array();
let blackList = new Array();

arrayOfEmails = ['1', '2', '3', '4', '5'];
blackList = ['1', '3'];


console.log("весь список имен:\n" + arrayOfEmails.join("|") );
console.log("черный список:\n" + blackList.join("|") );
filter(arrayOfEmails, blackList);
function filter(allEmails, blackList) {
  for (let i = 0; i < allEmails.length; ++i) {
    for (let n = 0; n < blackList.length; n++) {
      if (allEmails[i] == blackList[n]) {
        allEmails.splice(i, 1);
        --i;
      }
    }
  }
  console.log("после фильтра:\n" + allEmails.join("|") + "\n______");
  
 
}


