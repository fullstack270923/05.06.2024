package com.company;

// Lombok

public class Car {
  // function create_car(_type, _model, _color, speed=0)
  //  {
  //     return { type: _type, model: _model,
  //                color: _color, speed: _speed } }
  //
  // const car =  { type: "honda", model: "civic",
  //                color: "red", speed: 100 }
  //
    // data -- attributes -- properties
    String type;
    String model;
    String color;
    int speed;
    int doors;

    //  { type: 'honda', color: 'black', speed: 150,    max_speed: 180 }
    //  { type: 'mitsubishi', color: 'red', speed: 120, max_speed: 180 }
    static int max_speed = 180;

    // functions
  // CTOR constructor

  // default
  //public Car() {
  //}

//  public Car() {
//    System.out.println("new car created...");
//  }

  // ctor overloading
  public Car(String type, String model, String color, int speed, int doors) {
    this.type = type;
    this.model = model;
    this.color = color;
    this.speed = speed;
    this.doors = doors;
  }

  public Car(String type, String model, String color, int doors) {
    this(type, model, color, 0, doors); // calls ctor
    boolean is200legal = isSpeedLegal(200);
    //this.type = type;
    //this.model = model;
    //this.color = color;
    //this.doors = doors;
    //this.speed = 0;
  }

  public boolean isFamilyCar() {
    if (this.doors >= 4)
      return true;
    return false;
    //return this.doors >= 4;
  }

  public static boolean isSpeedLegal(int _speed) {
    // boolean leagl = isthisCarsSpeedLegal(); // ERROR
    Car renault = new Car("Renault", "diamond", "blue",
                           4, 200);
    return _speed <= max_speed;
  }

  public boolean isthisCarsSpeedLegal() {
    boolean is200legal = isSpeedLegal(200);
    return this.speed <= max_speed;
  }

  @Override
  public String toString() {
    return "Car{" +
            "type='" + this.type + '\'' +
            ", model='" + this.model + '\'' +
            ", color='" + this.color + '\'' +
            ", speed=" + this.speed +
            ", doors=" + this.doors +
            '}';
  }
}
