package com.nettyJuc.day11;

import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class test {
    public static void main(String[] args) {
        String hexString = "3030303030323537310CDBC5A03AC5F56286CD8E789DBB1461402E92BFDAE6A0A33DF0C300B8BE83DAFDD8C7AFCEE29B96CD650490E6E82A29D30E139CCC4D1F7DD5BC438799729880C3F7B2082F0840CFCC5B3663445540A0870D645A428D8DEDC82E12B46ABB68D2B9457A297A56ABA0B822223A96BC30200E822F34C742751F7D8C787D99" +
                "205ECEBECACFC77453A92FD2B5DE303E015DF5865B6157EB492B3B6FDBE560D62E0E18C3F7B2082F0840CFCC5B3663445540A0C3F7B2082F0840CFCC5B3663445540A0A587F40BBB9642E306FE8AABE525986EABEADF79B8BA8E3D3C14211B885057ED82CE55611802D9E5D4473A5E892FC95C43FB7776011D8D1F7574D7A2FFD16FAC";




      //  String hexString = "30303030303234343131303530303020203030303036323230323230383034313034393338313635393137303030332020202020202020202020203030303030303031202020202020202020202020202020202020202020202020204348494E455345202020202020202020202020203632323639303039303138303936343620202020202020202034353245343245424141384432384439313246363034303939414231423743382020202020202020202020202020202020202020202020202020202020202020202020202020202020202020202020303557444332303345354233314241413739423231443246333242323639334534323735";
//        byte[] packinfo = hexString.getBytes();
//        for (byte b : packinfo) {
//            System.out.println(b);
//        }
//        System.out.println(new String(packinfo));
//        System.out.println();




        byte[] pakeinfo  = new byte[hexString.length() / 2];
        for (byte b : pakeinfo) {
            System.out.println(b);
        }
        int j = 0;
        for (int i = 0; i < hexString.length(); i += 2) {
//            System.out.println( Integer.parseInt(hexString.substring(i, i + 2),16));
            pakeinfo [j] = (byte) Integer.parseInt(hexString.substring(i, i + 2),16);
            System.out.println("--------------");
           System.out.println(pakeinfo[j]);
            j++;
        }

        String stmp = "";
        StringBuilder sb = new StringBuilder("");

        for(int n = 0; n < pakeinfo.length; ++n) {
            stmp = Integer.toHexString(pakeinfo[n] & 255);
            sb.append(stmp.length() == 1 ? "0" + stmp : stmp);
        }

        System.out.println(sb.toString().toUpperCase().trim().getBytes());


        System.out.println(new String(pakeinfo));
//        String decrData = new String(pakeinfo);


//        for (byte b : pakeinfo) {
//            System.out.println(b);
//        }







//        String hexHead = decrData.substring(0,9);
//        System.out.println(hexHead);

        //Log.txnInfo("接收密文hexHead数据======：",hexHead + "");
//        byte[] headByte = new byte[8];
//        System.out.println(new String(headByte));
//        System.arraycopy(bytes,0,headByte,0,8);
//        for (byte aByte : bytes) {
//            System.out.println(aByte);
//        }
//        System.out.println(new String(bytes));

    }
}
