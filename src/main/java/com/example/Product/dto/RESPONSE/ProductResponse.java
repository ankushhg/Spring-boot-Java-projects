package com.example.Product.dto.RESPONSE;

public class ProductResponse 
{
    private double total;
    private double nettotal;
    private double tax;
    
    public ProductResponse(double total, double nettotal, double tax) {
        this.total = total;
        this.nettotal = nettotal;
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getNettotal() {
        return nettotal;
    }

    public void setNettotal(double nettotal) {
        this.nettotal = nettotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    
}
