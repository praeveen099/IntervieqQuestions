    //String Compression: Implement a method to perform basic string compression using the counts
    //        of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
    //        "compressed" string would not become smaller than the original string, your method should return
    //        the original string. You can assume the string has only uppercase and lowercase letters (a - z).

public class StringCompression
{
    public static void main(String[] args) 
    {
        System.out.println("a " + stringCompression("a"));
        System.out.println("ab " + stringCompression("ab"));
        System.out.println("aab " + stringCompression("aab"));
        System.out.println("abaa " + stringCompression("abaa"));
        System.out.println("abccccccb " + stringCompression("abccccccb"));
        System.out.println("aaa " + stringCompression("aaa"));
        
    } // main

    private static String stringCompression(String string)
    {
        int finalLength = countCompression(string);

        if (finalLength >= string.length())
            return string;

        StringBuilder compressed = new StringBuilder(finalLength);
        int countConsecutive = 0;

        for (int i = 0; i< string.length();i++)
        {
            countConsecutive++;

            if (i+1 >= string.length() || string.charAt(i) != string.charAt(i+1))
            {
                compressed.append(string.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;

            } //if


        }
        return compressed.toString();

    } // stringCompression

    private static int countCompression(String string)
    {
        int compressedLength = 0;
        int countConsecutive = 0;

        for (int i = 0; i< string.length();i++)
        {
            countConsecutive++;

            if (i+1 >= string.length() || string.charAt(i) != string.charAt(i+1))
            {
                // 1 because of the char and then the length of the frequency of
                // consecutive chars
                compressedLength += 1 +  String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            } // if

        }
        return  compressedLength;
    } // countCompression

} // StringCompression
