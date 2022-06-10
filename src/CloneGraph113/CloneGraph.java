package CloneGraph113;

import ClassImplementations.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CloneGraph {
    public static Node cloneGraph(Node node){
        if(node == null){
            return null;
        }

        HashMap<Node, Node> clonedNodes = new HashMap();
        LinkedList<Node> toBeVisited = new LinkedList();

        toBeVisited.add(node);
        clonedNodes.put(node, new Node(node.val, new ArrayList()));

        while(!toBeVisited.isEmpty()){
            Node currNode = toBeVisited.removeFirst();

            for(Node neighbor: currNode.neighbors){
                if(!clonedNodes.containsKey(neighbor)){
                    toBeVisited.add(neighbor);
                    clonedNodes.put(neighbor, new Node(neighbor.val, new ArrayList()));
                }

                clonedNodes.get(currNode).neighbors.add(clonedNodes.get(neighbor));
            }

        }

        return clonedNodes.get(node);
    }
}
