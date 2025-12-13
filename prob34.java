import java.util.*;
public class prob34{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int nodes  = sc.nextInt();
        int edges = sc.nextInt();

        for(int i = 0 ; i < nodes ; i++){
            adjList.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i < edges ; i++){
            int from = sc.nextInt();
            int to = sc.nextInt();

            adjList.get(from).add(to);
            adjlist.get(to).add(from);

        }

        for(int i = 0 ; i < adjList.size() ; i++){
            System.out.println(i + " --> " + adjList.get(i));
            System.out.println();
        }
    }
}