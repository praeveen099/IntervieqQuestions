public class Urlify
{
    public static void main(String[] args)
    {
      System.out.println(convertSpacesToString("OneWord", 7));
      System.out.println(convertSpacesToString("Two Words  ", 9));
      System.out.println(convertSpacesToString("There are three spaces      ", 22));

    }

    private static String convertSpacesToString(String string, int trueLengthOfString)
    {
        char[] charArrayToReturn = new char[string.length()];

        // index to hold through the char array, we will be using another index to go through the string
        int indexThroughCharArray = 0;

        // replace each of the spaces with the %20
        for (int indexThroughString = 0; indexThroughString < trueLengthOfString; indexThroughString++)
        {
            char currentCharInString = string.charAt(indexThroughString);
            if (currentCharInString == ' ')
            {
                charArrayToReturn[indexThroughCharArray++] ='%';
                charArrayToReturn[indexThroughCharArray++] ='2';
                charArrayToReturn[indexThroughCharArray++] ='0';
            } // if
            else
                charArrayToReturn[indexThroughCharArray++] = currentCharInString;

        } // for

        // convert char array to a string
        return new String(charArrayToReturn);
    } // convertSpacesToString
}
