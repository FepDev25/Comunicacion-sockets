# receptor.py
def recibir_mensajes(sock, ui):
    while True:
        try:
            data = sock.recv(1024).decode('utf-8')
            if not data:
                break
            ui.mostrar_mensaje(data)
        except:
            ui.mostrar_mensaje("❌ Desconectado del servidor")
            break
