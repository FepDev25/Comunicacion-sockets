# Comunicación con Sockets (Java - Python)

Este proyecto consiste en una aplicación de chat desarrollada con el objetivo de demostrar la comunicación entre procesos utilizando sockets TCP.

La aplicación está compuesta por:
- Un **servidor** desarrollado en Java, capaz de gestionar múltiples conexiones concurrentes de clientes.
- Un **cliente en Java** con interfaz gráfica construida con Swing.
- Un **cliente en Python** con interfaz gráfica desarrollada en Tkinter.

Todos los componentes se comunican a través del protocolo TCP, permitiendo el envío y recepción de mensajes en tiempo real. Uno de los aspectos más importantes de este proyecto es que los clientes, a pesar de estar escritos en diferentes lenguajes de programación, pueden interactuar sin problemas gracias al uso de sockets, lo cual evidencia la interoperabilidad que ofrece este mecanismo de comunicación.