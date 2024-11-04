import java.util.Iterator;
import java.util.List;
public class ArticleIterator implements Iterator<ArticleComponent> {
    private List<ArticleComponent> components;
    private int index;

    public ArticleIterator(List<ArticleComponent> components){
        this.components = components;
        this.index = 0;
    }
    @Override
    public boolean hasNext(){
        return index < components.size();
    }
    @Override
    public ArticleComponent next(){
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return components.get(index++);
    }
}

