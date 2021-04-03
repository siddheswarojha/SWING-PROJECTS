package com.sid.SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel PanelMain;
    private JEditorPane et1;
    private JEditorPane et2;
    private JButton btn_Add;
    private JButton btn_sub;
    private JButton btn_div;
    private JButton btn_mul;

    public Calculator() {
        btn_Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(et1!=null && et2 != null) {

                    int x = Integer.parseInt(et1.getText());
                    int y = Integer.parseInt(et2.getText());

                    int res = x + y;

                    JOptionPane.showMessageDialog(null, res);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"values are null");
                }


            }
        });
        btn_sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(et1!=null && et2 != null) {
                    int x = Integer.parseInt(et1.getText());
                    int y = Integer.parseInt(et2.getText());

                    int res = x - y;
                    JOptionPane.showMessageDialog(null, res);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"values are null");
                }



            }
        });
        btn_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(et1!=null && et2 != null) {
                    int x = Integer.parseInt(et1.getText());
                    int y = Integer.parseInt(et2.getText());

                    int res = x / y;
                    JOptionPane.showMessageDialog(null, res);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"values are null");
                }



            }
        });
        btn_mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(et1!=null && et2 != null) {
                    int x = Integer.parseInt(et1.getText());
                    int y = Integer.parseInt(et2.getText());

                    int res = x * y;
                    JOptionPane.showMessageDialog(null, res);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"values are null");
                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("Calulator");
        jf.setContentPane(new Calculator().PanelMain);




        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.pack();
        jf.setVisible(true);
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
