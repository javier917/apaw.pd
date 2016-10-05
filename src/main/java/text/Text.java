package text;

public class Text extends TextComponentComposite{
    String text;
    @Override
    public String print(boolean mayus){
        String devolver;
        if(mayus){
            devolver=this.text.toUpperCase();
        }else{
            devolver= this.text;
        }
        return devolver+"\n"+"---o---";
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
