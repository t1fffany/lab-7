import java.util.Scanner;
import java.util.ArrayList;

public class Quiz{
	public static void main (String[] args){

		ArrayList<Object> questionArray = new ArrayList<Object>();

		Question quiz= new Question();// Question
		quiz.setText("Who was the inventor of Java"); 
		quiz.setAnswer("James Gosling");
		quiz.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
      	String response = in.nextLine();
      	System.out.println(quiz.checkAnswer(response));
      	questionArray.add(q);

      	ChoiceQuestion third= new ChoiceQuestion(); //Choice
	      third.setText("What was the original name of the Java language?");
	      third.addChoice("*7", false);
	      third.addChoice("Duke", false);
	      third.addChoice("Oak", true);
	      third.addChoice("Gosling", false);

	      ChoiceDemo.presentQuestion(third);
	      questionArray.add(third);

	    FillInQuestion question2 = new FillInQuestion(
         "_James Gosling_ was the inventor of Java.");
      	 question2.display();
         System.out.println("Your answer: ");
         response = in.nextLine();
         System.out.println(question2.checkAnswer(response)); 
         questionArray.add(question2);


         AnyCorrectChoiceQuestion question3 = new AnyCorrectChoiceQuestion(
         "Which countries are in Africa?");
      question3.addChoice("Ghana", true);
      question3.addChoice("Canada", false);
      question3.addChoice("Benin", true);
      question3.addChoice("Denmark", false);

      question3.display();
         System.out.println("Your answer: ");
         String response2 = in.nextLine();
         System.out.println(question3.checkAnswer(response2));
         questionArray.add(question3);



       ChoiceQuestion fourth= new MultiChoiceQuestion();
       fourth.setText("Which programming languages use { } for blocks?");
      fourth.addChoice("Java", true);
      fourth.addChoice("Python", false);
      fourth.addChoice("C++", true);
      fourth.addChoice("Scheme", false);

      ChoiceDemo.presentQuestion(fourth);
         questionArray.add(fourth);

         for (Object o: questionArray){
         	o.display();
         	System.out.println("Your answer: ");
         	String newResponse= in.nextLine();
         	System.out.println(o.checkAnswer(newResponse));
         }


	       
	}

}