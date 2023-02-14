package Main;


import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {
     public static JList<String> jcomp1;
     public static JList test;
     public static JButton uploadStack;
     public static JButton stackPop;
     public static JButton stackPush;
     public static JButton isEmpty;
     public static  JButton clear;
     public static JLabel uploadStacklbl;
     public static JLabel stackPopPrint;
     public static JTextField getString;
     public static JLabel jcomp10;
     public static JLabel jcomp11;
     public static JButton stackPeek;
     public static JLabel stackPeeklbl;
     public static JButton stackPrint;
     public static JButton stackSize;
     public static JLabel stackSizelbl;


    public MyPanel() {
        jcomp1 = new JList<>();
        test = new JList();
        uploadStack = new JButton ("updateStack");
        stackPop = new JButton ("popStack");
        stackPush = new JButton ("pushStack");
        isEmpty = new JButton ("isEmpty?");
        clear = new JButton ("clearStack");
        uploadStacklbl = new JLabel ("");
        stackPopPrint = new JLabel ("");
        getString = new JTextField();
        jcomp10 = new JLabel ("");
        jcomp11 = new JLabel ("");
        stackPeek = new JButton("StackPeek");
        stackPeeklbl = new JLabel ("...");
        stackPrint = new JButton("Вывод стека");
        stackSize = new JButton("Размер стека");
        stackSizelbl = new JLabel();

        setPreferredSize (new Dimension (944, 563));
        setLayout (null);

        //компоненты
        add (jcomp1);
        add (test);
        add (uploadStack);
        add (stackPop);
        add (stackPush);
        add (isEmpty);
        add (clear);
        add (uploadStacklbl);
        add (stackPopPrint);
        add (getString);
        add (jcomp10);
        add (jcomp11);
        add (stackPeek);
        add (stackPeeklbl);
        add (stackPrint);
        add (stackSize);
        add (stackSizelbl);

        //components size
        test.setBounds(350,5,580,535);
        jcomp1.setBounds (350, 5, 580, 535);
        uploadStack.setBounds (10, 20, 120, 25);
        stackPop.setBounds (10, 60, 120, 25);
        stackPush.setBounds (10, 100, 120, 25);
        isEmpty.setBounds (10, 140, 120, 25);
        clear.setBounds (10, 180, 120, 25);
        uploadStacklbl.setBounds (150, 20, 100, 25);
        stackPopPrint.setBounds (150, 60, 100, 25);
        getString.setBounds (150, 100, 100, 25);
        jcomp10.setBounds (150, 140, 100, 25);
        jcomp11.setBounds (150, 180, 100, 25);
        stackPeek.setBounds(10,215,120,25);
        stackPeeklbl.setBounds(150,215, 100,25);
        stackPrint.setBounds(10, 250, 120, 25);
        stackSize.setBounds(10,285,120,25);
        stackSizelbl.setBounds(150,285,100,25);
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame ("Курсовая работа");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);

        uploadStack.addActionListener(e -> bFunction.uploadFromFile());
        isEmpty.addActionListener(e -> bFunction.empty());
        stackPeek.addActionListener(e -> bFunction.peek());
        clear.addActionListener(e -> bFunction.clear());
        stackPrint.addActionListener(e -> bFunction.print());
        stackPush.addActionListener(e -> bFunction.push());
        stackPop.addActionListener(e -> bFunction.pop());
        stackSize.addActionListener(e -> bFunction.size());

    }
}