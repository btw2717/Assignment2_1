import java.io.File;    //import the File class
import java.io.FileNotFoundException;   //import the FileNotFound class
import java.util.Scanner;   //import the Scanner class

/**
 * The class AverageTenNumbers prompts a user to enter in their name and ten numbers,
 * stores those entries into declared variables through the use of Scanner objects equipped
 * with delimiters,
 * sums them and produces an average value,
 * and then outputs by printing the values of those variables along with all string instructions.
 *
 * This class makes use of the Scanner class by reading keyboard input,
 * and by reading input from a text file.
 *
 * This class utilizes the void method main() to carry out its sequence of statements.
 *
 *This class extends
 * Created: 13SEP2017
 * email: dontwanttopostitongithub@email.com
 * @author Sapper
 * @version 1.0
 */

public class AverageTenNumbers
{
    /**
     * The public static void main() method is a void method which will perform some action
     * other than returning an item.
     * This method is the entry point of the application.
     *
     * main() uses File(), which throws an unchecked exception NullPointerException.
     * This exception extends RunTimeException and so is unchecked.
     * According to the javaDoc for NullPointerException:
     * Thrown when an application attempts to use null in a case where an object is required.
     * These include:
     * Calling the instance method of a null object.
     * Accessing or modifying the field of a null object.
     * Taking the length of null as if it were an array.
     * Accessing or modifying the slots of null as if it were an array.
     * Throwing null as if it were a Throwable value.
     *
     * main() uses close() (from the interface 'Closeable' which is implemented
     * by the Scanner class), which throws a checked exception FileNotFoundException.
     * Because of this, main() specifies the FileNotFoundException using throws.*
     *
     * The main() method creates variables of both primitive and non-primitive data types to store
     * expressions in memory.
     * This method uses printed strings to prompt the user to enter the required information.
     * That information is read using various scanner objects and subsequently stored in the
     * appropriate variable space according to data type.
     * main() also uses a scanner object to read text from the file "inputFile" located in the
     * src folder alongside the code.
     * When the user is prompted to enter their first and last name, the scanner object which reads
     * them utilizes the default delimiter of whitespace.
     * When the user is prompted to enter ten numbers, the scanner object which reads them uses
     * a delimiter to sort the numbers into tokens which can be stored and processed separately.
     *
     * main() sums and averages the number data in order to output an average of hours spent,
     * along with printed strings to interact with the user.
     *
     * @param args the command line arguments passed to the application.
     * @throws FileNotFoundException if the file which the scanner object needs to read cannot
     * be found.
     */
    public static void main(String[] args) throws FileNotFoundException  //
    {
        /*
        Declaring three Scanner variables?.  One for string input, one for number input,
        and one for file input.
         */
        Scanner keyboardWords;
        Scanner keyboardNumbers;
        Scanner readFile;

        //Declaring a File variable?
        File inputFile;

        //Declaring two variables of string data type (non-primitive).
        String nameFirst;
        String nameLast;

        //Declaring two primitive data type variables, one of integer type and one of type double.
        int sum;
        double average;

        //Declaring 10 integer variables to store the user input.
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;    //Same could be accomplished on single line by int n1, n2, n3, ... , n10
        int n6;    //but the Oracle website says that the individual declarations are better.
        int n7;
        int n8;
        int n9;
        int n10;


        //Scanner object for reading string input, delimited by spaces(default).
        keyboardWords = new Scanner(System.in);
        /*
        Different kinds of delimiters for the scanner object which can be implemented by removing
        the single-line comment designators "//".  They are here because I was playing around with
        them to observe the effects.
         */
        //keyboardWords.useDelimiter(" *"); //"0 or more repetitions of whitespace"
        //keyboardWords.useDelimiter("\\D"); //"any non-digit character"
        //keyboardWords.useDelimiter(","); //"a comma"
        //keyboardWords.useDelimiter("\\n"); //"the nextline escape sequence, or, enter"

        //scanner object for reading number input.
        keyboardNumbers = new Scanner(System.in);
        /*
        See above for explanation of commented out delimiters.
        This scanner object uses the "any non-digit character" delimiter.  The assignment asked
        for the delimiter to be set as a comma ',' but that requires the user to enter a comma
        after the last number which is confusing and requires specific instructions.
        With /D, the user has much more freedom in how they enter the data, so it seems to work
        better as a delimiter in this particular case.
         */
        keyboardNumbers.useDelimiter("\\D *");
        //keyboardNumbers.useDelimiter(" *");
        //keyboardNumbers.useDelimiter("\\D");
        //keyboardNumbers.useDelimiter(",");
        //keyboardNumbers.useDelimiter("\\n");


        //Creating a new File object.  Constructor File instructs object to access from a text file.
        inputFile = new File("inputFile");
        //Crating a new Scanner object to read the File object created above.
        readFile = new Scanner(inputFile);

        //Prompt to enter first and last name.
        System.out.println("Hello, my name is 0010001, " +
                "What is yours? (first, space, last please)");

        //Assigning the value of the string variables as the next entered string read by the
        // designated scanner.
        nameFirst = keyboardWords.next();
        nameLast = keyboardWords.next();

        //Prints this concatenation of strings and variable values.
        System.out.println("Hello " + nameFirst + " " + nameLast + ", It's nice to meet you!");
        System.out.println();   //prints a blank line to help make the output more readable.

        System.out.println("Math is hard " + nameFirst + ","); //prints the concatenation
        System.out.println("Isn't it?"); //prints the string
        System.out.println("I'll help you with some of it."); //prints the string
        System.out.println(); //prints a blank line
        System.out.println("Let's figure out how many hours you spend on average " +
                "studying for CSC200 every ten days."); //prints a string
        /*
        Prints a long string which utilizes the escape sequence \n to break it up into a more
        readable format by printing everything following the \n on a new line.
         */
        System.out.println("Enter ten whole numbers, separated by commas," +
                " \nwhich represent the number of hours spent per day over " +
                "the last ten days studying Java. \n" +
                "The hours can be spent reading, writing programs, or watching " +
                "professor Kanchanawanchai's videos on Youtube.");

        /*
        Assigning the values of the integer variables by reading user input with the designated
        scanner object specifically delimited to recognize just the integers and store them
        in the appropriate memory spaces.
         */
        n1 = keyboardNumbers.nextInt();
        n2 = keyboardNumbers.nextInt();
        n3 = keyboardNumbers.nextInt();
        n4 = keyboardNumbers.nextInt();
        n5 = keyboardNumbers.nextInt();
        n6 = keyboardNumbers.nextInt();
        n7 = keyboardNumbers.nextInt();
        n8 = keyboardNumbers.nextInt();
        n9 = keyboardNumbers.nextInt();
        n10 = keyboardNumbers.nextInt();

        //Assigning the value of sum to be the mathematical expression of all the integer variables
        //added together
        sum = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10);
        //Assigning the value of average as the quotient of sum divided by ten.
        average = (sum / 10);

