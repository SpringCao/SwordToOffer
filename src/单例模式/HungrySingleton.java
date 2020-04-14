package 单例模式;

public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
