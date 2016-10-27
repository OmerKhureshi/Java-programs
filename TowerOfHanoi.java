import java.io.*;
import java.util.Deque;
import java.util.List;
import java.util.LinkedList;

class TowerOfHanoi
{
    public static void main (String[] args) throws java.lang.Exception
    {
        driver(4);
    }
    
    public static void driver(int numOfRings) 
    {
        List<Deque<Integer>> pegs = new LinkedList<>();
        Deque<Integer> P1 = new LinkedList<>();
        Deque<Integer> P2 = new LinkedList<>();
        Deque<Integer> P3 = new LinkedList<>();
        pegs.add(P1);
        pegs.add(P2);
        pegs.add(P3);
        
        for (int i = numOfRings; i > 0; i-- ) {
            P1.push(i);
        }
        
        move(pegs, numOfRings, 0, 1, 2);
    }
    
    public static void move(List<Deque<Integer>> pegs, int numOfRings, int from, int use, int to)
    {

        if (numOfRings > 0)
        {
            move(pegs, numOfRings - 1, from, to, use);
            pegs.get(to).push(pegs.get(from).pop());
            System.out.println("Move " + from + " to " + to);
            move(pegs, numOfRings - 1, use, from ,to);
        }
    }
}
