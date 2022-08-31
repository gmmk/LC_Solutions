public class RunnableEg {
    public static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            for(int i = 0 ; i < 3 ; i ++) {
                System.out.println("Hello from thread "+Thread.currentThread().getName());
            }
        }
    };

    public static Runnable lambdaRunnable = () -> {
        for(int i = 0 ; i < 3 ; i ++) {
            System.out.println("Hello from thread "+Thread.currentThread().getName());
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(lambdaRunnable);
        thread.start();
        thread.join();
    }
}
