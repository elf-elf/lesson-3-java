package ru.elf;


//extends - homecat наследник супер-класса Cats
public class HomeCats extends Cats { // создали класс

    HomeCats sleepOnBed () { // создали метод (описание поведения объектов этого класса)
        System.out.println("Я " + name + " и мне очень гуд");
        return this; //возвращает этот же объект (самого себя), т.е. справа написано, что он будет возвращать
    }
    //пончик и муся разные объекты - поведение одно


}
