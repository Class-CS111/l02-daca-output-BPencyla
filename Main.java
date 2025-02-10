// PARTNER NAME:Bryan Pencyla
// PARTNER NAME:
// CS111 SECTION #:3033
// DATE: 2/9/2025

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		
		String surname = "Adams";
		String givenName = "Joe";
		String uscisNumber = "987-654-321";
		String category = "A11";
		String cardNumber = "A987654321";
		String countryOfBirth = "Mexico";
		String termsAndConditions = "Authorized for DACA only";
		String dateOfBirth = "10/31/1999";
		char sex = 'M';
		String validFrom = "01/01/2025";
		String cardExpires = "01/01/2027";

		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                         " + surname);
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )     " + givenName );
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_           " + uscisNumber + "    " + category + "           " + cardNumber);
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,        " + countryOfBirth);
		System.out.println("║   \\'-.______.-'/     Terms and Conditions");
		System.out.println("║    \\          /        " + termsAndConditions);
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`    " + dateOfBirth + "      " + sex);
		System.out.println("║                       Valid From:     " + validFrom);
		System.out.println("║                       Card Expires:   " + cardExpires);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}