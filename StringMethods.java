import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/*
String are sequences of characters.In java String are treated as Objects.
The String class is immutable, so that once it is created a String object
cannot be changed. If there is a necessity to make a lot of modifications
to Strings of characters, then you should use String Buffer & String Builder Classes.
 */
public class StringMethods {
    public static void main(String[] args) {
        String str = "This is a String";//string declaration
        char[] chars = {'t','h','i',' ','.','A'};//char Array
        String Chars = new String(chars);//Convert char array to String using Constructor
        System.out.println(Chars);
        System.out.println(new String(chars));
        //------------------------------------------------
        //String Methods
        //1.char charAt(int index)
        char res = str.charAt(0);
        System.out.println("At 0 index of str:\s"+res);
        //-------------------------------------------------
        //2.int compareTo(Object o)
        String str1 = "I am happy";//String Value
        String str2 = new String("I am happy");//String Object
        String str3 = new String("Hey welcome!");

        /*
        compareTo() returns :-->
        The value 0 if the argument is a string lexicographically equal to this string;
        a value less than 0 if the argument is a string lexicographically greater than
        this string; and a value greater than 0 if the argument is a string lexicographically
         less than this string.
         */
        int result = str1.compareTo(str2);
        System.out.println(result);
        int result1 = str2.compareTo(str3);
        System.out.println(result1);
        //-----------------------------------------------------
        //3.int compareTo(string anotherString)
        String strings = "This is a String";
        String strings1 = "This is not a String";
        int result3 = str.compareTo(strings);
        System.out.println(result3);
        int resultss = strings.compareTo(strings1);
        System.out.println(resultss);
        //-------------------------------------------------------
        //4.int compareToIgnoreCase(String str)
        String str4 = "this is a string";
        String str5 = "Hello World";
        String str6 = "hello String";

        int re = str4.compareToIgnoreCase(strings);
        System.out.println(re);
        int ree = str5.compareToIgnoreCase(str6);
        System.out.println(ree);
        //--------------------------------------------------------
        //5.String concat(string s)
        String str7 = str5.concat(str4);
        System.out.println(str7);
        //--------------------------------------------------------
        //6.boolean contentEquals(StringBuffer sb)
        /*
        This method returns true if and only if this String represents the same sequence
        of characters as the specified in StringBuffer, otherwise false
         */
        StringBuffer strObj = new StringBuffer(str4);
        boolean Result = strings.contentEquals(strObj);
        System.out.println(Result);
        //---------------------------------------------------------
        //7.static String copyvalueOf(char[] data)
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf( Str1 );
        System.out.println("Returned String: " + Str2);
        //----------------------------------------------------------
        //8.static String copyValueOf(char[] data, int offset, int count)
        String Str3 = "";
        Str3 = Str3.copyValueOf(Str1,1,4);
        System.out.println("Returned String :\s"+Str3);
        //-----------------------------------------------------------
        //9.boolean endsWith(String suffix) it returns true if string ends
        // with given string otherwise retursn false
        boolean rev = strings.endsWith("String");
        System.out.println(rev);
        //------------------------------------------------------------
        //10.boolean equals(Object anObject)
        /*
        This method compares this string to the specified object. The result is true
        if and only if the argument is not null and is a String object that represents
         the same sequence of characters as this object.
         */
        String Str = new String("hi welcome");
        String Sttr = Str;
        String Str7 = new String("hi welcome");
        System.out.println(Str.equals(Sttr));
        System.out.println(Str.equals(Str7));
        //11.boolean equalsIgnoreCase(String anotherString)
        String StR = "HI WELCOME";
        System.out.println(Str.equalsIgnoreCase(StR));
        //---------------------------------------------------------------
        //12.byte[] getBytes(String charsetName) throws UnsupportedEncodingException
        String Str11 = new String("Welcome Here");
        try{
            byte[] Str22 = Str11.getBytes( "UTF-8" );
            System.out.println("Returned Value " + Arrays.toString(Str22) );
             byte[] Str23 = Str11.getBytes( "ISO-8859-1" );
            System.out.println("Returned Value " + Str23 );
        }catch( UnsupportedEncodingException e){
            System.out.println("Unsupported character set");
        }
        //-----------------------------------------------------------------
        /*13.String getChars()
        public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        srcBegin -- index of the first character in the string to copy.
        srcEnd -- index after the last character in the string to copy.
        dst -- the destination array.
        dstBegin -- the start offset in the destination array.
         */
        String word = "Welcome";
        char[] al = new char[word.length()];
        try{
            word.getChars(0,word.length(),al,0);
            System.out.println("Copied Value\s:"+"\s"+Arrays.toString(al));
        }
        catch(Exception ex){
            System.out.println("Raised Exception:");
        }
        /*
        14.String hashCode()
        This method returns a hash code for this string.
         The hash code for a String object is computed as:
         s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
         */
        String greet = new String("Welcome");
        System.out.println("Hashcode for Welcome\s:"+greet.hashCode());

        /*
        15.String indexOf(int ch)
        This method returns the index within this string of the first occurrence
         of the specified character or -1, if the character does not occur
         */
        System.out.println(greet.indexOf('e'));
        /*16.String indexOf(int ch, int fromIndex) Method
        ch -- a character.
        fromIndex -- the index to start the search from.
         */
        String Greet = "Welcome in the Coding World!";
        System.out.println(Greet.indexOf('i',8));
        /*17.String indexOf(String str)
        same as previous method but here we will find a index of String
         */
        String Wishes = "Happy Birthday CodexRitik!";
        System.out.println(Wishes.indexOf("Codex"));
        System.out.println(Wishes.indexOf("ay",5));
        /*
        18.String intern() method
        This method returns a canonical representation for the string object. It follows that
        for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
         */
        String alpha = new String("NoOne Can Understand");
        System.out.println(alpha.intern());

        /*
        19.String lastIndexOf(int ch)
         */
        System.out.println(greet.lastIndexOf('e'));
        //String lastIndexOf(String str)
        System.out.println(Wishes.lastIndexOf("Codex"));
        //20.String lastIndexOf(String str,int fromIndex)
        System.out.println(Wishes.lastIndexOf('e',3));
        System.out.println(Wishes.lastIndexOf("py",2));

        //21.String length()
        String sen = "it is a java code";
        System.out.println("Length of sen\s:"+sen.length());
        /*
        22.String matches() method
        This method returns true if, and only if,
        this string matches the given regular expression.
         */
        String Line = "This is a Cat";
        System.out.println(Line.matches("is"));//false
        System.out.println(Line.matches("(.*)is(.*)"));//true
        /*
        23.String replace()
        This method returns a new string resulting from replacing
        all occurrences of oldChar in this string with newChar.
         */
        String Sen = "This is a Java Code";
        System.out.println(Sen.replace('a','n'));
        /*
        24. String replaceAll()
        This method replaces each substring of this string that matches the
        given regular expression with the given replacement
         */
        String newWord = "String is immutable immutable";
        System.out.println(newWord.replaceAll("(.*)immutable(.*)",
                "ABCDE" ));
        System.out.println(newWord.replaceAll("immutable","IMMUTABLE"));
        /*
        25.String replaceFirst()
        This method replaces the first substring of this string that
        matches the given regular expression with the given replacement
         */
        String newSen = "String is not mutable";
        System.out.println(newSen.replaceFirst("not","NOT"));
        /*
        26.String Split()
        It returns the array of strings computed by splitting this string
         around matches of the given regular expression.
         */
        String code = "This is a Mango";
        String[] stc = code.split(" ");
        System.out.println(Arrays.toString(stc));
        /*
        27.String startsWith()
        It returns true if the character sequence represented by the argument is a prefix of the
        character sequence represented by this string; false otherwise
         */
        String msg = "Hey! How are You?";
        System.out.println(msg.startsWith("Hey"));
        System.out.println(msg.startsWith("How",5));

        /*
        String subsequence() method
        public CharSequence subSequence(int beginIndex, int endIndex)
        This method returns the specified subsequence
         */
        System.out.println(msg.subSequence(1,6));
        //String substring()
        System.out.println(msg.substring(3,8));
        //String toCharArray()
        char[] chh = new char[msg.length()];
        chh = msg.toCharArray();
        System.out.println(Arrays.toString(chh));
        //String toLowerCase()
        System.out.println(msg.toLowerCase());
        //String toUpperCase()
        System.out.println(msg.toUpperCase());
        //String toString() returns itself
        System.out.println(msg.toString());
        //String trim()
        /*
        It returns a copy of this string with leading and trailing white space removed,
         or this string if it has no leading or trailing white space.
         */
        String wel = "     How are You?     ";
        System.out.println(wel.trim());
        /*
        String valueOf()
        This method has the many variants, which depend on the passed parameters.
         This method returns the string representation of the passed argument.
         */
        double d = 102939939.939;
        boolean b = true;
        long l = 1232874;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };
        System.out.println("Return Value : " + String.valueOf(d) );
        System.out.println("Return Value : " + String.valueOf(b) );
        System.out.println("Return Value : " + String.valueOf(l) );
        System.out.println("Return Value : " + String.valueOf(arr) );
    }
}
