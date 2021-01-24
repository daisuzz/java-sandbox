package clock;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClockProcessTest {

    ClockProcess clockProcess;

    @Test
    void testMockedClock() {

        clockProcess = new ClockProcess(Clock.fixed(Instant.parse("2021-01-01T00:00:00Z"), ZoneOffset.UTC));

        final Instant actual = clockProcess.process();

        assertEquals(Instant.parse("2021-01-01T00:00:00Z"), actual);
    }

    @Test
    void testEquals() {

        final Clock c1 = Clock.systemDefaultZone();
        final Clock c2 = Clock.systemDefaultZone();

        final boolean actual = c1.equals(c2);

        assertTrue(actual);
    }

    @Test
    void testFixed() {

        final Clock c = Clock.fixed(Instant.parse("2021-01-01T00:00:00Z"), ZoneId.systemDefault());

        final Instant actual = c.instant();
        assertEquals(Instant.parse("2021-01-01T00:00:00Z"), actual);
    }
}
