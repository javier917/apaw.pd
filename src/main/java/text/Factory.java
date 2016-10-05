package text;

import java.util.Map;
import java.util.HashMap;

public class Factory {
    private Map<Character, CharacterLeaf> character;

    private static Factory factory=null;

    private Factory() {
        this.character = new HashMap<>();
    }
    
    public Factory getFactory(){
        if(factory==null){
            factory=new Factory();
            return factory;
        }else{
            return factory;
        }
    }
}
