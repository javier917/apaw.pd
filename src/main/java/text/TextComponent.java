package text;

public interface TextComponent {
    public abstract String print(boolean mayus);
    
    public abstract void add(TextComponent textComponent);

    public abstract void remove();

    
}
