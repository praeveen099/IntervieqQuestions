public class UniqueCharacters
{
    public static void main(String[] args)
    {
        // Acceptance tests
        System.out.println("a " + isUnique("a"));
        System.out.println("ab " + isUnique("ab"));
        System.out.println("aa " + isUnique("aa"));
        System.out.println("\"\" " + isUnique(""));
        System.out.println("aba " + isUnique("aba"));
        System.out.println("abb " + isUnique("abb"));
        System.out.println("abcbcbc " + isUnique("abcbcbc"));

    } // main

    private static boolean isUnique(String string)
    {

        // 128 Ascii characters
        if (string.length()>128)
            return false;

        // default boolean values are false
        boolean[] isTheCharactersInString = new boolean[128];

        for(int index = 0; index< string.length(); index++)
        {
            int characterAtIndex = string.charAt(index);
            // if the character was already set to true from earlier part in string, return true
            if (isTheCharactersInString[characterAtIndex])
                return false;
            else
                // set true, we have seen this ascii character already
                isTheCharactersInString[characterAtIndex] = true;
        } // for

        return true;

    } // isUnique(String string)
}  // UniqueCharacters
