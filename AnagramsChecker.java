/*
 * Maximum execution time for this program : 6 sec
 
Two words are considered anagrams if all the second word can be
derived simply by rearranging the letters of the first word. For
example stop and post are anagrams since rearranging words in stop
can result in post.

Objective of this program is to find single word anagrams of 4 letters
or above in the given file/paragraph-string. Given file may contain many anagram words
and all the words should be listed in the output starting with anagrams
that have most words in the file.

Paragraph: 
John is at a post , where they make pots . Making the pots will stop in the future . Oh dear , what will happen to them when it happens . This can happen only in Rome . Read on to find more
 */
import java.util.*;
import java.util.Map.Entry;
public class AnagramsChecker {

	public static void main(String[] args) {
		Scanner sc 		   = new Scanner(System.in);
		System.out.println("Enter the paragraph:");
		String inputString = sc.nextLine();
		int inLen 		   = inputString.length();
		String[] input 	   = inputString.split(" ");
		
		sc.close();
		
		HashMap<String, LinkedHashSet<String>> hm = new HashMap<String, LinkedHashSet<String>>();
		
		for(int i=0;i<input.length;i++)
		{
			char[] c = input[i].toLowerCase().toCharArray();
			Arrays.sort(c);
			if(hm.containsKey(new String(c)))
			{
				LinkedHashSet<String> lhs = hm.get(new String(c));
				lhs.add(input[i]);
			}
			else
			{
				LinkedHashSet<String> lhs = new LinkedHashSet<String>();
				lhs.add(input[i]);
				hm.put(new String(c), lhs );
			}
		}
		
		Set<Map.Entry<String, LinkedHashSet<String>>> es 		= hm.entrySet();
		Iterator<Map.Entry<String, LinkedHashSet<String>>> esit = es.iterator();
		while (esit.hasNext())
		{
			Entry<String, LinkedHashSet<String>> entry = esit.next();
			LinkedHashSet<String> LHSet 			   = entry.getValue(); 
			if (LHSet.size() != 1)
			{
				Iterator<String> itr = LHSet.iterator();  
				while(itr.hasNext())
				{
					String value = itr.next();
					System.out.print(value);
					System.out.print(",");
						 
				}
				 System.out.println("\b"); //To delete the extra ',' in the end
			}
		}
		

	}
}
