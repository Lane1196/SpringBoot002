package com.util;

import org.springframework.util.Assert;

import java.util.Random;

/**
 * Created by Wzj on 2017/6/4 0004.
 */
public class Randoms {

    public static Integer getInt(Integer min, Integer max) {

        if (null == min) {
            Assert.isNull(min, "min is null");
            return 0;
        }
        if (null == max) {
            Assert.isNull(max, "min is null");
            return 0;
        }

        if (min > max) {
            Assert.isTrue(min > max, "min value more than the max value");
            return 0;
        }

        Random r = new Random();
        return r.nextInt(max - min) + min;
    }
}
