public class gradingTest {
    public static void main(String[] args) {
        Grading grade = new Grading();

        //get the subjects codes from the user and display them
        grade.getSubjects();
        grade.DisplaySubjects();

        // get the credits for each subject and display the subject with its corresponding credit number

        grade.getSubCredit();
        grade.DisplaySubjectsCredits();


        //get the final grades from the user & display them & display the average final grade with category
        grade.getFinalGrades();
        grade.DisplayFinalGrades();
        grade.DisplayFinalAvg();

    }
}
