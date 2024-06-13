import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MColoring {
    public boolean graphColoring(boolean edges[][], int m, int n) {
        // Your code here
        if(m>=n) return true;
        boolean visited[] = new boolean[n];
        int color[] = new int[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(edges[i][j]){
                graph.get(i).add(j);
                graph.get(j).add(i);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!visited[i]) bfs(graph,visited,color,i);
        }
        for(int i: color){
            if(i>=m) return false;
        }
        return true;
    }
    public void bfs(ArrayList<ArrayList<Integer>> graph,boolean[] visited,int[] color,int strt){
        Queue<Integer> que = new LinkedList<>();
        que.add(strt);
        while(!que.isEmpty()){
            int curr = que.remove();
            if(visited[curr]) continue;
            visited[curr] = true;
            for(Integer nb:graph.get(curr)){
                if(color[curr] == color[nb]) color[nb]++;
                if(!visited[nb]) que.add(nb);
            }
        }
    }
}
