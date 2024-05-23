import java.util.*;



public class Main {
    public static void main(String[] args) {
        GeneralTree GT=new GeneralTree();
        BinaryTree BT=new BinaryTree();
        GT.CreateTree();
        String treeString = GT.TreeToString(GT.root);
        GT.Import(treeString);
        System.out.println("Level order traversal ");
        GT.printGeneralTree(GT.root ,0);
        GT.Export(GT.ConvertFileToList());



        BinaryTreeNode binaryTreeRoot = BT.ConvertGeneralToBinary(GT.root);
        BT.printBinaryTree(binaryTreeRoot, "");

           Node generalTreeRoot = BT.ConvertBinaryToGeneral(binaryTreeRoot);
          GT.printGeneralTree(generalTreeRoot, 0);


    }
}
