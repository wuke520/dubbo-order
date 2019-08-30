package com.wk.dubbo.order.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/8/13.
 */
public class OrderResponse implements Serializable {
    private static final long serialVersionUID = 4448714649586282851L;

    private Object data;

    private String code;

    private String msg;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
