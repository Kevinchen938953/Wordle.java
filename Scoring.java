public class Scoring
{
	Wordle_Input_File word = new Wordle_Input_File();
	WordUser user = new WordUser();
	int failcount = 0;
	public void isCorrect(String guess, String answer)
	{
	 
		for(int i=0; i<5; i++)
		{
			if(answer.substring(i).equals(guess.substring(i)))
			{
				System.out.println("These letters are in the right spot" + answer.substring(i));
				break;//Determining if letters are in correct positions
			}
			else if(guess.substring(i).equals //not complete yet. i will determine if the guess contains a right letter but in wrong position
			
			else if(!answer.substring(i).equals(guess.substring(i)))
			{
				System.out.println("These letters are not in the right spot" + guess.substring(i));
				failcount++;//If the guess is not completely correct, then fail count goes up and attempt numbers go down. 
			}
		}
	   
	}
}
				
			
