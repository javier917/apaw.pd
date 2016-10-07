package text;

public class Text extends TextComponentComposite{
    String text;
    public Text() {
        this.text="";
    }
    @Override
    public String print(boolean mayus){
        String devolver;
        if(mayus){
            devolver=this.text.toUpperCase();
        }else{
            devolver= this.text;
        }
        return devolver+"---o---\n";
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
