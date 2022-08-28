package com.nettyJuc.day12;

import java.nio.charset.StandardCharsets;

public class loopde {
    public static void main(String[] args) throws Exception {
//        System.out.println(strAmount2S("00000000000000030000"));
        String a = "13sdf�����ն�aafd";
        String b = "123" + a;
        byte[] cc = b.getBytes();
        System.out.println(new String(cc));

//        String newStr = a.replaceFirst("^0*","");
//        System.out.println(newStr);
    }
    public static String strAmount2S(String strAmount) throws Exception {
        if (strAmount == null || strAmount.length() == 0) {
            strAmount = "0000";
        }
        "ssf".getBytes(StandardCharsets.UTF_8);

        long longAmount = Long.parseLong(strAmount) / 100L;
        String strRet = "0000" + strAmount;
        return Long.toString(longAmount) + "." + strRet.substring(strRet.length() - 2);
    }
}
