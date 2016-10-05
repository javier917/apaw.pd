package text;

import java.util.Map;
import java.util.HashMap;

public class Factory {
    private Map<Character, CharacterLeaf> character;

    private static Factory factory=null;

    private Factory() {
        this.character = new HashMap<>();
    }
    
    public static Factory getFactory(){
        if(Factory.factory==null){
            Factory.factory=new Factory();
            return Factory.factory;
        }else{
            return Factory.factory;
        }
    }
    
    public CharacterLeaf get(char key){
        if(character.containsKey(key)){
            return character.get(key);
        }else{
            CharacterLeaf character=new CharacterLeaf(key);
            this.character.put(key, character);
            return character;
        }
       
    }
}
