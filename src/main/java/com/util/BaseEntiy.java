package com.util;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Wzj on 2017/8/20 0020.
 */
public class BaseEntiy implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
}
