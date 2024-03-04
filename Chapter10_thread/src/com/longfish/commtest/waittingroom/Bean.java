package com.longfish.commtest.waittingroom;

public class Bean {
    private int port;
    private Object data;

    public Bean() {
    }

    public Bean(int port, Object data) {
        this.port = port;
        this.data = data;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
