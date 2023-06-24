package java_essential.homework8.price;

/*Требуется: Описать класс с именем Price, содержащую следующие поля:
 название товара;
 название магазина, в котором продается товар;
 стоимость товара в гривнах.

Написать программу, выполняющую следующие действия:
 ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
быть упорядочены в алфавитном порядке по названиям магазинов);
 Обработать исключения некорректного ввода цены. */

public class Price {
    private String productName;
    private String productSeller;
    private double price;

    public Price(String productName, String productSeller, double price) {
        this.productName = productName;
        this.productSeller = productSeller;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSeller() {
        return productSeller;
    }

    public void setProductSeller(String productSeller) {
        this.productSeller = productSeller;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
       return "Product: " + productName + ", Store: " + productSeller + ", Price: " + price + " UAH";
    }
}


