package testLayer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Day2 {

	public static void main(String[] args) {
		//count occurences of letters in a word
		
		//getCharcount("Neeta");
		
		

		String word="Neetaree Roueee";
		int len=word.length();
		int count=0;
		
		for(int i=0;i<len;i++) {
			
			if(word.charAt(i)== 'e')
			{
				
				count++;
			}
					
			
		}
		System.out.println("total occurences of e are: " + count);

	}
	
	public static void getCharcount(String name) {
		
		Map<Character, Integer> cMap=new HashMap<Character, Integer>();
		char charName[]=name.toCharArray();
		
		for(char c:charName) {
			if(cMap.containsKey(c)) {
			cMap.put(c, cMap.get(c)+1);
			
		}
			else {
				cMap.put(c, 1);
			}
	}
		for(Entry m:cMap.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println();

}
	
	public static void CharO() {
		
		String word="Neetaree Roueee";
		int len=word.length();
		int count=0;
		
		for(int i=0;i<len;i++) {
			
			if(word.charAt(i)== 'e')
			{
				
				count++;
			}
					
			
		}
		System.out.println(count);
		
	}
}
