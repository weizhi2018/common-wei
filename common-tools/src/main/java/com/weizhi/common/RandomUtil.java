package com.weizhi.common;

import java.util.Random;

/**
 * ProjectName:common-wei
 * Decription:
 * Created By:weizhi
 * Created Date:2015/11/18
 * Updated By:
 * Updated Date:
 * Copyright@2014-2015 weizhi2018
 * Version:V1.0
 */
public class RandomUtil {
    /**
     * 生成3位随机数
     * @return
     */
     public static String genRandom3(){
        Random random = new Random();
        return String.format("%03d",random.nextInt(999));
    }

    /**
     * 生成4位随机数
     * @return
     */
    public static String genRandom4(){
        Random random = new Random();
        return String.format("%04d",random.nextInt(9999));
    }

}
