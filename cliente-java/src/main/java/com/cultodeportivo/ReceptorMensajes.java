package com.cultodeportivo;

import java.io.BufferedReader;
import java.io.IOException;

public class ReceptorMensajes implements Runnable {
    private final BufferedReader entrada;
    private final VentanaChat ventana;

    public ReceptorMensajes(BufferedReader entrada, VentanaChat ventana) {
        this.entrada = entrada;
        this.ventana = ventana;
    }

    @Override
    public void run() {
        String mensaje;
        try {
            while ((mensaje = entrada.readLine()) != null) {
                ventana.mostrarMensaje(mensaje);
            }
        } catch (IOException e) {
            ventana.mostrarMensaje("❌ Desconectado del servidor");
        }
    }
}
