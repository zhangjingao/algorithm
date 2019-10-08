package 随笔.面试.笔试.转转58;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/16 20:40
 **/
import org.omg.PortableInterceptor.INACTIVE;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main1 {


    static int max = 0;
    static int maxCeng = 1;

    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    private Node createBinaryTreeByArray(Integer[] array,int index)
    {
        Node tn = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new Node(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }

    public int levelOrder(Node root){
        //请您完成此方法
        List<Node> bfsNode = new ArrayList<>();
        bfsNode.add(root);
        bfs(bfsNode, 1);
        return maxCeng;
    }

    private void bfs(List<Node> bfsNode, int index) {
        List<Node> bfsNewNodes = new LinkedList<>();
        if (bfsNode.isEmpty()) {
            return;
        }
        int maxTemp = 0;
        for (Node node : bfsNode) {
            maxTemp += node.val;
            if (node.left != null) {
                bfsNewNodes.add(node.left);
            }
            if (node.right != null) {
                bfsNewNodes.add(node.right);
            }
        }
        maxTemp = maxTemp / bfsNode.size();
        if (maxTemp > max) {
            max = maxTemp;
            maxCeng = index;
        } else if (maxTemp == max && maxCeng <= index) {
            maxCeng = index;
        }
        bfs(bfsNewNodes, ++index);
    }


    public  Node createTree(int[] array){
        List<Node> nodeList=new LinkedList<Node>();

        for(int nodeIndex=0;nodeIndex<array.length;nodeIndex++){
            nodeList.add(new Node(array[nodeIndex]));
        }
        for(int parentIndex=0;parentIndex<=array.length/2-1;parentIndex++){
            nodeList.get(parentIndex).left =nodeList.get(parentIndex*2+1);
            //防止是非完全二叉树
            if((parentIndex*2+2)<array.length) {
                nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
            }
        }
        return nodeList.get(0);
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int [] array = new int [n];
        Integer [] array = new Integer[n];
        for(int i = 0;i < n;i++){
            String value =scanner.next();
            if(value.equals( "null" )){
                array[i]=null;
            }else{
                array[i] = Integer.valueOf( value );
            }

        }
        Main1 solution = new Main1();
        Node root =solution.createBinaryTreeByArray(array,0);
        int level = solution.levelOrder( root );
        System.out.println(level);

    }
}
