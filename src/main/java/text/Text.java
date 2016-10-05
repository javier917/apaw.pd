package text;

public class Text extends TextComponentComposite{
    String text;
    @Override
    public String print(boolean mayus){
        if(mayus){
            return this.text.toUpperCase();
        }else{
            return this.text;
        }
    }

    @Override
    public void remove() {
        
    }

    @Override
    public void add(TextComponent textComponent) {
       if(textComponent.isComposite()){
           this.text=this.text+textComponent.print(false);
       }else{
           throw new UnsupportedOperationException();
       }
        
    }

}
