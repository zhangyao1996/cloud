package com.zy.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhangyao
 * @create 2020/5/29
 */
@Data
@AllArgsConstructor//生成全参数构造函数
@NoArgsConstructor//生成无参构造函数
public class Payment implements Serializable {

    private Long id;
    private String serial;//订单流水号
}
