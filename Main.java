    
//contributor myah Jackson 
import java.util.ArrayList;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	System.out.println("Welcome to the Introvert Extrovert Quiz! Please answer yes or no to the following questions.");
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("Do you enjoy spending time alone?", true));
        questions.add(new Question("Do you like being the center of attention?", false));
        questions.add(new Question("Do you prefer small group gatherings over large parties?", true));
        questions.add(new Question("Do you often speak before you think?", false));
        questions.add(new Question("Do you feel drained after socializing for a long time?", true));
        questions.add(new Question("Do you enjoy meeting new people?", false));
        questions.add(new Question("Do you prefer to have a few close friends rather than many acquaintances?", true));
        questions.add(new Question("Do you tend to be quiet in group settings?", true));
        questions.add(new Question("Do you like to share your thoughts and feelings with others?", false));
        questions.add(new Question("Do you find it easy to strike up a conversation with someone you don't know?", false));

        Quiz quiz = new Quiz(questions);

        Scanner scanner = new Scanner(System.in);
        int introvertedScore = 0;
        int extrovertedScore = 0;

        for (Question question: quiz. getQuestions()) {
            System.out.println(question.getText());
            String answer = scanner.nextLine();
            if (answer.toLowerCase().equals("yes")) {
                if (question. isIntroverted()) {
                    introvertedScore++;
                } else {
                    extrovertedScore++;
                }
            }
        }

        System.out.println("Introverted score: " + introvertedScore);
        System.out.println("Extroverted score: " + extrovertedScore);
    }
}

int[] answers = new int[questions.size()];
        
        System.out.println("Welcome to the personality quiz!");
        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + question.getQuestion());
            System.out.println(question.getChoices());
            System.out.print("Enter your answer: ");
            String input = scanner.nextLine();
            if (input.equals("a")) {
                answers[i] = 1;
            } else if (input.equals("b")) {
                answers[i] = 2;
            } else if (input.equals("c")) {
                answers[i] = 3;
            } else if (input.equals("d")) {
                answers[i] = 4;
            } else {
                System.out.println("Invalid input, please try again.");
                i--;
            }
        }
        
        int total = 0;
        for (int answer : answers) {
            total += answer;
        }
        
        if (total < 5) {
            System.out.println("You are an introvert!");
        } else if (total < 10) {
            System.out.println("You are an extrovert!");
        } else if (total < 15) {
            System.out.println("You are an introvert!");
        } else {
            System.out.println("You are an extrovert!");
        }
    }
    
    public static class Question {
        private String question;
        private String choices;
        
        public Question(String question, String choices) {
            this.question = question;
            this.choices = choices;
        }
        
        public String getQuestion() {
            return question;
        }
        
        public String getChoices() {
            return choices;
        }
    }
}
