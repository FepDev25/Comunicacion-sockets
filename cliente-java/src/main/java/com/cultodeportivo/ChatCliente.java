package com.cultodeportivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatCliente {

    @SuppressWarnings("resource")
    public void iniciarChat() {
        try {
            Socket socket = new Socket("localhost", 12345);
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            VentanaChat ventana = new VentanaChat(salida);
            new Thread(new ReceptorMensajes(entrada, ventana)).start();

        } catch (IOException e) {
            System.out.println("❌ No se pudo conectar al servidor");
        } 
    }
}
