package com.eturial.esale.server.system.service;


import com.eturial.esale.server.system.entity.PrePurchase;
import com.eturial.esale.server.system.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {

    List<Product> findProductList();
}
