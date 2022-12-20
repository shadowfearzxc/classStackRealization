package Main;


import Stack.Stack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static Main.MyPanel.*;

public class bFunction {
        static Stack sta = new Stack();


    public static void uploadFromFile() {
        String[] data = new String[20];
        int i = 0;
        try {
            File file = new File("strings.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null) {

                sta.push(line);
                data[i++] = line;
                line = br.readLine();
            }
            test.setListData(data);
            test.setVisible(true);
            uploadStacklbl.setText("Загружен");


        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void empty() {
        if(sta.isEmpty()) {jcomp10.setText("true");}
        else jcomp10.setText("false");
    }

    public static void peek() { stackPeeklbl.setText(sta.peek());}
    public static void clear() {
        if(sta.clear()) {jcomp11.setText("Очищен"); test.setVisible(false);}
        else jcomp11.setText("Он и так пустой");
    }

    public static void print() { sta.print(); }
    public static void push() { sta.push(getString.getText());System.out.println("Добавлен : " + getString.getText());}
    public static void pop() { sta.pop();}
    public static void size() { sta.size();}
}
