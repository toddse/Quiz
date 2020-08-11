import java.util.*;
public class ProgrammingQuizDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char[] answers = new char[10];
        int count = 0;
        System.out.println("Enter you answers to the quiz questions. (Make sure Caps Lock is ON!)");

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Question " + (i + 1) + ": ");
            String input = keyboard.nextLine();
            if (input.charAt(0) != 'A' || input.charAt(0) != 'B' || input.charAt(0) != 'C' || input.charAt(0) != 'D')
            {
                System.out.println("ERROR: Valid answers are A, B, C, or D.");
                System.out.print("Question " + (i + 1) + ": ");
                input = keyboard.nextLine();
            }
            answers[i] = input.charAt(0);
        }

        ProgrammingQuiz quiz = new ProgrammingQuiz(answers);
        quiz.gradeQuiz();
        int[] missedQuestion = null;
        missedQuestion = quiz.getStudentIncorrectAnswers();
        System.out.println("Correct answers: " + quiz.getTotalCorrect());
        System.out.println("Incorrect answers: " + quiz.getTotalIncorrect());
        System.out.println(quiz.getScore());
    }
}
