import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   protected ArrayList<String> choices;
   protected ArrayList<String> multCorrect; //switch to String later

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {
      choices = new ArrayList<String>();
      multCorrect= new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         setAnswer(String.valueOf(choices.size()));// Convert choices.size() to string
          //for(int i=0; i<choices.size()+ 1; i++){
         multCorrect.add(getAnswer());
      
   }
}
   
   public void display()
   {
      super.display();
      for(int i=0; i<choices.size(); i++){
         System.out.println((i+1)+": "+ choices.get(i));
      // System.out.println("1: "+choices.get(0)); // don't hard code, make for loop 
      // System.out.println("2: "+choices.get(1));
      // System.out.println("3: "+choices.get(2));
      // System.out.println("4: "+choices.get(3));
   }
   }
}

