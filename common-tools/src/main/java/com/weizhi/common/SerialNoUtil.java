package com.weizhi.common;

import com.weizhi.common.tools.DateUtil;

import java.util.Random;

/**
 * ProjectName:common-wei
 * Decription: 生成不重复的流水号
 * Created By:weizhi
 * Created Date:2015/11/18
 * Updated By:
 * Updated Date:
 * Copyright@2014-2015 weizhi2018
 * Version:V1.0
 */
public class SerialNoUtil {

    /**
     * 生成23位流水号
     * @return
     */
    public static String genSerialNo23(){
        StringBuffer serialBuf = new StringBuffer(23);
        serialBuf.append("1")   //环境标志位 0: 测试,1:生产。
                .append("1")    //分库标志位
                //15位时间戳
                .append(DateUtil.genTimeyyMMddHHmmssSSS())
                //3位随机数
                .append(RandomUtil.genRandom3())
                //3位随机数
                .append(RandomUtil.genRandom3());
        return serialBuf.toString();
    }

    /**
     * 生成21位流水号
     * @return
     */
    public static String genSerialNo21(){
        StringBuffer serialBuf = new StringBuffer(21);
        serialBuf.append(DateUtil.genTimeyyMMddHHmmssSSS()) //15位时间戳
                //3位随机数
                .append(RandomUtil.genRandom3())
                //3位随机数
                .append(RandomUtil.genRandom3());
        return serialBuf.toString();
    }



    public static void main(String args[]){
//        for(int i=0;i<100;i++) {
            System.out.println(SerialNoUtil.genSerialNo23());
//        }
        System.out.println(SerialNoUtil.genSerialNo23());
        System.out.println(SerialNoUtil.genSerialNo21());

    }
}
