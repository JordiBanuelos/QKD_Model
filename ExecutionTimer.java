/**
 * @(#)ExecutionTimer.java
 *
 *
 * @Naveed Shoaib (nshoaib@ysu.edu) 
 * @version 1.00 2009/8/15
 */


public class ExecutionTimer {
    private long start;
    private long end;

    public ExecutionTimer() {
        reset();
    }
    public void reset() {
        start = 0;
        end = 0;
    }
    public void start() {
        start = System.nanoTime();
    }

    public void end() {
        end = System.nanoTime();
    }

    public long duration(){
        return (end - start);
    }

}