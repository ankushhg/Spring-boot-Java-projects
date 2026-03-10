package com.example.Product.service;

import org.springframework.stereotype.Service;

import com.example.Product.dto.REQUEST.ProductRequest;
import com.example.Product.dto.RESPONSE.ProductResponse;

@Service
public class ProductService 
{
    public ProductResponse calculatebi(ProductRequest req)
    {
        double total=0;

        total=req.getP1()+req.getP2()+req.getP3()+req.getP4()+req.getP5()+req.getP6()+req.getP7()+req.getP8()+req.getP9()+req.getP10();

        double tax=total*0.18;
        double nettotal=tax+total;
        
        return new ProductResponse(total,nettotal,tax);
    }
}
