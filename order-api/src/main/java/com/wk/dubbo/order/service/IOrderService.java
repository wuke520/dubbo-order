package com.wk.dubbo.order.service;

import com.wk.dubbo.order.entity.OrderRequest;
import com.wk.dubbo.order.entity.OrderResponse;

/**
 * Created by Administrator on 2019/8/13.
 */
public interface IOrderService {

    OrderResponse doOrder(OrderRequest request);
}
