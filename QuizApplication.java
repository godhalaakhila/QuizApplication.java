public class QuizApplication {
    public static void main(String[] args) {
        // Questions and options for the quiz
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest ocean on Earth?"
        };
        
        String[][] options = {
            {"A. Berlin", "B. Madrid", "C. Paris", "D. Rome"},
            {"A. Earth", "B. Mars", "C. Venus", "D. Jupiter"},
            {"A. Atlantic Ocean", "B. Pacific Ocean", "C. Indian Ocean", "D. Arctic Ocean"}
        };
        
        // Correct answers for the quiz
        char[] correctAnswers = {'C', 'B', 'B'};
        
        int score = 0;  // User's score
        
        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            
            // Display options
            for (String option : options[i]) {
                System.out.println(option);
            }
            
            // Get the user's answer
            char answer = getAnswer();
            
            // Check if the answer is correct
            if (answer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
            }
        }
        
        // Display final score
        System.out.println("Your final score is: " + score + "/" + questions.length);
    }
    
    // Method to get user's answer
    public static char getAnswer() {
        // Simulate getting user input (in a real program, you can use Scanner to read input)
        // For simplicity, we'll just use 'C' as the answer
        return 'C';  // In a real scenario, replace with user input logic
    }
}
 
    

