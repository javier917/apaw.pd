package text;

public abstract class TextComponentComposite implements TextComponent{

    @Override 
    public abstract String print(boolean mayus);
    

    @Override
    public abstract void remove();

    @Override
    public boolean isComposite() {
        return true;
    }
}
