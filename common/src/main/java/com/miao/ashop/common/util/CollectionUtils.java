package com.miao.ashop.common.util;

import java.util.Collection;

public class CollectionUtils {

    /**
     * 容器中有数据
     * @param c
     * @return
     */
    public static boolean hasElement(Collection c){
        if (null==c || c.size()==0){
            return false;
        }else {
            return true;
        }
    }
}
