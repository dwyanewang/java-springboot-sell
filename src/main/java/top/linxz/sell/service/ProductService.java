package top.linxz.sell.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.linxz.sell.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
