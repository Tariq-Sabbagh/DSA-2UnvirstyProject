package First_Question.screens;

import First_Question.algorithm.*;

import javax.swing.*;
import java.awt.*;

public class BinaryTreeDrawer extends JFrame {

        private Node tree;

        public BinaryTreeDrawer(Node tree) {
            this.tree = tree;
            setTitle("عرض الشجرة الثنائية");
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            add(new TreePanel(tree));
            setVisible(true);
        }

        class TreePanel extends JPanel {
            private Node tree;

            public TreePanel(Node tree) {
                this.tree = tree;
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (tree.getRoot() != null) {
                    drawTree(g, tree.getRoot(), getWidth() / 2, 30, getWidth() / 4);
                }
            }

            private void drawTree(Graphics g, Node node, int x, int y, int horizontalSpacing) {
                if (node != null) {
                    g.drawRect(x - 30, y - 15, 60, 30);
                    g.drawString(node.getName() + " (" + node.getHigh() + ", " + node.getWidth() + ")", x - 25, y + 5);

                    if (node.getLeft() != null) {
                        g.drawLine(x, y + 15, x - horizontalSpacing, y + 50);
                        drawTree(g, node.getLeft(), x - horizontalSpacing, y + 50, horizontalSpacing / 2);
                    }

                    if (node.getRight() != null) {
                        g.drawLine(x, y + 15, x + horizontalSpacing, y + 50);
                        drawTree(g, node.getRight(), x + horizontalSpacing, y + 50, horizontalSpacing / 2);
                    }
                }
            }
        }
}
