

public class Car {
  String model;
  int number;
  String color;
  String origin;

  //Constructor
  public Car( String model,int number, String color, String origin){
    this.model = model;
    this.number = number;
    this.color = color;
    this.origin = origin;
  }

  //No Argument Constructor
  public Car() {
  }

  public String getModel () {
    return model;
  }

  public int getNumber() {
    return number;
  }

  public String getColor () {
    return color;
  }

  public String getOrigin() {
    return origin;
  }

  public void setModel(String model) {
    this.model = model;
}

public void setNumber(int number) {
  this.number = number;
}

public void setColor(String color) {
  this.color = color;
}

public void setOrigin(String origin) {
  this.origin = origin;
}





}
