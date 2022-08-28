//package com.ex.he;
//
//public class bing_data {
//    public static void main(String[] args) {
//        GapsMessage ms = (GapsMessage)gapsContent.get("GapsMessage");
//
//        byte[] pakeinfo = (byte[])ms.getMsg();
//
//        Log.txnInfo("encForMs=====byte加密明文长度===",pakeinfo.length + "");
//
//        Log.txnInfo("encForMs=====明文===",new String(pakeinfo));
//
//
//        byte[] headByte = new byte[8];
//        System.arraycopy(pakeinfo, 0, headByte, 0, headByte.length);
//
//        String encRequData = new String(pakeinfo).substring(8); //byte转string进行加密
//
//        Log.txnInfo("encForMs=====明文===",new String(pakeinfo));
//
//        Log.txnInfo("encRequData====加密前明文===",encRequData);
//
//        Log.txnInfo("加密前明文长度===",encRequData.length() + "");
//        String hexString = new String();
//        if(sign.equals("30"))
//        {
//            Log.txnInfo("签到交易 ======",sign);
//            Integer lengthRes = encRequData.length() + 1;
//            String headString = String.format("%8d",lengthRes).replace(" ", "0");
//
//            hexString = headString + "0" + encRequData;
//
//
//        }
//        else{
//
////              思路
////            判断解密数据长度是否超过4096 把送去解密的数据分成4096段，分段解密；
////            把分段解密的出来的结果拼接起来
//
//
//
//            //送往加密机 base 64代替
//            hexString = Base64.getEncoder().encodeToString(encRequData.getBytes());
//
//            //计算长度
//            Integer lengthRes = hexString.length() + 1;
//            String headString = String.format("%8d",lengthRes).replace(" ", "0");
//
//
//
//            hexString = headString + "1" + hexString;
//
//            //hexString = "00000996" + hexString;
//
//        }
//
//        hexString = hexString.toUpperCase();
//
//        byte[] data3 = hexString.getBytes(StandardCharsets.UTF_8);
//        Log.txnInfo("服务端解密后报文：",hexString);
//        Log.txnInfo("字节数组服务端解密后报文：",new String(data3));
//        ms.setMsg(data3);
//        Log.txnInfo("加密后密文======：",hexString);
//    }
//}
