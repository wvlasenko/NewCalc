package app;

import javax.swing.*;
import java.awt.*;

public class PField extends JPanel {
    private static final long serialVersionUID =1l;
    JTextField txta=null;
    long data;
    JLabel lbAErr=null;
    public PField (String title){
        setLayout(new FlowLayout());
        JLabel lbA = new JLabel(title);
        add(lbA);
        txta - new JTextField(10);
        add(txta);
        lbAErr = new JLabel("Не число");
        lbAErr.setForeground(Color.red);
        lbAErr.setVisible(false);
        txta.addActionListener(new actList());
        txta.addFocusListener(new custListener());
        add(txta);

    }
public long getData(){
        getNumber();
        return  data;
}
public  void setData(long value){
        data=value;
        txta.setText(""+ data);
}
private void getNumber(){
        try {
            data=Long.valueOf(txta.getText());

        }
        catch (NumberFormatException ef){
            lbAErr.setVisible(true);
        }
}
}
