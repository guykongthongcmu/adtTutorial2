import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

/* 672115045 Virawit Kongthong (Guy)
 * Tutorial 2 Handling Student Data
 */

public class dataHandling {
    public static void main(String[] args) throws IOException{
        File f = new File("/Users/guykongthong/Desktop/cmu work/year1term2/adt/tutorials/tutorial 2/953102_701000-2.csv");
        Scanner readFile = new Scanner(f);

        for (int i = 0; i < 7; i++) {
            readFile.nextLine();
        }

        Vector<student> studentInfo = new Vector<student>();

        int index = 0;
        while (readFile.hasNextLine()) {
            String dataLine = readFile.nextLine();
            StringTokenizer studentToken = new StringTokenizer(dataLine.trim(),",");
            studentToken.nextToken();
            studentInfo.addElement(new student(studentToken.nextToken(), studentToken.nextToken(), studentToken.nextToken()));
            index++;
        }

        /* student i : studentInfo (i will be an instance of the student class and during each 
         * iteration i will be assigned the next student object from studentInfo)
         * this is called enhanced loop or for-each loop
        */
        for (student i : studentInfo) {
            System.out.println(i.toString());
        }

        System.out.println();

        displayResult(index, studentInfo);
        }
        
        public static int startingLetter(Vector<student> studentInformation, char letter) {
            int count = 0;
            for (int i = 0; i < studentInformation.size(); i++) {
                if ((studentInformation.elementAt(i)).getFirstName().toLowerCase().charAt(0) == (letter)) {
                    count++;
                }
            }
            return count;
        }

        public static void printStuName(Vector<student> studentInformation, char letter) {
            for (int i = 0; i < studentInformation.size(); i++) {
                if ((studentInformation.elementAt(i)).getFirstName().toLowerCase().charAt(0) == letter) {
                    System.out.println(studentInformation.elementAt(i));
                }
            }
        }
    
        public static void displayResult(int numStu, Vector<student> stuInfo) {
            System.out.println("Total number of students " + numStu);
            for (char letter = 'a'; letter <= 'z'; letter++) {
                System.out.println("Number of student's name starting with " + letter + " " + startingLetter(stuInfo, letter));
                System.out.println("Here are the student's names which start with letter " + letter);
                printStuName(stuInfo, letter);
                System.out.println();
        }

    }

}
