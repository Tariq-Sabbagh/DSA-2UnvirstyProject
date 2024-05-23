import java.util.ArrayList;
import java.util.List;

 class Node {

    char key;
    List<Node> children;

    Node(char x)
    {
        key = x;
        children = new ArrayList<Node>();
    }
}