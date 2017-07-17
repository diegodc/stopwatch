package stopwatch;

/**
 * A simple stopwatch.
 *
 * @author diegodc 2013-22-04.
 */
public class Stopwatch {

	private boolean isRunning;
	private long initialTime;
	private long elapsedTime;

	public Stopwatch() {
		isRunning = false;
		initialTime = 0;
		elapsedTime = 0;
	}

	public void start() {
        isRunning = true;
        resetInitialTime();
    }

    private void resetInitialTime() {
        initialTime = currentTime();
    }

    private long currentTime() {
        return System.nanoTime();
    }

    public void stop() {
        markElapsedTime();
        isRunning = false;
    }

    private void markElapsedTime() {
        if (isRunning()) {
            elapsedTime += calculateElapsedTime();
        }
    }

    public boolean isRunning() {
        return isRunning;
    }

    private long calculateElapsedTime() {
        return currentTime() - initialTime;
    }

	public void reset() {
        resetInitialTime();
        resetElapsedTime();
    }

    private void resetElapsedTime() {
        elapsedTime = 0;
    }

	public long nanosecondsElapsed() {
		return getElapsedTime();
	}

    private long getElapsedTime() {
        markElapsedTime();
        return elapsedTime;
    }

	public long millisecondsElapsed() {
		return nanosecondsElapsed() / 1000000;
	}

    public long secondsElapsed() {
        return this.millisecondsElapsed() / 1000;
    }

	public long minutesElapsed() {
        return secondsElapsed() / 60;
	}

	@Override
	public String toString() {
		long minutes = this.minutesElapsed() % 60;
		long seconds = this.secondsElapsed() % 60;
		long milliseconds = this.millisecondsElapsed() % 1000;

        return minutes + "m:"
                        + seconds + "s:"
                        + milliseconds + "ms";
	}

}
