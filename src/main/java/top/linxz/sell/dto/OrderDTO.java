package top.linxz.sell.dto;

import lombok.Data;
import top.linxz.sell.dataobject.OrderDetail;
import top.linxz.sell.enums.OrderStatusEnum;
import top.linxz.sell.enums.PayStatusEnum;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;

    //总金额
    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
