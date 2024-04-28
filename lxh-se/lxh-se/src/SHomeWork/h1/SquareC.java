package SHomeWork.h1;

import javax.swing.*;

public class SquareC {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("请输入边长");
        double numbera = Double.parseDouble(a);
        double L = numbera * 4;
        JOptionPane.showMessageDialog(null,"正方形的周长为" + L);
    }
}
