package com.longfish.commtest.waittingroom;

import java.io.IOException;
import java.net.Socket;

public class ClientHandler{
    private final Socket clientSocket;

    public ClientHandler(Socket socket) throws IOException {
        this.clientSocket = socket;
    }


    public int getClientPort() {
        return clientSocket.getPort();
    }
}
