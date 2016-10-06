package calculadora_recuerdo;

import java.util.HashMap;
import java.util.Map;

public class GestorMementos {
    private Map<String, MementoCalculadora> mementoCalculadora = new HashMap<>();

    public void add(MementoCalculadora calculadora) {
        this.mementoCalculadora.put("" + calculadora.getTotal(), calculadora);
    }

    public MementoCalculadora getMemento(String key) {
        return this.mementoCalculadora.get(key);
    }
    
    public String[] claves(){
        return this.mementoCalculadora.keySet().toArray(new String[0]);
    }
}
