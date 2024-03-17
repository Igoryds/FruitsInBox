import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;
    
    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(T fruit){
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        } else {
            return fruits.size() * fruits.get(0).getWeight();
        }
    }

    public boolean compare(Box<?> anotherBox) {
        return anotherBox.getWeight() == this.getWeight();
    }

    public void transferTo(Box<T> other) {
        this.fruits.addAll(other.fruits);
        other.fruits.clear();
    }

}
