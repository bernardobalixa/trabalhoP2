public abstract class Product{

    private String name;
    private double cost;

    public Product (String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setCost(double cost){
        this.cost = cost;
    }

    double cost(){
        return cost;
    }
    
}
