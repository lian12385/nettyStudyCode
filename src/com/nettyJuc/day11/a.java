package com.nettyJuc.day11;

import java.nio.charset.StandardCharsets;

public class a {
    public static void main(String[] args) {


        //739
        String encRequData = "101000000281200128202104121324578 0000                                                                                                                                  6236430800000100922      100061210412200652100618020065CNY1200.48             1200.48             唐皆虫                                                                                           A                                                                                                                                                                                                                                                                                                                     432930196707119037              101  385D3604D72D37BCB1FE4F98D307224A";

        System.out.println(encRequData.length());
        System.out.println(encRequData.getBytes(StandardCharsets.UTF_8).length);
        System.out.println(encRequData.getBytes().length);
        char[] charss = encRequData.toCharArray();
        StringBuffer hex = new StringBuffer();
        for(int i = 0; i < charss.length; i++){
            hex.append(Integer.toHexString((int)charss[i]));
        }
        String hexString = new String();
        hexString = hex.toString();
        System.out.println(hexString.length());
        System.out.println("11111111111");
        System.out.println(hexString);
        System.out.println(hexString.length());
        byte[] hexStringLength = hexString.getBytes();
        if ( hexStringLength.length < 16 ){
            for (int i = 0; i < 16 - hexStringLength.length; i+=2) {
                hexString = hexString + "20";
            }
        }
        else {
            Integer zeroNum = hexStringLength.length % 16 ;
            if(zeroNum != 0){
                for (int i = 0; i < 16 - zeroNum; i+=2) {
                    hexString = hexString + "20";
                }
            }
        }
        System.out.println(hexString);
        System.out.println(hexString.length());











    }
}
