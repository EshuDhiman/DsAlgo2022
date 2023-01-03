package Questions.Arrays;

import java.util.Arrays;

class Product {
    private Product  id;
    private int price;
    private int quantity;

     Product() {
    };

    public Product getId() {
        return id;
    }

    public Product(int i, int price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public void setId(Product id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   void calculate(Product[] arr , Product id){
        int grossAmount=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==id){
            grossAmount = getPrice()*getPrice();
        }
        System.out.println(grossAmount);
        
    }
   }

    @Override
    public String toString() {
        return "Product [id=" + id + ", price=" + price + ", quantity=" + quantity + "]";
    }
    
}

public class BeanProduct {
    public static void main(String[] args) {
        Product[] arrOfProducts = new Product[] { new Product(1, 200, 10), new Product(2, 300, 20) };
        Product obj = new Product();
        System.out.println(Arrays.toString(arrOfProducts));
        obj.calculate(arrOfProducts, obj);
        for (int i = 0; i < arrOfProducts.length; i++) {
            obj.calculate(arrOfProducts, 2);
        }
        

    }
}
