package sync;

public class U1901Bank {
    private int intTo;
    private int intFrom = 220;

    public synchronized void calc(int intTransaction, long lngTimeout){
        System.out.println("Before:\n" + "intTo: " + intTo);
        System.out.println("intFrom: " + intFrom);
        System.out.println("ThreadName: " + Thread.currentThread().getName());
        intFrom -= intTransaction;
        try {
            Thread.sleep(lngTimeout);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        intTo += intTransaction;
        System.out.println("After:\n" + "intTo: " + intTo);
        System.out.println("intFrom: " + intFrom);
        System.out.println("ThreadName: " + Thread.currentThread().getName());
    }
}
