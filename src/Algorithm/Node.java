package Algorithm;

import java.util.ArrayList;
import java.util.List;
import GUITrees.FrameGUI;
import GUITrees.BinaryTreePanel;
import GUITrees.TreeGUI;

public class Node {

    public char key;
    public List<Node> children;

    Node(char x)
    {
        key = x;
        children = new ArrayList<Node>();
    }
}