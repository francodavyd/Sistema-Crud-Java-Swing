package com.francodavyd.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JTextField;

public class Reloj implements Runnable {

    private final JTextField field;

    public Reloj(JTextField field) {
        this.field = field;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Calendar calendar = Calendar.getInstance();

                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
                String tiempo = dateFormat.format(calendar.getTime());

                this.field.setText(tiempo);
                Thread.sleep(1000);

            } catch (InterruptedException ex) {
                System.out.println("error en el hilo");
            }
        }

    }
}
