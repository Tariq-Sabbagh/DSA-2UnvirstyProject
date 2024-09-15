package First_Question;

import First_Question.algorithm.*;
import First_Question.screens.first_Question.StringInputFrame;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            //SwingUtilities.invokeLater(() -> new StringInputFrame().setVisible(true));
           // new StringInputFrame();
            String input = "(A[20,10] | (B[20,10]|C[30,10])) - (D[30,50] | (E[40,30] - F[40,20]))";
            BinaryTree bt1 = new BinaryTree(input);
            System.out.println(bt1.getRoot());

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}