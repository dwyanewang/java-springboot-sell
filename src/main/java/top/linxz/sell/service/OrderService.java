package top.linxz.sell.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.linxz.sell.dataobject.OrderDetail;
import top.linxz.sell.dataobject.OrderMaster;
import top.linxz.sell.dataobject.ProductCategory;
import top.linxz.sell.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    //创建订单
    OrderDTO create(OrderDTO orderDTO)throws Exception;

    //查询单个订单
    OrderDTO findOne(String orderId)throws Exception;

    //查询订单列表
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable)throws Exception;

    //取消订单
    OrderDTO cancel(OrderDTO orderDTO)throws Exception;

    //完结订单
    OrderDTO finish(OrderDTO orderDTO)throws Exception;

    //支付订单
    OrderDTO paid(OrderDTO orderDTO)throws Exception;

}
