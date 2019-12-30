package labone;

import java.util.Date;

/**
 * This class displays four lines of output. The first line displays the name of the programmer and
 * the date. Each one of the next three lines displays a single statement created by the programmer.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Gregory M. Kapfhammer
 */
public class DisplayOutput {

  /**
   * The main entry point for DisplayOutput. The source code inside of this method will be executed
   * when the program is run in the command-line. The output of this program will appear in the
   * terminal window. The println statements make the program display output.
   *
   * @param args The command-line arguments
   */
  public static void main(String[] args) {

    // display the date using the Date constructor
    System.out.println("Gregory M. Kapfhammer " + new Date());
    // display three insightful lines
    System.out.println("Hello World.");
    System.out.println("Gradle is Great.");
    System.out.println("Docker is Dynamite.");
  }
}
