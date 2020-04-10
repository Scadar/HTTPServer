package ru.scadarnull.http.io.impl;

import java.util.Arrays;

public class ByteArray {
    private byte[] array = new byte[1024];
    private int size;
    public void add(byte value) {
        if(size == array.length) {
            byte[] temp = array;
            array = new byte[array.length*2];
            System.arraycopy(temp, 0, array, 0, size);
        }
        array[size++] = value;
    }
    public byte[] toArray(){
        return Arrays.copyOf(array, size);
    }
    public boolean isEmptyLine(){
        if(size >= 4) {
            return array[size - 1] == '\n' && array[size - 2] == '\r'
                    && array[size - 3] == '\n' && array[size - 4] == '\r';
        } else {
            return false;
        }
    }
}
