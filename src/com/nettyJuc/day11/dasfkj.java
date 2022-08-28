package com.nettyJuc.day11;

import java.nio.charset.StandardCharsets;

public class dasfkj {
 //   public static void main(String[] args) {

        //明文
        //"12345 + 11个空格"

        //加密返回hmac
        //3DECB96FC8F14DFF901CCFDAECA32C0583A71B95A58CF6E618166B08837AA3F9
               // 加密返回结果
        //4244007A4D7F0000405412C74D7F00000000000000000000C83B71C84D7F0000



        //加密
//        byte[] data = "12345           ".getBytes(StandardCharsets.UTF_8);;
//        int mode = 2;
//        String deviceID ="1324578";
//        String keyName1 = "ATM."+deviceID+"_SM4.zek";
//        String keyName2 = "ATM."+deviceID+"_SM4.z
//        String keyByLmk1 = null;
//        String keyByLmk2 = null;
//        String algorithmID = "0";
//        String iv = null;
//        String format = "4";
//        String dataType = "0";
//        String hsmGroup = "largeMess";
//
//
//        // 解密
//        int mode = 2;
//        //String deviceID = TxnData.getBusiStrByKey("term_id");
//        String deviceID ="1324578";
//        String keyName1 = "ATM."+deviceID+"_SM4.zek";
//        String keyName2 = "ATM."+deviceID+"_SM4.zak";;
//        String keyByLmk1 = null;
//        String keyByLmk2 = null;
//        String algorithmID = "0";
//        String iv = null;
//        String format = "4";
//        String exportFlag = "0";
//        String dataType = "0";
//        // destByte
//        //待验证hmac,mode=1或2存在
//        String digest = "3DECB96FC8F14DFF901CCFDAECA32C0583A71B95A58CF6E618166B08837AA3F9";
//        String encRequestData  = "4244007A4D7F0000405412C74D7F00000000000000000000C83B71C84D7F0000";
//        byte[] destByte1 = encRequestData.getBytes(StandardCharsets.UTF_8);
//        String hsmGroupID = "largeMess";


// 16进制字符串转 byte数组
public static void main(String[] args) {
    String hexStr = "303030303032353731";
    char[] charArr = hexStr.toCharArray();
    byte btArr[] = new byte[charArr.length / 2];
    int index = 0;
    for (int i = 0; i < charArr.length; i++) {
        int highBit = hexStr.indexOf(charArr[i]);
        int lowBit = hexStr.indexOf(charArr[++i]);
        btArr[index] = (byte) (highBit << 4 | lowBit);
        index++;
    }
    for (byte b : btArr) {
        System.out.println(b);
    }
    System.out.println(new String(btArr));
    System.out.println(btArr.length);
}

}
