import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends ChoiceQuestion{

	//private ArrayList<String> multiAnswer; //ArrayList to hold all correct answers 
	//String name;

	public AnyCorrectChoiceQuestion(){
		super();
	}
	public AnyCorrectChoiceQuestion(String name){
		setText(name);
	}
	// public boolean multiCorrect(String option){
	// 	if (multCorrect.contains(option))
	// 		return true;

	// 	return false;
	// }
	//override checkAnswer to iterate through multCorrect and see if it matches 
	@Override
	public boolean checkAnswer(String response){
		//boolean someAns= false;
		//for (int i=0; i<multCorrect.size(); i++){
		//System.out.println("this method was called");
		//System.out.println("response"+response);
		//System.out.println("mult"+multCorrect);

			return multCorrect.contains(response);
				//someAns= true;



	}
}
	

