package com.wk.dubbo.order;

import com.wk.dubbo.order.entity.OrderRequest;
import com.wk.dubbo.order.entity.OrderResponse;
import com.wk.dubbo.order.service.IOrderService;

/**
 * Created by Administrator on 2019/8/13.
 */
public class OrderServiceImpl implements IOrderService{
    @Override
    public OrderResponse doOrder(OrderRequest request) {
        System.out.println("到此一游：" + request);
        OrderResponse response = new OrderResponse();
        response.setCode("200");
        response.setMsg("success");
        return response;
    }
}
