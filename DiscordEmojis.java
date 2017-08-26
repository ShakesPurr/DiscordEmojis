import java.util.Scanner;

public class DiscordEmojis
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("PLease type here, without any spaces:");
		String text = in.next();
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
				
			else 
			{
					System.out.print(":regional_indicator_" + ch + ": ");	
			}	
		}			
	}
}
