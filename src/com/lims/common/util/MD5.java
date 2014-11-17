package com.lims.common.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密工具
 */
public class MD5 {
	 public static String getMD5Str(String str) {
	        String encryStr = Constants.EMPTYSTRING;
	        try {
	            if (str != null) {
	                MessageDigest m = MessageDigest.getInstance(Constants.ENCRYPTION);
	                m.update(str.getBytes());
	                encryStr = (new BigInteger(m.digest())).toString(16)
	                        .toUpperCase();
	            }
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        return encryStr;
	    }
	 public static void main(String[] args) {
//		String md5Str = getMD5Str("admin");
//		System.out.println(md5Str);
	}
}
