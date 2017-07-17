import stopwatch.Stopwatch;

/**
 * @author diegodc 2017-07-16.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();

        if(stopwatch.isRunning())
            System.out.println("Stopwatch started");

        Thread.sleep(1000);

        stopwatch.stop();

        if(!stopwatch.isRunning())
            System.out.println("Stop");

        System.out.println("Elapsed time: " + stopwatch);
        System.out.println("in nanoseconds: " + stopwatch.nanosecondsElapsed());
        System.out.println("in milliseconds: " + stopwatch.millisecondsElapsed());
        System.out.println("in seconds: " + stopwatch.secondsElapsed());
        System.out.println("in minutes: " + stopwatch.minutesElapsed());

        stopwatch.reset();
    }

}
