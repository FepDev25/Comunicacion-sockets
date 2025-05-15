import socket
import threading
from ui import ChatUI
from receptor import recibir_mensajes

def main():
    cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    cliente.connect(("localhost", 12345))

    chat_ui = ChatUI(cliente)
    
    hilo_receptor = threading.Thread(
        target=recibir_mensajes, 
        args=(cliente, chat_ui),
        daemon=True
    )
    hilo_receptor.start()

    chat_ui.iniciar()

if __name__ == "__main__":
    main()


