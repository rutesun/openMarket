package com.intellicode.openMarket.util.interceptor;

import com.intellicode.openMarket.mapper.ProductMapper;
import com.intellicode.openMarket.vo.product.ClassificationMap;
import com.intellicode.openMarket.vo.product.ProductClassification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rutes_000 on 2015-06-04.
 */
public class InitializeProductClassification {
    private static final Logger logger = LoggerFactory.getLogger(InitializeProductClassification.class);

    //@Autowired
    ProductMapper productMapper;

    @Autowired
    ApplicationContext ctx;

    private int level = -1;

    private  static Map<String, ClassificationMap> classificationMap = new HashMap<>();

    public void setInitializeLevel(int level){
        if(level < 1 || level > 4)
            throw new IllegalArgumentException("1-4 사이의 수를 넣어주세요.");

        this.level = level;
    }

    public void setMapper(ProductMapper mapper){
        this.productMapper = mapper;
    }

    public void init() throws Exception {
        System.out.println(System.currentTimeMillis());
        logger.info("Make Product Classification Map");
        List<ProductClassification> list = productMapper.selectProductClassification1(), list2, list3, list4;
        ClassificationMap map1, map2, map3, map4;

        for(ProductClassification classcifitaion: list){
            map1 = new ClassificationMap(classcifitaion.getCode1(), classcifitaion.getName());
            list2 = productMapper.selectProductClassification2(classcifitaion);

            for(ProductClassification classcifitaion2: list2) {
                map2 = new ClassificationMap(classcifitaion2.getCode2(), classcifitaion2.getName());
                list3 = productMapper.selectProductClassification3(classcifitaion2);

                for(ProductClassification classcifitaion3: list3) {
                    map3 = new ClassificationMap(classcifitaion3.getCode3(), classcifitaion3.getName());
                    list4 = productMapper.selectProductClassification4(classcifitaion3);

                    for(ProductClassification classcifitaion4: list4) {
                        map4 = new ClassificationMap(classcifitaion4.getCode4(), classcifitaion4.getName());
                        map3.getNext().put(classcifitaion4.getCode4(), map4);
                    }

                    map2.getNext().put(classcifitaion3.getCode3(), map3);
                }

                map1.getNext().put(classcifitaion2.getCode2(), map2);
            }



            classificationMap.put(classcifitaion.getCode1(), map1);
        }


        logger.info(classificationMap.toString());
        System.out.println(System.currentTimeMillis());
    }

    public static Map<String, ClassificationMap> getClassificationMap(){
        return classificationMap;
    }
}
