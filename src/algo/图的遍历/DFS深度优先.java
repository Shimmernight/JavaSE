package algo.图的遍历;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 从起始顶点开始，递归访问其所有邻近节点，
 * 比如A节点是其第一个邻近节点，而B节点又是A的一个邻近节点，则DFS访问A节点后再访问B节点，
 * 如果B节点有未访问的邻近节点的话将继续访问其邻近节点，否则继续访问A的未访问邻近节点，
 * 当所有从A节点出去的路径都访问完之后，继续递归访问除A以外未被访问的邻近节点。
 */
public class DFS深度优先 {
    private static int count;
    private static void dfs(HashMap<Character , LinkedList<Character>> graph, HashMap<Character, Boolean> visited)
    {
        visit(graph, visited, 'u');//为了和图中的顺序一样，我认为控制了DFS先访问u节点
        visit(graph,visited,'w');
    }
    private static void visit(HashMap<Character , LinkedList<Character>> graph,HashMap<Character, Boolean> visited,char start)
    {
        if(!visited.containsKey(start))
        {
            count++;
            System.out.println("The time into element "+start+":"+count);//记录进入该节点的时间
            visited.put(start, true);
            for (char c : graph.get(start))
            {
                if(!visited.containsKey(c))
                {
                    visit(graph,visited,c);//递归访问其邻近节点
                }
            }
            count++;
            System.out.println("The time out element "+start+":"+count);//记录离开该节点的时间
        }
    }
}
