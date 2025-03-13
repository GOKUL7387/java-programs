import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    String str=sc.next();
		    
		    HashMap<Character,Integer> hm=new HashMap<>();
		    boolean found=false;
		    for(int i=0;i<str.length();i++)
		    {
		        char ch=str.charAt(i);
		        if(hm.containsKey(ch))
		        {
		            hm.put(ch,hm.get(ch)+1);
		        }else
		        {
		            hm.put(ch,1);
		        }
		    }
		    for(int i=0;i<str.length();i++)
		    {
		        char ch=str.charAt(i);
		        if(hm.get(ch)>1)
		        {
		            System.out.println(ch);
		            found=true;
		            break;
		        }
		    }
		    if(!found)
		    {
		        System.out.println(".");
		    }
		}
	}
}
