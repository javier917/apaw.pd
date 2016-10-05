package text;

public class Paragraph extends TextComponentComposite {
    private String paragraph;

    public Paragraph() {
        this.paragraph = "";
    }

    @Override
    public String print(boolean mayus) {
        if (mayus) {
            return paragraph.toUpperCase();
        } else {
            return paragraph;
        }
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
