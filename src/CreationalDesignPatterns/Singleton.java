package CreationalDesignPatterns;

public class Singleton {
    private static Singleton instance;
    private String someName;
    private Singleton(String someName){
        this.someName = someName;
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton("Singleton");
        }
        return instance;
    }
    public String getSomeName() {
        return someName;
    }
    public void setSomeName(String someName) {
        this.someName = someName;
    }
}
