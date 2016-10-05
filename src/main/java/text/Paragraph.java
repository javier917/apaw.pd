package text;

public class Paragraph extends TextComponentComposite {
    private String paragraph;

    public Paragraph() {
        this.paragraph = "";
    }

    @Override
    public String print(boolean mayus) {
        String devolver;
        if (mayus) {
            devolver= paragraph.toUpperCase();
        } else {
            devolver= paragraph;
        }
        return devolver+"\n";
    }

    @Override
    public void remove() {
        this.paragraph = this.paragraph.substring(0, this.paragraph.length() - 1);
    }

    @Override
    public void add(TextComponent textComponent){
        if (textComponent.isComposite()) {
            throw new UnsupportedOperationException();
        } else {
            this.paragraph = this.paragraph + textComponent.print(false);
        }
    }

}
