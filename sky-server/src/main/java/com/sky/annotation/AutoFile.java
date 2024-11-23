package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 * @author pc
 */
//指定当前注解加在方法上面
@Target(ElementType.METHOD)
//声明周期
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFile {
    //指定数据库操作类型, 使用枚举的方式:UPDATE INSERT
    //公共字段只有在执行这两种操作类型时才会使用
    OperationType value();
}
