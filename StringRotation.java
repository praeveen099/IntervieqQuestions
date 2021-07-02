//String Rotation:Assume you have a method isSubstring which checks if one word is a substring
//        of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
//        call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
public class StringRotation
{
    public static void main(String[] args)
    {
        System.out.println("waterbottle, erbottlewat " + hasStringRotation("waterbottle", "erbottlewat"));
        System.out.println("waterbottle, waterbottle " + hasStringRotation("waterbottle", "waterbottle"));
        System.out.println("water bottle, erbottlewat " + hasStringRotation("water bottle", "erbottlewat"));
        System.out.println("waterbottl, waterbottle " + hasStringRotation("waterbottl", "waterbottle"));
        System.out.println("ea sport, easports " + hasStringRotation("ea sport", "easports"));

    } // main

    private static boolean hasStringRotation(String a, String b)
    {
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i)==' ' || b.charAt(i) == ' ')
                return false;
        }

        String aa = a + a;
        return aa.contains(b);
    } // hasStringRotation
} // StringRotation
