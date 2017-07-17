# enigma-machine

A simple stopwatch

Example:

    stopwatch.start();

    if(stopwatch.isRunning())
        System.out.println("Stopwatch started");

    //... do something

    stopwatch.stop();

    if(!stopwatch.isRunning())
        System.out.println("Stop");

    System.out.println("Elapsed time: " + stopwatch);
    System.out.println("in nanoseconds: " + stopwatch.nanosecondsElapsed());
    System.out.println("in milliseconds: " + stopwatch.millisecondsElapsed());
    System.out.println("in seconds: " + stopwatch.secondsElapsed());
    System.out.println("in minutes: " + stopwatch.minutesElapsed());

    stopwatch.reset();