package com.util;

import java.util.Random;

/**
 * Created by Wzj on 2017/6/4 0004.
 */
public class Randoms {

    public static Integer getInt(Integer min, Integer max) {

        if (null == min) {
            return 0;
        }
        if (null == max) {
            return 0;
        }

        if (min > max) {
            return 0;
        }

        Random r = new Random();
        return r.nextInt(max - min) + min;
    }
}
