package com.util;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Wzj on 2017/8/20 0020.
 */
@MappedSuperclass
@Data
public abstract class BaseEntiy implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
}
