import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // Create an array of 15 int elements (representative of the seat #s which we DO
    // know
    int[] classSeats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    // Create a String array of 15 elements (representative of the student names
    // which we do NOT know)
    String[] studentNames = new String[15];

    // Use a For loop to loop through the String array
    for (int i = 0; i < studentNames.length; i++) {
      // Within the For loop, you will want to ask for the student's name (print
      // statement), receive the name(Scanner) and assign it to each element of the
      // String array
      System.out.println("Whats your name?");
      studentNames[i] = scan.next();
    }
    // used a While loop to print each element in the String array along with each
    // element in the int arraym
     int i = 0;
    while (i <= 14) {
      System.out.println(studentNames[i] + " sits in seat number " + classSeats[i]);
      i++;
    }
  }
}