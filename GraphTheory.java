import java.io.*; 
import java.util.*;

public class GraphTheory {
    private int[][] graph;

    public GraphTheory(int[][] graph) {
        this.graph = graph;
    }

    private Map<Integer, Integer> walkToHashMap(int[] walk) {
        // https://stackoverflow.com/questions/13543457/how-do-you-create-a-dictionary-in-java
        // https://stackoverflow.com/questions/16148575/hashmap-and-int-as-key
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < walk.length; i++) {
            if (map.get(walk[i]) != null) {
                map.put(walk[i], 1);
            } else {
                map.put(walk[i], map.get(walk[i]) + 1);
            }
        }
        return map;
    }

    public int highestOccurancesOnAWalk() {
        walkToHashMap([1, 3, 0]);
        int maxVal = 0;
        int maxKey = 0;
        // Just gonna use this https://stackoverflow.com/questions/13553009/find-the-element-with-highest-occurrences-in-an-array-java
        // https://www.geeksforgeeks.org/how-to-iterate-hashmap-in-java/
        for (Map.Entry<Integer, Integer> set :
             walk.entrySet()) {
 
            if (set.getKey() > maxKey) {
                maxKey = set.getKey();
                maxVal = set.getValue();
            }
        }
        return maxVal;
    }

    //B
    public int[][] getGraph() {
        return graph;
    }

    public static int countEdges(int[][] g) {
        int sum = 0;
        for (int i = 0; i < g.length; i++) {
            for (int z = 0; z < g[i].length; z++) {
                sum += g[i][z];
            }
        }
        return sum;
    }
}