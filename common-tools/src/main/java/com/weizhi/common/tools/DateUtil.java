package com.weizhi.common.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ProjectName:common-wei
 * Decription:生成日期，返回格式化日期
 * Created By:weizhi
 * Created Date:2015/11/22
 * Updated By:
 * Updated Date:
 * Copyright@2014-2015 weizhi2018
 * Version:V1.0
 */
public class DateUtil {

    /**
     * 日期格式
     */
    private final static String DATEFORMAT = "yyMMddHHmmssSSS";

    private static DateFormat df = null;

    static {
        init();
    }

    /**
     * 初始化日期格式化对象
     */
    private static void init(){
        df = new SimpleDateFormat(DATEFORMAT);
    }

    /**
     * 生成yyMMddHHmmssSSS格式的时间
     * @return
     */
    public static String genTimeyyMMddHHmmssSSS(){
        Date date = new Date();
        return df.format(date);
    }
}
