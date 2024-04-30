package SHomeWork.h1;

import javax.swing.*;

public class SquareS {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("请输入边长");
        double numbera = Double.parseDouble(a);
        double S = numbera * numbera;
        JOptionPane.showMessageDialog(null,"正方形的面积为" + S);
    }
}
