package singleton.factory;



import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {
    private static ReferencesFactory referencesFactory=null;
    private Map<String, Integer> references;

    private int reference;
    
    private ReferencesFactory() {
        this.references = new HashMap<>();
        this.reference = 0;
    }
    public static ReferencesFactory getFactory(){
        if(referencesFactory==null){
            ReferencesFactory.referencesFactory=new ReferencesFactory();
        }
        return ReferencesFactory.referencesFactory;
    }
    
    public int getReference(String key) {
        Integer result = this.references.get(key);
        if (result == null) {
            this.references.put(key, this.reference);
            result = this.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}
