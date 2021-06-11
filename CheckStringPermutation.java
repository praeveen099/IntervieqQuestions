public class CheckStringPermutation
{
    public static void main(String[] args)
    {

        System.out.println(isPermutationOfOtherString("a","a") + " " + "a,a");
        System.out.println(isPermutationOfOtherString("ab","ab") + " " + "ab,ab");
        System.out.println(isPermutationOfOtherString("aa","aa") + " " + "aa,aa");
        System.out.println(isPermutationOfOtherString("","") + " " + ",");
        System.out.println(isPermutationOfOtherString("a a","aa") + " " + "a a,aa");
        System.out.println(isPermutationOfOtherString("b","a") + " " + "b,a");
        System.out.println(isPermutationOfOtherString("","c") + " " + ",c");
        System.out.println(isPermutationOfOtherString("da","ad") + " " + "da,ad");
        System.out.println(isPermutationOfOtherString("bcb","cbc") + " " + "bcb,cbc");

    } // main method

    private static boolean isPermutationOfOtherString(String a, String b)
    {
        // if they have different lengths, then b is not a permutation of a
        if (a.length() != b.length())
            return false;

        // character array to hold an array entry for each ASCII character
        int[] letters = new int[128];

        char[] a_charArray = a.toCharArray();

        // add to the int array every occurrence of a character in string a
        for (char a_char : a_charArray)
            letters[a_char]++;

        // now check through b string to see the number of times a character
        // appears in a is equal to the number of times it appears in b
        for (int indexThroughB = 0; indexThroughB < b.length(); indexThroughB++)
        {
            char b_char = b.charAt(indexThroughB);
            letters[b_char]--;
            if(letters[b_char] < 0)
                return false;
        } // for

        return true;
    } // isPermutationOfOtherString
}
