import java.util.Scanner;

public class Emojis
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("PLease type here:");
		String text = in.nextLine();
		text = text.toLowerCase();

		for(int i = 0; i < text.length(); i++)
		{
			char ch = text.charAt(i);
			if (ch == ',')
			{
				System.out.print(",");
			}
				
			else if (ch == '.')
			{
				System.out.print(".");
			}
			
			else if (ch == '\'')
			{
				System.out.print("'");
			}
				
			else if (ch == '!')
			{
				System.out.print("!");
			}
				
			else if (ch == '?')
			{
				System.out.print("?");
			}
				
			else if (ch == '/')
			{
				System.out.print("/");
			}
				
			else if (ch == ':')
			{
				System.out.print(":");
			}
				
			else if (ch == ';')
			{
				System.out.print(";");
			}
			
			else if (ch == 'b')
			{
				System.out.print(":b:");
			}
			
			else if (ch == 'a')
			{
				System.out.print(":a:");
			}
			
			else if (ch == ' ')
			{
				System.out.print("     ");
			}
				
			else 
			{
				System.out.print(":regional_indicator_" + ch + ": ");	
			}	
		}			
	}
	
}
