package new3;

//package com.cal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;

class MyException extends Exception{
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}

class SwingConsole{
    public static void run(final JFrame f,final int width,final int height){  //绘制图层准备
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                f.setTitle(f.getClass().getSimpleName());
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(width,height);
                f.setVisible(true);
            }
        });
    }
}

public class Calculator extends JFrame{

    private JTextField textField;				//文本框
    private String input;						//结果
    private String operator;					//操作符

    public Calculator() {
        input = "";
        operator = "";

        Container container = this.getContentPane();
        JPanel panel = new JPanel();
        textField = new JTextField(30);
        textField.setEditable(false);						//文本框禁止编辑
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setPreferredSize(new Dimension(200,30));
        container.add(textField, BorderLayout.NORTH);

        String[] name= {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};

        panel.setLayout(new GridLayout(4,4,1,1));

        for(int i=0;i<name.length;i++) {  //对应相应按钮
            JButton button = new JButton(name[i]);
            button.addActionListener(new MyActionListener());
            panel.add(button);
        }
        container.add(panel,BorderLayout.CENTER);
    }

    class MyActionListener implements ActionListener{			//实现按钮响应

        @Override
        public void actionPerformed(ActionEvent e) {
            int cnt=0;
            String actionCommand = e.getActionCommand();			//获取按钮上的字符串
            if(actionCommand.equals("+") || actionCommand.equals("-") || actionCommand.equals("*")
                    || actionCommand.equals("/")) {
                input += " " + actionCommand + " ";
            }
            else if(actionCommand.equals("C")) {
                input = "";
            }
            else if(actionCommand.equals("=")) {
                try {
                    input+= "="+calculate(input);
                } catch (MyException e1) {
                    if(e1.getMessage().equals("Infinity"))//错误判断并输出
                        input+= "=" + e1.getMessage();
                    else
                        input = e1.getMessage();
                }
                textField.setText(input);
                input="";
                cnt = 1;
            }
            else
                input += actionCommand;

            if(cnt == 0)
                textField.setText(input);
        }
    }

    private String calculate(String input) throws MyException{//计算函数
        String[] comput = input.split(" ");       //分割字符串
        Stack<Double> stack = new Stack<>();         //创建空栈
        Double m = Double.parseDouble(comput[0]);
        stack.push(m);

        for(int i = 1; i < comput.length; i++) {//
            if(i%2==1) {
                if(comput[i].equals("+"))//将前一个数出栈做乘法再入栈
                    stack.push(Double.parseDouble(comput[i+1]));
                if(comput[i].equals("-"))
                    stack.push(-Double.parseDouble(comput[i+1]));
                if(comput[i].equals("*")) {
                    Double d = stack.peek();
                    stack.pop();
                    stack.push(d*Double.parseDouble(comput[i+1]));
                }
                if(comput[i].equals("/")) {
                    double help = Double.parseDouble(comput[i+1]);
                    if(help == 0)
                        throw new MyException("Infinity");//出现错误显示并停止函数
                    double d = stack.peek();
                    stack.pop();
                    stack.push(d/help);
                }
            }
        }

        double d = 0;

        while(!stack.isEmpty()) {			//若第二项为空，输出原数字
            d += stack.peek();
            stack.pop();
        }

        String result = String.valueOf(d);
        return result;
    }

    public static void main(String[] args) {
        SwingConsole.run(new Calculator(), 250, 300);
    }
}