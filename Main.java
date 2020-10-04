import java.util.Scanner;
/**
 *
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //make the scanner for input
    Scanner input = new Scanner(System.in);
    // ask for grade
    System.out.println("Please enter a letter grade");
    String grade = input.nextLine();
    // determine the mark
    switch(grade){
      case "A":
      System.out.println("This is between 80% and 100%");
      break;
      case "B":
      System.out.println("This is between 70% and 79%");
      break;
      case "C":
      System.out.println("This is between 60% and 69%");
      break;
      case "D":
      System.out.println("This is between 50% and 59%");
      break;
      case "F":
      System.out.println("This is between 0% and 49%");
      break;
    }
    
  }
}
