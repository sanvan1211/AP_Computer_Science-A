import java.util.*;

/* Sanhith Vandara
   Honors Java pd 1 */
public class Main {
    public static void main(String[] args) {
      
// Step I 
        // declare variables
        String studentName = "Harry Potter";
        String studentSchool = "The Hogwarts School";
        int studentAge = 17;
        char studentGrade = 'B';
        double studentGradePointAverage = 3.25;
        boolean isHonorSociety = studentGradePointAverage >= 3.75;

// Step II 
        // concatenate string 
        String studentInformation = "The student's name is " + studentName +
            " and he attends " + studentSchool +
            ". He is " + studentAge + " years old. " +
            "He has a grade of " + studentGrade +
            " in the course Magic Spells 101. " +
            studentName + "'s cumulative GPA is " + studentGradePointAverage + ".";
        // print result
        System.out.println(studentInformation);
        
// Step III 
//calculate GPA 
        double finalGrade = (3.75 + 4.0 + 3.37 + 4.0 + 2.5) / 5;
System.out.println("Harry's final grade average is " + finalGrade);

//Stp IV 
// final print 
System.out.println(studentInformation);
System.out.println("Is Harry Potter in the Honor Society? " + isHonorSociety);
System.out.println("Harry's final grade for Magic Spells 101 is " + finalGrade);

    }
}
