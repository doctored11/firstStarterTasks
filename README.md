# Список моих задачек

---

### Task1

Напишите функцию **filter()**, которая создаёт и выводит массив email-адресов, не попавших в чёрный список. В качестве аргументов функция должна принимать: массив строк с исходными email адресами, массив строк с email адресами в чёрном списке.

> не обязательно писать mail по стандарту, можно использовать любые слова

_мое решение в папочке Task2_

### Task2

Напишите функцию **filter**, фильтрующую массив объектов по значению свойства.

```js
let objects = [
  { name: "Василий", surname: "Васильев" },
  { name: "Иван", surname: "Иванов" },
  { name: "Пётр", surname: "Петров" },
];
```

Массив, название свойства и нужное значение должны передаваться в качестве аргументов. Пример использования:

```js
let result = filter(objects, "name", "Иван");
```

Результат выполнения должен быть:

```js
[{ name: "Иван", surname: "Иванов" }];
```

> Мини подсказка:
>
> - было бы правильно вспомнить о методах Object,
>   Особенно о Object.key и Object.entries

_мое решение в папочке Task2_

### Task3

Создайте страницу, которая спрашивает имя у пользователя и выводит его в модальном окне.

> Мини подсказка:
>
> - было бы правильно вспомнить о взаимодействие в js, alert, prompt, confirm

_мое решение в папочке Task3_

### Task4

Напишите функцию **degreeUp**, которая возвращает x в степени n. Иначе говоря, умножает x на себя n раз и возвращает результат. Желательно забирать у пользователя значения используя взаимодействие ввода (prompt).

```
// _пример 1_
n = 5;
x = 2;
result = 32;

// _пример 2_
n = 2;
x = 0.1;
result = 0.01;
```

_мое решение в папочке Task4_

### Task5

Создайте HTML-страницу с полем для ввода числа, кнопкой и div-элементом с числом 0. В поле для ввода должно вводиться число с количеством секунд, после изменения поля должен запускаться таймер. При запуске таймера число в div-элементе должно замениться на введённое в поле. Затем каждую секунду оно должно уменьшаться на единицу до тех пор, пока не дойдёт до 0. При этом таймер должен корректно работать, если во время его работы пользователь запускает его заново.

> Мини подсказка:
>
> - лучше ознакомиться с DOM деревом, особенно про **document.querySelector** и **.textContent**
> - так же для таймера рекомендуется быть вкурсе о **setInterval()**

_мое решение в папочке Task5_

### Task6

С помощью js создайте страницу с полем для ввода и пустым h-элементом. Введённый в поле текст должен отображаться внутри h-элемента, но с задержкой в 300 мс (можно больше, но не нужно). При этом каждый введённый пользователем в поле символ **сбрасывает предыдущий** отложенный вызов и запускает новый. Таким образом программа **должна ожидать завершения ввода пользователя** и только после этого изменять текст в h.

> Мини подсказка:
>
> - в html файле внутри тега body ничего не должно быть, допустимо только подключение скрипта
> - Стоит ознакомиться с setTimeout() и clearTimeout()
> - Лучше знать о **document.createElement** , **.append** , **.prepend** и **.addEventListener** , чем не знать)

_мое решение в папочке Task6_

### Task7

Сделайте страницу с переводом любого десятичного числа в число
с системой счисления до 16. Пользователь должен вводить число в десятичной системе счисления и основание системы для нового числа.

_мое решение в папочке Task7_

### Task8
Cоздайте класс Computer  c  методами позволяющими менять его комплектующие (процессор, оперативную память, накопитель, экран и клавиатуру).
У каждой "детали" должны быть собственные характеристики (вес и например размеры или частота или потребляемая мощность...).
Классы этих комплектующих желательно сделать иммутабельными.
Создайте метод который считает вес собраного компьютера, а так же метод с выводом всех характеристик включая вес.
_мое решение (на языке Java) в папочке Task7_
