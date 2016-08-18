package com.dyl.ssm.Util;

import java.util.UUID;

/**
 * Created by duyilun on 16/8/14.
 */
public class IDGenerator {
    //工具类  根据当前系统时间 生成唯一的ID
    public static String generatorID(){
        return generatorID(System.currentTimeMillis());
    }

    public static String generatorID(long time){
        String rtnVal=Long.toHexString(time);
        rtnVal+= UUID.randomUUID();
        rtnVal=rtnVal.replaceAll("-","");
        return rtnVal.substring(0,32);
    }
}
