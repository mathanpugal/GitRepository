package week8.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
	public static void main(String[] args) {
		//eMail();
		cC();
	}		

	public static void eMail()
	{
		String regEx = "asqwqw@gmail.com";
		//String pattern = "\\W[a-zA-Z]{5}";
		String pattern = "\\W[a-zA-Z]{5}\\W[a-zA-Z]{3}";
		Pattern newPattern = Pattern.compile(pattern);
		Matcher match = newPattern.matcher(regEx);
		while(match.find()) {
			String group = match.group();
			System.out.println(group.substring(1));
			//System.out.println(match.group());
		}
	}

	public static void cC() {
		String regEx = "1234-1234-5678-5678";
		String pattern = "\\d{4}\\W\\d{4}\\W\\d{4}\\W\\d{4}";
		Pattern newPattern = Pattern.compile(pattern);
		Matcher match = newPattern.matcher(regEx);
		if (regEx.length()==19)
		{
			while(match.find()) {
				//String group = match.group();
				//System.out.println(group.substring(1));
				System.out.println(match.group());
			}

		}
	}
}