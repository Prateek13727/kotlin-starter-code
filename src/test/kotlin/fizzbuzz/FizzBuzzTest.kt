package fizzbuzz

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    @Test
    internal fun `should be 1 for number 1`() {
        val fizzBuzz = FizzBuzz()

        val result = fizzBuzz.execute(1)

        result shouldBeEqualTo "1"
    }
}