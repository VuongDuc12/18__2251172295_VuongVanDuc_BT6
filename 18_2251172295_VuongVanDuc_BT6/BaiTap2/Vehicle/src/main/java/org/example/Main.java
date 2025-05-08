package org.example;


class Main {
    public static void main(String[] args) {
      Car car = new Car();
      Bicycle bicycle = new Bicycle();
      System.out.println("Tốc độ tối đa của xe oto là: " + car.GetMaxSpeed());
      System.out.println("Tốc độ tối đa của xe đạp là: " + bicycle.GetMaxSpeed());
    }
}