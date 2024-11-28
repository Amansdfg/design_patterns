package labs.task10.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements Visitable {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
