package org.example;

    public class Cat {
        private String name;
        private int appetite;
        private boolean isHungry;


        public Cat(String name, int appetite)
        {
            this.name = name;
            this.appetite = appetite;
            this.isHungry = true;
        }

        public void eat(Plate plate) {
            System.out.println(this.name + " приготовился кушать");
            if(plate.decreaseFood(appetite)) {
                System.out.println(this.name +  " сьел "+ appetite +" единиц еды");
                this.isHungry = false;
            }else {
                System.out.println("Для кота " + this.name + " в тарелке недостаточно еды. Добавьте " + Math.abs(plate.getFood() - this.appetite) + " еды...");
            }
        }


    }


