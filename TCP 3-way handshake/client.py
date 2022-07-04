import socket

host = 'local host'
port = 5000
DISCONNECT_MESSAGE = "!DISCONNECT"

s = socket.socket(socket.AF_INET,
				socket.SOCK_STREAM)

s.connect(('127.0.0.1', port))

msg = s.recv(1024)

while msg:
	print('Received:' + msg.decode())
	msg = s.recv(1024)

# disconnect the client
s.close()
