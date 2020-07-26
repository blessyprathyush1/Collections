package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class collections
{

	@SuppressWarnings("finally")
	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>(10);
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("\tElements\nAdd\nFetch\nRemove");
		String input;
		for( i = 0;; i++) 
		{
			
			input = s.nextLine();
			if(input.equals("exit") == true) break;
			switch(input)
			{
		    	case "add" : list.add(s.nextInt());
			                 s.nextLine();
			                 break;
			    case "fetch" : try{
						            int x = list.get(s.nextInt());
						            System.out.println("Fetched element is:"+x);
						            s.nextLine(); 
					            }
						        catch(Exception e) 
						        {
							        System.out.println("No such element");
						            
						        }	
						       break;
			    case "remove": try{
						            int x = list.remove(sc.nextInt());
						            System.out.println("Removed ELEMENT:"+x);
						            s.nextLine(); 
				
						          }
						       catch(Exception e)
						          {
							        System.out.println("No such element");
					              }	
						       break;
		    	default: System.out.println("INVALID INPUT");break;
			}
		}
		
		System.out.println("Printing Elements:");
		
		for( i : list) System.out.println(i);
		s.close();
	}

}