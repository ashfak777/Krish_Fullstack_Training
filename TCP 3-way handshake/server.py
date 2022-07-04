import socket

host = 'local host'
port = 5000

s = socket.socket(socket.AF_INET,
				socket.SOCK_STREAM)

s.bind(('', port))

s.listen(1)

c, addr = s.accept()

print("CONNECTION FROM:", str(addr))

msg = "Hello Client"
c.send(msg.encode())

c.close()
