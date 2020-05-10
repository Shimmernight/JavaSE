package algo.图的遍历;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 主要思想：从起始点开始，将其邻近的所有顶点都加到一个队列（FIFO）中去，
 * 然后标记下这些顶点离起始顶点的距离为1.最后将起始顶点标记为已访问，今后就不会再访问。
 * 然后再从队列中取出最先进队的顶点A，也取出其周边邻近节点，加入队列末尾，
 * 将这些顶点的距离相对A再加1，最后离开这个顶点A。依次下去，直到队列为空为止。
 *
 * BFS的时间复杂度是Θ（V+E），其中V是顶点个数，E是边数，也就是所有邻接表中的元素个数
 */
public class BFS广度优先 {
    private static void bfs(HashMap<Character, LinkedList<Character>> graph, HashMap<Character, Integer> dist, char start)
    {
        Queue<Character> q=new LinkedList<>();
        q.add(start);//将s作为起始顶点加入队列
        dist.put(start, 0);
        int i=0;
        while(!q.isEmpty())
        {
            char top=q.poll();//取出队首元素
            i++;
            System.out.println("The "+i+"th element:"+top+" Distance from s is:"+dist.get(top));
            int d=dist.get(top)+1;//得出其周边还未被访问的节点的距离
            for (Character c : graph.get(top)) {
                if(!dist.containsKey(c))//如果dist中还没有该元素说明还没有被访问
                {
                    dist.put(c, d);
                    q.add(c);
                }
            }
        }
    }
}
