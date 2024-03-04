package com.longfish.commtest.waittingroom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    private final int port;
    private final Object data;
    private final List<ClientHandler> clients = new ArrayList<>();


    public Server(int port, Object data) {
        this.port = port;
        this.data = data;
    }

    public Bean start() throws IOException, ClassCastException, ClassNotFoundException {


        ServerSocket serverSocket = new ServerSocket(port);


        Socket clientSocket = serverSocket.accept();

        ClientHandler clientHandler = new ClientHandler(clientSocket);
        clients.add(clientHandler);

        InputStream is = clientSocket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        Object message = ois.readObject();

        OutputStream os = clientSocket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(data);

        ois.close();
        oos.close();
        serverSocket.close();
        clientSocket.close();

        return new Bean(clients.get(0).getClientPort(), message);


    }


}
