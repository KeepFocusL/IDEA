package SHomeWork.h1;

import javax.swing.*;

public class RectanglesC {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("请输入边长a");
        String b = JOptionPane.showInputDialog("请输入边长b");
        double numbera = Double.parseDouble(a);
        double numberb = Double.parseDouble(b);
        double C = 2 * (numbera + numberb);
        JOptionPane.showMessageDialog(null,"长方形的周长为" + C);
    }
}


