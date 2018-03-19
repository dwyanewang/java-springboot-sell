package top.linxz.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer cateogryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}