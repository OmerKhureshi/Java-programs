import java.lang.Math;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class HelloWorld
{
  public static void main(String[] args)
  {
    List<Integer> individualPlayScores = new LinkedList<>();
    individualPlayScores.add(2);
    individualPlayScores.add(3);
    individualPlayScores.add(7);
    System.out.println("Total combinations: " + numCombinationsForFinalScore(12, individualPlayScores));
  }
  
  public static int numCombinationsForFinalScore(int finalScore, List<Integer> individualPlayScores) {
    
    if (finalScore == 0 || individualPlayScores.size() == 0)
      return 0;
    
    int[][] A = new int[individualPlayScores.size()][finalScore+1];
    for (int i = 0; i < individualPlayScores.size(); i++) {
      	A[i][0] = 1;
    	for (int j = 1; j <= finalScore; j++) {
        	int combinations = 0;
            int withOut = (i-1 >= 0) ? A[i-1][j] : 0;
            
            int with= (j-individualPlayScores.get(i) >= 0) ? combinations += A[i][j - individualPlayScores.get(i)] : 0 ;
          	A[i][j] = with + withOut;
        }
    }
    
    System.out.println(Arrays.toString(A[0]));
    System.out.println(Arrays.toString(A[1]));
    System.out.println(Arrays.toString(A[2]));
    return A[individualPlayScores.size() - 1][finalScore];
  }
}