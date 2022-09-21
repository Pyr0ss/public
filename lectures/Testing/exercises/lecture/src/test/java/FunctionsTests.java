import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class FunctionsTests {
    @Test
    void onePlusOneIsTwo() {
        assertThat(1 + 1, is(2));
    }

    // TODO
    // Remember "assertThat" with matchers (see the documentation!)
    // and "assertThrows" to assert an exception is thrown
}
