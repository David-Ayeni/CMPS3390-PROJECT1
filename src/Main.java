import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        startView app = new startView();
        JPanel start = app.getStartPanel();
        start.setSize(500, 500);
        JFrame frame = new JFrame();
        //frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(start);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}