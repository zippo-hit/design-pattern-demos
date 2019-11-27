package com.zippo.design.patten.demo.decorator.io;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncryptedBufferedOutputStream extends BufferedOutputStream{

	public EncryptedBufferedOutputStream(OutputStream out) {
		super(out);
	}

	public synchronized void write(int b) throws IOException {
        if (count >= buf.length) {
            flushBuffer();
        }
        buf[count++] = (byte)(b+1);
    }
	
	private void flushBuffer() throws IOException {
        if (count > 0) {
            out.write(buf, 0, count);
            count = 0;
        }
    }
	
	public synchronized void write(byte b[], int off, int len) throws IOException {
        if (len >= buf.length) {
            /* If the request length exceeds the size of the output buffer,
               flush the output buffer and then write the data directly.
               In this way buffered streams will cascade harmlessly. */
            flushBuffer();
            out.write(b, off, len);
            return;
        }
        if (len > buf.length - count) {
            flushBuffer();
        }
        System.arraycopy(b, off, buf, count, len);
        count += len;
    }
}
