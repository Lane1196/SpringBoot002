package com.entity;

import com.util.BaseEntiy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Wzj on 2017/8/20 0020.
 */
@Entity
@Data
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntiy {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    @NotBlank
    private String            name;
    /**
     * 密码
     */
    @NotBlank
    private String            pwd;
    /**
     * 年龄
     */

    private Integer           age;
    /**
     * 性别
     */
    @NotNull
    private Integer           gender;
}
