import java.util.Arrays;

public class HelloJava {

  public static void main(String[] args) {

     int i = 45;
    String name = "Oluwatomi";
    boolean status = false;
    short s = 4500; //-32,768 to 32,767 2^15
    Long l = 45678L; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,808
    float p = 89.05f;
    double d = 45.66;
    char c = 'p';
    byte b = 127;  //-128 to 127 2^7

    //Arithmetic Operations
    // int i = 45;
    i = 57;
    int j = 56;
    double k = i + d;
    int k2 = i + j;
    System.out.println(k);
    System.out.println(k2);


    //Conditionals /Loop
    // For loop and do-while Loop
    //Initialization, Declaration, Increment
    // for (int z = 1; z <= 7; z++){
    //   System.out.println(z);
    // }

    // for (int z = 7; z>=1; z--){
    //   System.out.println(z);
    // }
    //   int z = 1;
    // do {
    //   System.out.println(z);
    //   z++;
    // } while (z <=7);

    int z = 7;
    do {
      System.out.println(z);
      z--;
    } while (z >=1);

    //Arrays
    //length of an array is the number of elements in the array
    //index of an array is length of array -1;
    int myArray[] = {2,3,4,5};
    String myArray3[] = {};
    String myArray2[] = {"first", "second", "third", "fouth"};
    for (int w = 0; w <=myArray.length; w++){
      System.out.println("value " + w);
    }
    myArray[2] = 80;
    int myArray4[] = new int[7];
    myArray4[0] = 10;
    myArray4[1] = 11;
    myArray4[2] = 12;
    myArray4[3] = 13;
    myArray4[4] = 14;
    myArray4[5] = 15;
    myArray4[6] = 20;

    String result = Arrays.toString(myArray);
    String result2 = Arrays.toString(myArray4);
    // System.out.println(result);
    // System.out.println(result2);

    //Object Illustration
    Car tomi; //variable initialization with object Car
    Car car3 = new Car();//variable instantiation with object Car
    Car car = new Car();
    car.setModel("Honda");
    car.setNumber(56);
    car.setColor("green");
    car.setOrigin("China");


    System.out.println(car.getModel());
    System.out.println(car.getNumber());
    System.out.println(car.getColor());
    System.out.println(car.getOrigin());











  }


  // public String getName(){

  // }



}
