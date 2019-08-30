package com.wk.dubbo.order.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/8/13.
 */
public class OrderRequest implements Serializable {
    private static final long serialVersionUID = 8614644510707458591L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
