public class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Tact Coa " + isPalindromePermutation("Tact Coa"));
        System.out.println("redivider " + isPalindromePermutation("redivider"));
        System.out.println("dam am  " + isPalindromePermutation("dam am"));
        System.out.println("kayak " + isPalindromePermutation("kayak"));
        System.out.println("refer " + isPalindromePermutation("refer"));
        System.out.println("car " + isPalindromePermutation("car"));
        System.out.println("A  " + isPalindromePermutation("A "));

    } // main method

    private static boolean isPalindromePermutation(String phrase)
    {
        // character array to hold the frequency of the each character present in the string
        int[] charFrequency = buildCharFrequency(phrase);
        return checkMaxOneOddFrequencyInArray(charFrequency);


    }  // isPalindromePermutation

    private static boolean checkMaxOneOddFrequencyInArray(int[] charFrequency)
    {
        // for the palindrome to exist, there needs to be at most 1 character
        // which has odd frequency occurrence in the string
        boolean foundAnOddFrequency = false;

        for (int count: charFrequency)
        {
            if (count % 2 == 1)
            {
                if (foundAnOddFrequency)
                    return false;

                foundAnOddFrequency = true;
            } // if
        } // for
        return true;
        // checks if there is at
    } // checkMaxOneOddFrequencyInArray

    private static int[] buildCharFrequency(String phrase)
    {
        // an array to represent each of the characters, a to z, get numeric
        // value is case insensitive, 26 array entries are required
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        // get the frequency of each of the characters in the string
        for(char c: phrase.toCharArray())
        {


            int x = getCharNumber(c);
            if (x!=-1)
                table[x]++;
        } // for

        return table;
    }  // buildCharFrequency

    private static int getCharNumber(char character)
    {
        // method to convert the char to the range from 0 to 26 (a = 0, z=26)
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(character);

        // the value is between a and z, then return the converted form of it
        if (value >=a && value <= z)
            return value - a;

        // if it is not either, hence it is a non-letter, return -1
        return -1;
    } // getCharNumber

} // Palindrome class
