import java.util.*;
public class ProgrammingQuiz {
    private char[] solutions = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};
    private char[] studentAnswers;
    private int[] studentIncorrectAnswers;
    private int totalCorrect = 0;
    private int totalIncorrect = 0;

    public ProgrammingQuiz(char[] s)
    {
        studentAnswers = new char [s.length];
        for (int i = 0; i < s.length; i++)
            studentAnswers[i] = s[i];
    }

    public void gradeQuiz()
    {
        for (int i = 0, j = 0; i < studentAnswers.length; i++, j++)
        {
            if (studentAnswers[i] == solutions[j]) {
                totalCorrect++;
            }
            else {
                totalIncorrect++;
            }
        }
    }

    public int getTotalCorrect()
    {
        return totalCorrect;
    }

    public int getTotalIncorrect()
    {
        return totalIncorrect;
    }

    public StringBuilder getScore()
    {
        int score = (totalCorrect / solutions.length) * 100;
        StringBuilder str = new StringBuilder();
        str.append("Your score is " + score + " percent.");
        return str;
    }

    public int[] getStudentIncorrectAnswers()
    {
        studentIncorrectAnswers = new int[totalIncorrect];
        int m = 0;
        for (int i = 0; i < studentAnswers.length; i++)
        {
            if (studentAnswers[i] != solutions[i])
            {
                studentIncorrectAnswers[m] = (i + 1);
                m++;
            }
        }
        return studentIncorrectAnswers;
    }
}
