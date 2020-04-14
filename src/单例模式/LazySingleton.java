package 单例模式;

public class LazySingleton {
    private static volatile LazySingleton lazySingleton = null;
    private LazySingleton(){
        if (lazySingleton != null){
            throw new RuntimeException("该对象已经被创建了");
        }
    }
    public static synchronized LazySingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
