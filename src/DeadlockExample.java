public class DeadlockExample {

    String s1 = "yash";
    String s2 = "pathak";

    Thread t1= new Thread(){
        public void run(){
            while (true){
                synchronized (s1){
                    try {
                        System.out.println(Thread.currentThread().getName()+"locked "+s1);
                        //Thread.sleep(100);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (s2){
                        System.out.println(Thread.currentThread().getName()+"locked "+s2);
                        System.out.println(s1+s2);
                    }
                }
            }
        }
    };

    Thread t2= new Thread(){
        public void run(){
            while (true){
                synchronized (s2){
                    System.out.println(Thread.currentThread().getName()+"locked "+s2);
                    synchronized (s1){
                        System.out.println(Thread.currentThread().getName()+"locked "+s1);
                        System.out.println(s1+s2);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        DeadlockExample deadlockExample = new DeadlockExample();
        deadlockExample.t1.start();
        deadlockExample.t2.start();

    }
}
