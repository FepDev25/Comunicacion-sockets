package com.cultodeportivo;

import java.awt.BorderLayout;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaChat extends JFrame {
    private final JTextArea areaMensajes;
    private final JTextField campoTexto;

    public VentanaChat(PrintWriter salida) {
        super("Chat Cliente Java");

        areaMensajes = new JTextArea();
        areaMensajes.setEditable(false);
        campoTexto = new JTextField();

        setLayout(new BorderLayout());
        add(new JScrollPane(areaMensajes), BorderLayout.CENTER);
        add(campoTexto, BorderLayout.SOUTH);

        campoTexto.addActionListener(e -> {
            String texto = campoTexto.getText();
            salida.println("Java: " + texto);
            campoTexto.setText("");
        });

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mostrarMensaje(String mensaje) {
        areaMensajes.append(mensaje + "\n");
    }
}
