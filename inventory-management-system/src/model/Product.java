    package model;

    public class Product {
        private Long prodId;
        private String productCode;
        private String productName;
        private String brand;
        private int quantity;
        private Double costPrice;
        private Double sellPrice;
        private Double totalCost;
        private Double totalRevenue;

        public Product() {
        }

        public Long getProdId() {
            return prodId;
        }

        public void setProdId(Long productId) {
            this.prodId = productId;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String prodCode) {
            this.productCode = prodCode;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String prodName) {
            this.productName = prodName;
        }

        public Double getCostPrice() {
            return costPrice;
        }

        public void setCostPrice(Double costPrice) {
            this.costPrice = costPrice;
        }

        public Double getSellPrice() {
            return sellPrice;
        }

        public void setSellPrice(Double sellPrice) {
            this.sellPrice = sellPrice;
        }

        public Double getTotalCost() {
            return totalCost;
        }

        public void setTotalCost(Double totalCost) {
            this.totalCost = totalCost;
        }

        public Double getTotalRevenue() {
            return totalRevenue;
        }

        public void setTotalRevenue(Double totalRevenue) {
            this.totalRevenue = totalRevenue;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "productCode='" + productCode + '\'' +
                    ", productName='" + productName + '\'' +
                    ", quantity=" + quantity +
                    ", brand='" + brand + '\'' +
                    ", costPrice=" + costPrice +
                    ", sellPrice=" + sellPrice +
                    ", totalCost=" + totalCost +
                    ", totalRevenue=" + totalRevenue +
                    '}';
        }
    }
