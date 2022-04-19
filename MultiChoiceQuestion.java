public class MultiChoiceQuestion extends AnyCorrectChoiceQuestion{

	//private String manyThings;
	public MultiChoiceQuestion(){
		super();
	 }

private String correctAnswer;
	//@Override;
	public boolean checkAnswer(String response){
		response=response.replaceAll("\\s","");
		response="null";
		//System.out.println("this MultChoice was called");
		System.out.println("Correct Answer:"+ correctAnswer);
		System.out.println("This is response:"+ response);
		return correctAnswer.equals(response);
	}


   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         setAnswer(String.valueOf(choices.size()));// Convert choices.size() to string
          //for(int i=0; i<choices.size()+ 1; i++){
         correctAnswer+=getAnswer();
      
   }
}




}