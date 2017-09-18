import java.util.Scanner;

public class Spongbeb 
{
	public static void main(String[] args)
	{
		String words, spongbeb = " ";
		char letter1 = ' ';
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a word or sentence: ");
		words = input.nextLine();
		
		words = words.toLowerCase();
		int length = words.length();
		int counter = 0;
		
		while(length > 0)
		{
			letter1 = words.charAt(counter);
			if((length % 2) == 0)
			{
				letter1 = Character.toUpperCase(letter1);
			}
			else
			{
				letter1 = Character.toLowerCase(letter1);
			}
			spongbeb += letter1;
			length--;	
			counter++;
		}
		System.out.println(spongbeb + " http://pm1.narvii.com/6525/9892ea7ef90c095fc7938ab1a3385588ed6491b1_hq.jpg");
		input.close();
	}
}
