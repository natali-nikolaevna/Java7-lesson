package org.example;
    public class Main {
        public static void main(String[] args) {

            Cat cat = new Cat( "Василиса",5);
            Cat lada = new Cat("Lada",10);
            Cat begemot = new Cat("Бегемот", 13);

            Cat[] cats = {cat, lada, begemot};

            Plate plate = new Plate(25);

            for(Cat c : cats) {
                c.eat(plate);
            }
        }
    }


