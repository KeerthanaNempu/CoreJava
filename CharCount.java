import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class CharCount {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		HashMap<Character, Integer> count=new HashMap<Character,Integer>();
		for(char c:ch)
		{
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			else
			{
				count.put(c, 1);
			}
		}
		Set<Character> keys =count.keySet();
		for(char c:keys)
		{
			if(count.get(c)>1)
			{
				System.out.println(c+"is"+count.get(c)+"times");
			}
		}
		
	}

}
