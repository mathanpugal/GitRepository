package week8.day1;

public class HomeAssesment {
	public static void main(String[] args) {
		replaceSpecialCharacter();
	}
	public static void replaceSpecialCharacter()
	{
		String nString = "{Java}/\\*(Selenium)";
		System.out.println(nString.replace("\\W", ""));
	}

}
