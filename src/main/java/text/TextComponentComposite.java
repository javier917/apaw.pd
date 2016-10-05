package text;

public abstract class TextComponentComposite implements TextComponent{

    @Override 
    public abstract String print(String mayus);

    @Override
    public abstract void remove();

}
