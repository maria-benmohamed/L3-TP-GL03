package test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import org.junit.jupiter.api.Test;

class DB_APITest {
	@Test
    public void testDBconnect() {
        DB_API dbApi = new DB_API();
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertTrue(dbApi.DBconnect("Oracle", "Algeria"));
        });
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertFalse(dbApi.DBconnect("Oracle", "France"));
        });
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertTrue(dbApi.DBconnect("Oracle", "USA"));
        });
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertFalse(dbApi.DBconnect("MySQL", "Algeria"));
        });
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertTrue(dbApi.DBconnect("MySQL", "France"));
        });
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertFalse(dbApi.DBconnect("MySQL", "USA"));
        });
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertFalse(dbApi.DBconnect("SQLServer", "Algeria"));
        });
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertFalse(dbApi.DBconnect("SQLServer", "France"));
        });
        assertTimeoutPreemptively(Duration.ofMillis(1500), () -> {
            assertTrue(dbApi.DBconnect("SQLServer", "USA"));
        });
    }

}
