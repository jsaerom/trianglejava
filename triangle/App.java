import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("What is the first side?");
    Integer userSideOne = Integer.parseInt(myConsole.readLine());
    System.out.println("What is the second side?");
    Integer userSideTwo = Integer.parseInt(myConsole.readLine());
    System.out.println("What is the third side?");
    Integer userSideThree = Integer.parseInt(myConsole.readLine());
    Triangle userTriangle = new Triangle (userSideOne, userSideTwo, userSideThree);

    if (userTriangle.testingTriangle()){
      if (userTriangle.testingEquilateral()){
        System.out.println("It's an equilateral triangle");
      } else if(userTriangle.testingScalene()){
        System.out.println("It's a scalene triangle");
      } else{
        System.out.println("It's an isosceles triangle");
      }
    } else{
      System.out.println("Not a triangle");
    }
  }
}
