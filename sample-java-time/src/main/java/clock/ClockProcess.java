package clock;

import java.time.Clock;
import java.time.Instant;

public class ClockProcess {

    private final Clock clock;

    public ClockProcess(final Clock clock) {
        this.clock = clock;
    }

    public Instant process() {

        return clock.instant();
    }
}
