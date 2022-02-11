package hackerrank;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import java.security.MessageDigest;

public class JavaMD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] out = md.digest(s.getBytes());
        for (byte b : out) {
            System.out.format("%02x", b);
        }
    }
}