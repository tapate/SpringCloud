package com.springboot.cloud.demos.producer.entity.param;

import com.springboot.cloud.common.web.entity.param.BaseParam;
import com.springboot.cloud.demos.producer.entity.po.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductQueryParam extends BaseParam<Product> {
    private String name;
}
