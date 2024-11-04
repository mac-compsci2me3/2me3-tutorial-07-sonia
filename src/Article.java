import java.util.ArrayList;
import java.util.List;  
import java.util.Iterator;

public class Article extends ArticleComponent {
    private List<ArticleComponent> components = new ArrayList<>();

    public void addComponent(ArticleComponent component) {
        components.add(component);
    }

    public void removeComponent(ArticleComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Displaying Article:");
        for (ArticleComponent component : components) {
            component.display();
        }
    }
    public Iterator<ArticleComponent> iterator() {
        return new ArticleIterator(components);
    }

}