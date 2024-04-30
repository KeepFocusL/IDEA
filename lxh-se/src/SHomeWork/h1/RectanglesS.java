package SHomeWork.h1;

import javax.swing.*;

public class RectanglesS {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("请输入长");
        String b = JOptionPane.showInputDialog("请输入宽");
        double numbera = Double.parseDouble(a);
        double numberb = Double.parseDouble(b);
        double C = numbera * numberb;
        JOptionPane.showMessageDialog(null,"长方形的面积为" + C);
    }
}