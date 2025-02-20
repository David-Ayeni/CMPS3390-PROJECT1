import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class startView {
    private JPanel startPanel;
    private JTextField inputHabit;
    private JButton addButton;
    private JTable table1;

    public startView() {
        createTable();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String habit = inputHabit.getText();

                if (!habit.isEmpty()){
                    String date = getCurrentDate();

                    DefaultTableModel model = (DefaultTableModel) table1.getModel();
                    model.addRow(new Object[]{habit,date});

                    inputHabit.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(startPanel, "Please enter a habit");
                }
            }
        });
    }

    public JPanel getStartPanel() {
        return startPanel;
    }

    private void createTable() {
        table1.setModel(new DefaultTableModel(
                null, new String[]{"Habit","Date"}));
    }

    private String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }





}
