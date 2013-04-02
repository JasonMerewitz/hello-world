import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class GreenEggsandHam {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner f = new Scanner(new File("greenEggsAndHam.txt"));
		
		ArrayList<String> story = new ArrayList<String>();
		story.add(f.next());
		
		while(f.hasNext())
		{

			String word = f.next();
			
			int count = 0;
			for(int i = 0; i < story.size(); i++)
			{
				if(word.toUpperCase().equals(story.get(i).toUpperCase()))
					count++;

			}
			if(count == 0)
			{
				story.add(word);
			
			}	
	
			
		}
		
		System.out.println(story.size());
		System.out.println(story);
	}

}
