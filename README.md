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

_мое решение (на языке Java) в папочке Task8_

### Task9
Прямо в классе Main напишите цикл, который найдет все числовые коды русского алфавита (желательно учитывать оба регистра )

_мое решение (на языке Java) в папочке Task9_

### Task10
На вход подается строка из 2х чисел(a,b) , напишите программу обнуляющее b последних битов числа а

_мое решение (на языке Java) в папочке Task10_

### Task11

Напишите класс Vector2D (вектор на плоскости).
В классе необходимо предусмотреть:
Два публичных дробных поля (double) vX и vY - значения проекций вектора на оси.
- Конструктор без параметров, который инициализирует вектор значениями (1,1).
- Конструктор с двумя параметрами (проекция на ось X, проекция на ось Y).
 - Конструктор с параметром Vector2D (такие конструкторы в литературе принято называть конструкторами копирования).
 - Метод print(), который выводит вектор на экран в виде: (vX, vY), при этом значения проекций округлить до двух знаков после запятой. Разделитель в дробных числах - точка. Например, при печати вектора с проекциями vX = 1.2374 и vY = 2.2334, на экране должно появиться (1.24, 2.23).
Для организации форматного вывода можно воспользоваться методом format() класса String. После выполнения следующей строки: System.out.println(String.format(Locale.US, "%.2f", 1.2345)); на экране появится число 1.23.
 - Метод вычисления длины вектора length().
 - Метод add(Vector2D v), прибавляющий вектор, указанный в аргументе, к текущему.
 - Метод sub(Vector2D v), вычитающий вектор, указанный в аргументе, из текущего.
Метод scale(double scaleFactor), умножающий текущий вектор на scaleFactor.

##### дополнительно можно предусмотреть:
 - Метод normalized(), нормализующий текущий вектор. Нормализация вектора — это преобразование заданного вектора в вектор в том же направлении, но с единичной длиной.
 - Метод dotProduct(Vector2D v), возвращающий скалярное произведение вектора, указанного в аргументе, и текущего вектора. Скалярным произведением двух векторов a и b будет скалярная величина, равная сумме попарного произведения координат векторов a и b.
Статическое поле count для подсчета количества созданных векторов.

примеры для проверки

| На вход (main)      | ожидаемый вывод в консоль|
| ------------- |:-------------:|
| Vector2D v = new Vector2D(1.2374, 2.2334); <br /> Vector2D v2 = new Vector2D(); <br />Vector2D v3 = new Vector2D(v);<br />v.print();<br />v2.print();<br />v3.prin();  <br />  |(1.24, 2.23) <br /> (1.00, 1.00) <br /> (1.24, 2.23)
|
|Vector2D vA = new Vector2D(); <br />Vector2D vB = new Vector2D(1.0, 3.0);<br />Vector2D vc = new Vector2D(vB);<br />vA.add(vB);<br />VA.print();<br />vA.sub(vC);<br />VA.print();<br />system.out.print1n(vB.length());<br />vC.scale(2);<br />vC.print();<br />      | (2.00, 4.00)<br />(1.00, 1.00)<br />3.1622776601683795<br />(2.00, 6.00)<br />   || Vector2D vA = new Vector2D(); <br />Vector2D vB = new Vector2D(5.0, 7.0); <br />Vector2D vc = new Vector2D(vB) ;<br />vA.add(vB); <br />VA.print();<br />vA.sub(vC);<br />VA.print();<br />system.out.println(vB.length());<br />vC.scale(1.5);<br />vC.print();<br />vC.normalized() ;<br />System.out.println(vC.Length());<br />vC.scale(2);<br />system.out.println(vA.dotProduct(vB))<br />system.out.println(vA.count) ;<br /> | (6.00 8.00)  <br /> (1.00 1.00) <br />8.602325267<br />(7.50 10.50)<br />1.0<br />12.0<br />3<br />    |


_мое решение (на языке Java) в папочке Task11_
