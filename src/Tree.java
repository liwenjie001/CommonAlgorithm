import java.util.*;

/**
 * @ Author: Mr.Li
 * @ Date: 2019-08-17 12:07
 * @ Description: 关于深度优先和广度优先的算法；
 **/
    public class Tree {
        /**
         * 深度优先算法
         */
        public void depthFirst(){
            Stack<Map<String,Object>> nodeStack = new Stack<Map<String,Object>>();
            Map<String,Object> node = new HashMap<String, Object>();
            nodeStack.add(node);
            while (!nodeStack.isEmpty()){
                node = nodeStack.pop();
                // 获得节点的子节点。对于二叉树来说就是获取左节点和右节点；
                List<Map<String,Object>> children = new ArrayList<>();

            }
        }
}
