# ui.py
import tkinter as tk
from tkinter.scrolledtext import ScrolledText
import datetime

class ChatUI:
    def __init__(self, cliente_socket):
        self.cliente = cliente_socket

        self.ventana = tk.Tk()
        self.ventana.title("Chat Cliente Python")

        self.area_mensajes = ScrolledText(self.ventana, state='normal', width=50, height=15)
        self.area_mensajes.pack(padx=10, pady=10)

        self.campo_texto = tk.Entry(self.ventana, width=40)
        self.campo_texto.pack(side=tk.LEFT, padx=(10, 0))
        self.campo_texto.bind("<Return>", self.enviar_mensaje)

        self.boton_enviar = tk.Button(self.ventana, text="Enviar", command=self.enviar_mensaje)
        self.boton_enviar.pack(side=tk.LEFT, padx=10)

    def enviar_mensaje(self, event=None):
        mensaje = self.campo_texto.get()
        hora = datetime.datetime.now().strftime("%H:%M")
        self.cliente.sendall(f"Python: {mensaje}\n".encode('utf-8'))
        self.campo_texto.delete(0, tk.END)

    def mostrar_mensaje(self, mensaje):
        self.area_mensajes.insert(tk.END, f"{mensaje}\n")

    def iniciar(self):
        self.ventana.mainloop()


