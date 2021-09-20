package SecondMostAppearnceLetterInAWord;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CheckAppearence {
	
	public static void main(String[] args) {
		String word="Banana";
		int count=1;
	 int first=1;
		 int second=0;
		
		Map<Character,Integer> appearence=new HashMap<Character,Integer>();
		for(int i=0;i<word.length();i++) {
			if(!appearence.containsKey(word.charAt(i))){
				appearence.put(word.charAt(i),count);
			}else {
				count=appearence.get(word.charAt(i));
				count=count+1;
				appearence.put(word.charAt(i),count);
			}
		}
		
		//to get the second heighest appreance
		for(Entry<Character,Integer> entry: appearence.entrySet()) {
			int value=entry.getValue();
			if(value>first) {
				second=first;
				first=value;
				
			}else if(value>second && value<first) {
				second=value;
			}
			}System.out.println(second);
			
			//to get the key of second most appeared value
			for(Entry<Character,Integer> entry: appearence.entrySet()) {
				if(entry.getValue()==second) {
					System.out.println(entry.getKey());
				}
			}
			
		}
}

