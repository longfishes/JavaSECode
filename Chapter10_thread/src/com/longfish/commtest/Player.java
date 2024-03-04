package com.longfish.commtest;

import java.io.IOException;

public class Player {

    public final Receiver receiver;
    public final Sender sender;

    public Player(int self, int oppo) throws IOException {
        receiver = new Receiver(self);
        sender = new Sender(oppo);
    }
}
