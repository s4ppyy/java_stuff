package sync;

public class U1901Thread extends Thread {
    private U1901Bank bankWork;
    int intTrans;
    private long lngSleep;

    public U1901Thread(U1901Bank bank, int intTr, long longSleep){
        bankWork = bank;
        intTrans = intTr;
        lngSleep = longSleep;
    }

    public void run(){
        bankWork.calc(intTrans, lngSleep);
    }
}
