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
    public String print(String mayus) {
        return (""+this.intrinsic).toUpperCase();
    }

    @Override
    public void remove() {
       

    }

}
