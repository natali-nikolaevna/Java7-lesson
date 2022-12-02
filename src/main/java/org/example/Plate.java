package org.example;

   public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public  boolean decreaseFood(int amount) {
        int min = food - amount;
        if (min < 0) return false;
        food -= amount;
        return true;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public String toString() {
        return "Plate["+food+"]";
    }

    public int getFood() {
        return this.food;
    }

}