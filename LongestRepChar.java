/**
 * Find the longest repeating character in a sorted array.
 */
public class LongestRepChar
{
  public static void main(String[] args)
  {
    System.out.println(longestRepeatingChar(new char[] {}));
    System.out.println(longestRepeatingChar(new char[] { 'a', 'b', 'c', 'd', 'e'}));
    System.out.println(longestRepeatingChar(new char[] { 'a', 'a', 'a', 'a', 'a'}));
    System.out.println(longestRepeatingChar(new char[] { 'a', 'b', 'c', 'c', 'c', 'd', 'e'}));
  }
  
  public static int longestRepeatingChar(char[] in) {
    if (in.length == 0 || in == null) {
      return 0;
    }
    
    char prev = in[0], cur;
    int counter = 0, max = 0;
    
    for (int i=1; i<in.length; i++) {
      cur = in[i];
      if (prev == cur) {
       counter++;
      }
      
      // Possible optimizations
      /*
      while (prev == cur && i < in.length - 1) {
        cur = in[++i];
        counter++;
      }
      */
      
      max = max < counter? counter : max;
      prev = cur;
    }
 
    return max + 1;
  }
}