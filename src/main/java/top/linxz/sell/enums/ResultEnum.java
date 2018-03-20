package top.linxz.sell.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(10, "商品库存不正确"),
    ORDER_NOT_EXIST(10, "订单不存在"),
    ORDERDETAIL_NOT_EXIST(10, "订单详情不存在"),;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
