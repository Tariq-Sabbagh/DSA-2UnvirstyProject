package Algorithm;
import GUITrees.FrameGUI;
import GUITrees.BinaryTreePanel;
import GUITrees.TreeGUI;;

public class BinaryTreeNode {
    public char key;
    public BinaryTreeNode left,right;

    BinaryTreeNode(char x)
    {
        key = x;
        left = null;
        right = null;
    }
}
