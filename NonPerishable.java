public class NonPerishable extends Product {

    private int volume;
    
    public NonPerishable(String name, double cost, int volume){
        super(name, cost);

        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

}
