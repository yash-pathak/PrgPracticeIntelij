public class SingletonDesign {
    private static SingletonDesign singleton = null;

    private SingletonDesign (){
        System.out.println("singleton constructor");
    };
    private static SingletonDesign getinstance(){
        synchronized (SingletonDesign.class) {
            if (singleton == null) {
                return singleton = new SingletonDesign();
            } else {
                return singleton;
            }
        }
    }
}
