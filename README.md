# Comunicación con Sockets (Java - Python - Web)

Este proyecto consiste en una aplicación de chat multiplataforma diseñada para demostrar la comunicación entre procesos utilizando sockets TCP.

## Componentes

-  **Servidor TCP en Java** — gestiona múltiples conexiones concurrentes mediante hilos.
- **Cliente en Java (Swing)** — interfaz gráfica de escritorio.
- **Cliente en Python (Tkinter)** — interfaz gráfica alternativa en otro lenguaje.
- **Cliente Web (HTML, CSS, JS)** — ejecutable desde navegador mediante WebSocket.
- **Puente TCP ↔ WebSocket (Node.js)** — permite que el cliente web se comunique con el servidor TCP.

## Características

- Comunicación en tiempo real entre clientes heterogéneos.
- Interfaz gráfica en los tres clientes (Java, Python y Web).
- Modularización del código para facilitar mantenibilidad y escalabilidad.
- Arquitectura extensible para futuras mejoras (ej. autenticación, logs, despliegue).

## Ejecución

1. Iniciar el servidor Java.
2. Ejecutar uno o más clientes (Java, Python o Web).
3. Iniciar el puente WebSocket si se usará el cliente web (`node bridge.js`).
4. Abrir `index.html` en el navegador.