package shomework.h1;

import javax.swing.*;

public class TriangleS {
    public static void main(String[] args) {
        String bottom = JOptionPane.showInputDialog("请输入底");
        String high = JOptionPane.showInputDialog("请输入高");
        double numberbottom = Double.parseDouble(bottom);
        double numberhigh = Double.parseDouble(high);
        double s = numberbottom * numberhigh / 2;
        JOptionPane.showMessageDialog(null, "三角形面积为=" + s);
    }
}