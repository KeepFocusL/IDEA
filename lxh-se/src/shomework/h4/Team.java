package shomework.h4;

import java.util.Scanner;

public class Team {
    String getName() {
        System.out.println("请输入你的名字");
        Scanner name = new Scanner(System.in);
        String userName = name.nextLine();
        return userName;
    }

    String getProject() {
        System.out.println("请输入你的技术类型");
        Scanner project = new Scanner(System.in);
        String userProject = project.nextLine();
        return userProject;
    }

    String getProgramProject(String userInput) {
        if (userInput.equals("C#")) {
            return "欢迎来到C#程序开发部门";
        } else if (userInput.equals("asp.net")) {
            return "欢迎来到asp.net程序测试部门";
        } else if (userInput.equals("Java")) {
            return "欢迎来到Java程序开发部门";
        } else if (userInput.equals("前端程序开发")) {
            return "欢迎来到前端程序开发部门";
        } else {
            return "抱歉我们没有这个部门";
        }
    }

    public static void main(String[] args) {
        Team team = new Team();
        String name = team.getName();
        String project = team.getProject();
        String programProject = team.getProgramProject(project);
        System.out.println("你的名字:" + name);
        System.out.println("你的技术类型:" + project);
        System.out.println("你的部门:" + programProject);
    }
}

