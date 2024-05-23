package my.app.momschoice.customerFoodPanel;

public class Cart {
    private String Chefid,DishID,DishName,DishQuantity,Price,Totalprice;

    public Cart(String chefid, String dishID, String dishName, String dishQuantity, String price, String totalprice) {
        Chefid = chefid;
        DishID = dishID;
        DishName = dishName;
        DishQuantity = dishQuantity;
        Price = price;
        Totalprice = totalprice;
    }

    public Cart() {
    }

    public String getChefId() {
        return Chefid;
    }

    public void setChefId(String chefId) {
        Chefid = chefId;
    }

    public String getDishID() {
        return DishID;
    }

    public void setDishID(String dishID) {
        DishID = dishID;
    }

    public String getDishName() {
        return DishName;
    }

    public void setDishName(String dishName) {
        DishName = dishName;
    }

    public String getDishQuantity() {
        return DishQuantity;
    }

    public void setDishQuantity(String dishQuantity) {
        DishQuantity = dishQuantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getTotalprice() {
        return Totalprice;
    }

    public void setTotalprice(String totalprice) {
        Totalprice = totalprice;
    }
}
