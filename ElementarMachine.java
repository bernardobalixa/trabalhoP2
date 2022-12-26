import java.util.ArrayList;

public class ElementarMachine<T> {

    private ArrayList<T> things; 

    public void addThings(int n, T e) {
        this.things = new ArrayList<T>(n);
        this.things.add(e);
    }

    public boolean removeOneThing(T e) {
        if (this.things.contains(e)) {
            this.things.remove(e);
            return true;
        }

        return false;
    }

    public void listAll(){
        System.out.print(this.things.toString());
    }

}