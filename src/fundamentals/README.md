#### 1. [Function 1 - hello world](FunctionOne.java)

**Описание:**

* Создайте простую функцию/класс с именем приветствие, которая возвращает самое известное `"hello world!"`.

* Конечно, это настолько просто, насколько это возможно. Но насколько умным вы можете быть, чтобы создать самый
  креативный приветственный мир, какой вы только можете себе представить? Какое решение `"hello world!"` вы хотели бы
  показать своим друзьям?

---

#### 2. [Counting sheep...](Counter.java)

**Описание:**

* Рассмотрим массив/список овец, где некоторые овцы могут отсутствовать на своем месте. Нам нужна функция, которая
  подсчитывает количество овец, присутствующих в массиве (`true` означает наличие).

Например,

```java
Boolean[]array1={true,true,true,false,
        true,true,true,true,
        true,false,true,false,
        true,false,false,true,
        true,true,true,true,
        false,false,true,true
        }; // Правильный ответ будет 17.
```

**Подсказка:**

* Не забудьте проверить наличие неправильных значений, таких как `null`/`undefined`

---

#### 3. [Opposites Attract](OppositesAttract.java)

**Описание:**

* Тимми и Сара думают, что они влюблены, но там, где они живут, они узнают об этом, только когда каждый сорвет
  по цветку. Если у одного из цветов четное количество лепестков, а у другого нечетное количество лепестков, это
  означает, что они влюблены.

* Напишите функцию, которая будет принимать количество лепестков каждого цветка и возвращать `true`,
  если они влюблены, и `false`, если нет.

---

#### 4. [String repeat](StringRepeat.java)

**Описание:**

* Напишите функцию, которая принимает целое число `n` и строку `s` в качестве параметров и возвращает строку `s`,
  повторяющуюся ровно `n` раз.

Примеры (ввод -> вывод)

```
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"
```

---

#### 5. [Transportation on vacation](TransportationOnVacation.java)

**Описание:**

* Каждый день вы арендуете автомобиль, стоит $ 40. Если вы арендуете автомобиль на 7 и более дней, вы получаете
  скидку $ 50 на общую сумму. Кроме того, если вы арендуете автомобиль на 3 или более дней, вы получаете скидку $ 20 на
  общую сумму.
* [Original Kata](https://www.codewars.com/kata/568d0dd208ee69389d000016/)

---

#### 6. [Sentence Smash](SentenceSmash.java)

**Описание:**

* Напишите функцию, которая берет массив слов и разбивает их вместе в предложение и возвращает предложение.
* [Original Kata](https://www.codewars.com/kata/53dc23c68a0c93699800041d)

---

#### 7.[Convert a Boolean to a String](BooleanToString.java)

**Описание:**

* Реализуйте функцию, которая преобразует заданное логическое значение в его строковое представление.
* [Original Kata](https://www.codewars.com/kata/551b4501ac0447318f0009cd)

---

#### 8. [Count of positives / sum of negatives](CountAndSumOfNums.java)

**Описание:**

* Дано множество целых чисел.
* Верните массив, где первым элементом является количество положительных чисел,
  а вторым элементом является сумма отрицательных чисел. 0 не является ни положительным, ни отрицательным.
* Если вход является пустым массивом или нулевым, верните пустой массив.

* [Original Kata](https://www.codewars.com/kata/576bb71bbbcf0951d5000044)

---

#### 9. [DNA to RNA Conversion](DNAToRNA.java)

**Описание:**

* Создайте функцию, которая переводит данную строку ДНК в РНК.


* [Original Kata](https://www.codewars.com/kata/5556282156230d0e5e000089/)

---

#### 10. [Sum of positive](SumOfPositive.java)

**Описание:**

* Вы получаете массив чисел, возвращаете сумму всех положительных.

* [Original Kata](https://www.codewars.com/kata/5715eaedb436cf5606000381)

---

#### 11. [Covfefe](Covfefe.java)

**Описание:**

* You are given a string. You must replace any occurence of the sequence `coverage` by `covfefe`,
  however, if you don't find the word `coverage` in the string, you must add `covfefe` at the end
  of the string with a leading space.

* [Original Kata](https://www.codewars.com/kata/592fd8f752ee71ac7e00008a)

#### 12. [Consonants](Consonants.java)

**Описание:**

* Complete the function that takes a string of English-language text and returns the number of consonants in the string.
  Consonants are all letters used to write English excluding the vowels `a, e, i, o, u`.

* [Original Kata](https://www.codewars.com/kata/564e7fc20f0b53eb02000106/)

#### 13. [String ends with?](EndsWith.java)

**Описание:**

* Complete the solution so that it returns true if the first argument(string)
  passed in ends with the 2nd argument (also a string).

* [Original Kata](https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d)

#### 14. [Vowel remover](VowelRemover.java)

**Описание:**

* Create a function called shortcut to remove the lowercase vowels `(a, e, i, o, u )` in a given string.

* [Original Kata](https://www.codewars.com/kata/5547929140907378f9000039/)


#### 15. [Who likes it?](WhoLikesIt.java)

**Описание:**

* Реализуйте функцию, которая принимает массив, содержащий имена людей, которые любят элемент. 
  Он должен вернуть текст дисплея, как показано в примерах:

**Пример**

```
[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
```

* [Original Kata](https://www.codewars.com/kata/5266876b8f4bf2da9b000362)


20. [taskname](filename)

**Описание:**

*

* [Original Kata](link)
