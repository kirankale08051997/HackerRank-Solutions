package HackerRankPractice;
import java.util.Scanner;
public class StringAnnagrams {
    static boolean isAnagram(String a, String b) {
        String m = a.toLowerCase();
        String n = b.toLowerCase();
        boolean anagraming = true;
        char[] array1 = new char[256];
        char[] array2 = new char[256];
        if(m.length()!=n.length())
            return false;
        else
        {
            for(char c : m.toCharArray()){
                int index = (int) c;
                array1[index]++;
            }
            for(char c : n.toCharArray()){
                int index = (int) c;
                array2[index]++;
            }
            for(int i=0;i<256;i++)
            {
                if(array1[i]!=array2[i])
                {
                    anagraming = false;
                    break;
                }
            }
        }
        if(anagraming)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
