import java.util.Scanner;
public class Grading {

    private int [] subjectsCode;
    private int[] Credits;
    private double[] finalExamsGrades;
    Scanner input = new Scanner(System.in);

    //get the code for each subject
    public void getSubjects(){

        System.out.println("How many subjects do you have ?");
        int nbSubjects = input.nextInt();
        subjectsCode = new int[nbSubjects];
        System.out.println("Enter each subject's code(it consists of 4 digits):");
        for(int i = 0 ; i < nbSubjects ;i++) {
            System.out.println("SUBJECT " + (i + 1) +" code"+ ":");

            int subCode = input.nextInt();
            subjectsCode[i] = subCode;
        }
    }

    public void DisplaySubjects(){
        System.out.println("SUBJECTS:");
        for(int i = 0 ; i < subjectsCode.length;i++){
            System.out.println(subjectsCode[i]);
        }
    }

    //get the credit number for each subject
    public void getSubCredit(){
        Credits = new int[subjectsCode.length];
       for(int i =0 ; i < subjectsCode.length ; i++){
           System.out.println("How many credits " +subjectsCode[i] + " is: ");
           int credit = input.nextInt();
           Credits[i] = credit;
       }
    }

    public int sumOfCredits(){
        int sum = 0;
        for(int i = 0 ; i < Credits.length ; i++){
            sum += Credits[i];
        }
        return sum;
    }
    public void DisplaySubjectsCredits(){
        System.out.println("SUBJECT CREDIT:");
        for(int i = 0 ;i < subjectsCode.length ; i++){
            System.out.println("-" + subjectsCode[i] + " is on " + Credits[i] + " credits");
        }

        System.out.println("Sum of credits: " +sumOfCredits());
    }

    public String Category(int gradeAvg){
        switch((int)gradeAvg/10){
            //for >= 90
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5:
                return "E";
            default:
                return "F";
        }
    }

    public void getFinalGrades(){
        finalExamsGrades = new double[subjectsCode.length];
        for(int i = 0 ; i < subjectsCode.length;i++){
            System.out.println("Enter " +subjectsCode[i] + " final exam grade: ");
            float grade = input.nextFloat();
            finalExamsGrades[i] = grade;
        }
    }

    public void DisplayFinalGrades(){
        System.out.println("FINAL EXAMS MARKS:");
        for(int i = 0 ;i < finalExamsGrades.length;i++){
            System.out.println(+subjectsCode[i] + " mark: " + finalExamsGrades[i]);
        }
    }

    // multiply each grade with its corresponding credit number and sum them then divide over the sum of credits
    public double finalAvg(){
        double sum = 0;
        for(int i = 0 ; i < subjectsCode.length ; i++){
            sum += finalExamsGrades[i] * Credits[i];
        }
        return sum / sumOfCredits();
    }

    public void DisplayFinalAvg(){
        System.out.println("-----------------------------");
        System.out.print("Final grade average is ");
        String s = String.format("%.1f",finalAvg());
        System.out.println(s);
        System.out.println("Final grade category is " +Category((int)finalAvg()));
        System.out.println("------------------------------");
    }

}
