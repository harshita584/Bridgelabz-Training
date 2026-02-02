package com.songvault;

public class Media<T> {
    private T type;
    
    public Media(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}
