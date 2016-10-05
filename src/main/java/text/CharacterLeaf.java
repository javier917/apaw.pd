package text;

public class CharacterLeaf implements TextComponent {
    private char intrinsic;

    public CharacterLeaf(char intrinsic) {
        this.intrinsic = intrinsic;
    }

    public char getIntrinsic() {
        return intrinsic;
    }

    @Override
    public String print(boolean mayus) {
        if (mayus) {
            return ("" + this.intrinsic).toUpperCase();
        } else {
            return ("" + this.intrinsic);
        }
    }

    @Override
    public void remove() {

    }

    @Override
    public void add(TextComponent textComponent) {
        // TODO Auto-generated method stub
        
    }

}
