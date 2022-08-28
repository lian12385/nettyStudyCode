package com.nettyJuc.day11;

import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;

public class b {
    public static void main(String[] args) {

        //739
        String encRequData = "201000  000003202208031132571659170003            00000001                         CHINESE             6226900901809646         FC1EA8F4AE80957A224B0647CD9A59D16226900901809646=49125200000057700000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           996226900901809646=1561560000000000000003000000510000049124000000000==000000000000000                                                                                                                                                                                                                                                                                                                                                                                                                                           021                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          2    5        001       0C73D0A91E04ECEB7A0701749F9FA5260";
                encRequData.trim();
        System.out.println(encRequData.length());
        System.out.println(encRequData.getBytes(StandardCharsets.UTF_8).length);
        System.out.println(encRequData.getBytes().length);

        String stmp = "";
        StringBuilder sb = new StringBuilder("");

        byte[] b = encRequData.getBytes();
        for(int n = 0; n < b.length; ++n) {
            stmp = Integer.toHexString(b[n] & 255);
            sb.append(stmp.length() == 1 ? "0" + stmp : stmp);
        }

        String hexString = sb.toString().toUpperCase().trim();
        System.out.println("222222222222");
        System.out.println(hexString);


//        char[] charss = encRequData.toCharArray();
//        StringBuffer hex = new StringBuffer();
//        for (int i = 0; i < charss.length; i++) {
//            hex.append(Integer.toHexString((int) charss[i]));
//        }
//        String hexString = new String();
//        hexString = hex.toString();
//        System.out.println(hexString.length());
//        System.out.println(hexString);
//        System.out.println(hexString.length());
        byte[] hexStringLength = hexString.getBytes();
        if (hexStringLength.length < 32) {
            for (int i = 0; i < 32 - hexStringLength.length; i += 2) {
                hexString = hexString + "20";
            }
        } else {
            Integer zeroNum = hexStringLength.length % 32;
            System.out.println(zeroNum);
            System.out.println(32-zeroNum);
            if (zeroNum != 0) {
                for (int i = 0; i < 32 - zeroNum; i += 2) {
                    hexString = hexString + "20";
                }
            }
        }
        System.out.println(hexString);
//        System.out.println(hexString.length());


    //}

}
}
