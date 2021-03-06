package com.y1ph.easy.design.payment.service;

import com.y1ph.easy.design.common.BaseBean;
import com.y1ph.easy.design.payment.beans.PaymentOrder;
import com.y1ph.easy.design.payment.beans.PaymentProperties;

/**
 * 支付接口
 *
 * @author WFT
 * @since 2021/12/30
 */
public interface PaymentService<Properties extends PaymentProperties<?>> extends BaseBean<String> {

    /**
     * 调起第三方支付
     *
     * @param param    {@link PaymentOrder} 订单参数
     * @param clientId {@link String} 客户端编号
     * @param <Param>  {@link PaymentOrder} 订单类
     * @return {@link Object} 不同方式的支付返回值不同,因此这里返回一个Object
     */
    <Param extends PaymentOrder> Object payment(Param param, String clientId);

    /**
     * 调起第三方支付
     *
     * @param param      {@link PaymentOrder} 订单参数
     * @param properties {@link PaymentProperties}
     * @param <Param>    {@link PaymentProperties}
     * @return {@link Object}
     * @throws Exception 异常
     */
    <Param extends PaymentOrder> Object payment(Param param, Properties properties) throws Exception;

}
