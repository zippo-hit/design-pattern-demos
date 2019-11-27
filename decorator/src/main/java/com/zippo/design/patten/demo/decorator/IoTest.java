package com.zippo.design.patten.demo.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class IoTest {

	public static void main(String[] args) {
		
		try {
			String fileName = ClassLoader.getSystemResource("test").getPath();
			String writeFileName = ClassLoader.getSystemResource("test").getPath()+"2";
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(fileName)));
			//OutputStream out = new ByteArrayOutputStream();
			//OutputStream out = new FileOutputStream(new File(writeFileName)); //ByteArrayOutputStream();
			//OutputStream out = new TestOutputStream();
			//OutputStream out = new EncryptedBufferedOutputStream(new FileOutputStream(new File(writeFileName)));
			SecretKey deskey = new SecretKeySpec("testDES1".getBytes(), "DES");
			// 生成一个实现指定转换的 Cipher 对象。Cipher对象实际完成加解密操作
			Cipher c = Cipher.getInstance("DES");
			// 用密钥初始化此 cipher
			c.init(Cipher.ENCRYPT_MODE, deskey);
			OutputStream out = new CipherOutputStream(new FileOutputStream(new File(writeFileName)), c);
			
			
			int r = 0;
			while((r = in.read()) != -1) {
				out.write(r);
			}
			out.flush();
			out.close();
			in.close();
			
			
			fileName = ClassLoader.getSystemResource("test2").getPath();
			writeFileName = ClassLoader.getSystemResource("test").getPath()+"3";
			in = new BufferedInputStream(new FileInputStream(new File(fileName)));
			deskey = new SecretKeySpec("testDES1".getBytes(), "DES");
			// 生成一个实现指定转换的 Cipher 对象。Cipher对象实际完成加解密操作
			c = Cipher.getInstance("DES");
			// 用密钥初始化此 cipher
			c.init(Cipher.DECRYPT_MODE, deskey);
			out = new CipherOutputStream(new FileOutputStream(new File(writeFileName)), c);
			
			r = 0;
			while((r = in.read()) != -1) {
				out.write(r);
			}
			out.flush();
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
