package view;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetAndTreeSet {
    private TreeSet<Node> mainCalc = new TreeSet<Node>();
    private HashSet<Node> allCalc = new HashSet<Node>();


    //Methods
    public boolean containsCalc(Node node) {
        if (mainCalc.contains(node))
            return true;
        for (Node pNode : allCalc) {
            if (pNode.equals(node))
                return true;
        }
        return false;
    }

    public Double search(Node node) {
        for (Node pNode : mainCalc)
            if (pNode.equals(node)) {
                //Deleted
                mainCalc.remove(pNode);
                //+1
                pNode.addFrequency();
                //Added
                mainCalc.add(pNode);
                return pNode.getRez();
            }
        for (Node pNode : allCalc)
            if (pNode.equals(node)) {
                //Deleted
                allCalc.remove(node);
                //+1
                pNode.addFrequency();
                //Added
                allCalc.add(pNode);
                Swap(mainCalc.last(), pNode);
               return pNode.countUp();
            }
        return null;
    }

    public void add(Node node) {
        if (mainCalc.size() < 10)
            mainCalc.add(node);
        else
            allCalc.add(node);
    }

    private void Swap(Node node1, Node node2) {
        int minFrequency = node1.getFrequency();
        int frequency = node2.getFrequency();
        if (frequency > minFrequency) {
            mainCalc.remove(node1);
            mainCalc.add(node2);
            allCalc.remove(node2);
            allCalc.add(node1);
        }
    }
}
