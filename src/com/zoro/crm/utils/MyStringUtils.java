package com.zoro.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import edu.emory.mathcs.backport.java.util.Arrays;

public class MyStringUtils {
	public static String getMD5Digest(String value){
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] md5_array = messageDigest.digest(value.getBytes());
			//System.out.println("md5:" + Arrays.toString(md5_array));
			BigInteger bigInteger = new BigInteger(1, md5_array);
			return bigInteger.toString(16);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
			
		}
	}
	
//	public static void main(String[] args) {
//		String value = "1234";
//		System.out.println(getMD5Digest(value));
//	}
}
