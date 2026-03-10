package com.example.Product.dto.RESPONSE;

public class APIResponse {
    private String name;
    private ProductResponse data;
    
    public APIResponse(String name, ProductResponse data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductResponse getData() {
        return data;
    }

    public void setData(ProductResponse data) {
        this.data = data;
    } 
}
