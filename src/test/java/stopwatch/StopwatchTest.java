package stopwatch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * StopwatchTest
 *
 * @author diegodc 2017-07-16.
 */
class StopwatchTest {

    private Stopwatch stopwatch;

    @BeforeEach
    void setUp() {
        stopwatch = new Stopwatch();
    }

    @Test
    void timeIsNotRunningInitially() {
        assertFalse(stopwatch.isRunning());
    }

    @Test
    void stopwatchStarted() {
        stopwatch.start();
        assertTrue(stopwatch.isRunning());
    }    @Test

    void stopwatchIsStopped() {
        stopwatch.start();
        stopwatch.stop();

        assertFalse(stopwatch.isRunning());
    }

    @Test
    void elapsedTime() throws InterruptedException {
        stopwatch.start();
        Thread.sleep(100);
        stopwatch.stop();

        assertEquals(100, stopwatch.millisecondsElapsed());
        Thread.sleep(100);
        assertEquals(100, stopwatch.millisecondsElapsed());
    }

    @Test
    void timeIsReset() throws InterruptedException {
        stopwatch.start();
        Thread.sleep(100);
        stopwatch.stop();

        stopwatch.reset();
        assertEquals(0, stopwatch.nanosecondsElapsed());
    }

}