        System.out.println(); //prints a blank line
        System.out.println("Got it."); //prints a string
        /*
        Prints the user-input values of all the identified integer variables in single quotes
        by utilizing the escape sequence \'
         */
        System.out.println("You entered: \'" + n1 + "\' , \'" + n2 + "\' , \'" + n3 + "\' , \'"
                + n4 + "\' , \'" + n5 + "\' , \'" + n6 + "\' , \'" + n7 + "\' , \'" + n8 + "\' , \'"
                + n9 + "\' , \'" + n10 + "\'");
        System.out.println(); //prints a blank line

        /*
        This block of code is commented out as a different way to obtain the same results as the
        file reading method below it.  Both ways would work to print the same strings.
         */
        //System.out.println("The average amount of time you have spent futilely attempting" +
        //        " to force-feed Java into your feeble human memory banks is:\n" + average +
        //        " hours.  \nObviously it's not enough, and it will never be enough" +
        //        " \nso just quit now and go cry yourself to sleep.");

        //prints the text read from the text file using the designated scanner.
        System.out.println(readFile.nextLine()); //reads and prints first line of .txt
        System.out.println(readFile.nextLine()); //second line of .txt
        System.out.println("is: " + average + " hours."); //prints a concatenation
        System.out.println(readFile.nextLine()); //third line of .txt
        System.out.println(readFile.nextLine()); //fourth line of .txt

        //Closes the scanners to prevent 'resource leak'
        keyboardWords.close();
        keyboardNumbers.close();
        readFile.close();
    }

}
