package traffic;

import javax.swing.*;
import java.awt.*;

public class Traffic extends JFrame implements Runnable {
    JPanel red, yellow, green;
    JLabel time, show_time;

    public static void main(String args[]) {
        Traffic traffic=new Traffic();
      Thread thread=new Thread(traffic);
      thread.start();
    }

    @Override
    public void run() {
        while (true) {
            red.setBackground(Color.red);
            yellow.setBackground(Color.black);
            green.setBackground(Color.black);
            for (int s = 5; s > 0; s--) {
                try {
                    String i = Integer.toString(s);
                    show_time.setText(i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("" + ex);
                }}


                red.setBackground(Color.black);
                yellow.setBackground(Color.yellow);
                green.setBackground(Color.black);
                for (int q = 7; q > 0; q--) {
                    try {
                        String i = Integer.toString(q);
                        show_time.setText(i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("" + ex);
                    }}

                    red.setBackground(Color.black);
                    yellow.setBackground(Color.black);
                    green.setBackground(Color.GREEN);
                    for (int m = 3; m > 0; m--) {
                        try {
                            String i = Integer.toString(m);
                            show_time.setText(i);
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            System.out.println("" + ex);
                        }


                    }

            }
        }
        public Traffic(){
        this.getContentPane().setBackground(Color.BLACK);
        this.setSize(200,400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);


        red=new JPanel();
        red.setBackground(Color.red);

        yellow=new JPanel();
        yellow.setBackground(Color.yellow);

        green=new JPanel();
        green.setBackground(Color.green);

        setLayout(null);
        red.setBounds(50,30,50,40);
        add(red);

        yellow.setBounds(50,80,50,40);
        add(yellow);

        green.setBounds(50,100,50,40);
        add(green);

        time=new JLabel("Count Down!");
        time.setForeground(Color.white);
        time.setBounds(20,160,100,40);
        add(time);

        show_time=new JLabel();
        show_time.setBounds(55,178,80,40);
        show_time.setForeground(Color.ORANGE);
        add(show_time);
        }
    }

