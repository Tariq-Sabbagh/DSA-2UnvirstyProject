package First_Question.screens.first_Question;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import First_Question.algorithm.*;
import First_Question.screens.BinaryTreeDrawer;

    public class StringInputFrame extends JFrame {
    BinaryTree BT;
    private JFrame frame;
    private JTextField inputField;
    private BinaryTree tree;
    private JButton addButton;

    public StringInputFrame() {
        tree = new BinaryTree();

        // إعداد الإطار
        frame = new JFrame("إدخال الشجرة الثنائية");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new BorderLayout());

        // اللوحة للإدخال والأزرار
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));
        panel.setLayout(new GridLayout(4, 1, 10, 10));
        panel.setBackground(new Color(245, 245, 245));

        // عنوان التطبيق
        JLabel titleLabel = new JLabel("أدخل العقد في الشجرة الثنائية");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel);

        // حقل الإدخال للنص
        JLabel label = new JLabel("أدخل النص:");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 16));
        inputField.setBorder(BorderFactory.createCompoundBorder(
                inputField.getBorder(),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        panel.add(inputField);

        // زر لإضافة العقدة
        addButton = new JButton("إضافة");
        addButton.setFont(new Font("Arial", Font.BOLD, 16));
        addButton.setBackground(new Color(50, 205, 50));
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        addButton.addActionListener(new AddButtonListener());
        panel.add(addButton);

        // إضافة المكونات إلى الإطار
        frame.add(panel, BorderLayout.CENTER);

        // جعل الإطار مرئيًا
        frame.setVisible(true);
    }

    private class AddButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = inputField.getText();

            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "يرجى إدخال نص.");
            } else {
                System.out.println("ok");
//                BT=new BinaryTree(input);
//                new BinaryTreeDrawer(BT.getRoot());
//                frame.setLayout();
//                tree.insert(input);
//                new BinaryTreeDisplay(tree.getRoot());
            }
        }
    }
}