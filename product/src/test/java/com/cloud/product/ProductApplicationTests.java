package com.cloud.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cloud.product.entity.BrandEntity;
import com.cloud.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("小米");
        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("brand_id", 1L);
        List<BrandEntity> list = brandService.list(wrapper);
        list.forEach((item) ->{
            System.out.println(item);
        });
    }

}
