const ws = new WebSocket('ws://localhost:8080');
const chat = document.getElementById('chat');
const input = document.getElementById('msg');
const btn = document.getElementById('btnEnviar');

ws.onopen = () => {
  appendMessage("Conectado al chat");
};

ws.onmessage = (event) => {
  appendMessage(event.data);
};

btn.addEventListener("click", enviar);
input.addEventListener("keydown", function (e) {
  if (e.key === "Enter") enviar();
});

function enviar() {
  const mensaje = input.value.trim();
  if (mensaje === "") return;
  ws.send(mensaje);
  appendMessage(`Tú: ${mensaje}`);
  input.value = "";
}

function appendMessage(texto) {
  chat.value += texto + "\n";
  chat.scrollTop = chat.scrollHeight;
}
