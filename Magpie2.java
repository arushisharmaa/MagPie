package MagPie; 
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	public String noCharacter(String statement)
	{
		String statement2 = statement.trim(); 
		int statementLength = statement2.length();
		if(statementLength == 0)
		{
			return "Please say something"; 
		}
		return statement; 
		
	}
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if(statement.trim().length() ==1)
		{
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if(statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets?";
		}
		else if(statement.indexOf("Mr.") >= 0
				|| statement.indexOf("Mrs.") >= 0
			|| statement.indexOf("Ms.") >= 0)
		{
			response = "They sound like a great teacher!";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("what") >= 0
				|| statement.indexOf("huh?") >= 0
				|| statement.indexOf("confused") >= 0
				|| statement.indexOf("why") >= 0)
		{
			response = "Are you confused?";
		}
		else if (statement.indexOf("Hello") >= 0
				|| statement.indexOf("Hi") >= 0
				|| statement.indexOf("What's up?") >= 0
				|| statement.indexOf("Heyo") >= 0)
		{
			response = "Hi! What's your name" ;
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
		return " ";
	}
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		
		else if (whichResponse == 4)
		{
			response = "Very cool! How are you today? ";
		}
		
		
		else if (whichResponse == 5)
		{
			response = "How nice, it's been a long day. ";
		}

		return response;
	}
}
