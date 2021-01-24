import clock.ClockProcess;

import java.time.Clock;

/**
 * Hello world!
 */
public class App {
    public static void main(final String[] args) {

        final ClockProcess clockProcess = new ClockProcess(Clock.systemDefaultZone());

        clockProcess.process();
    }
}
