package com.zippo.design.patten.demo.decorator.io;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class TestOutputStream extends ByteArrayOutputStream{

	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	public synchronized void write(int b) {
        ensureCapacity(count + 1);
        buf[count] = (byte) (b + 1);
        count += 1;
    }
	
	private void ensureCapacity(int minCapacity) {
        // overflow-conscious code
        if (minCapacity - buf.length > 0)
            grow(minCapacity);
    }
	
	private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = buf.length;
        int newCapacity = oldCapacity << 1;
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        buf = Arrays.copyOf(buf, newCapacity);
    }
	
	private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE) ?
            Integer.MAX_VALUE :
            MAX_ARRAY_SIZE;
    }
}
