package rectangle

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class RectangleTest {
    @Test
    internal fun `area should be 2 for length 1 and breadth 2`() {
        val rectangle1x2 = Rectangle(1, 2)

        val area = rectangle1x2.area()

        area shouldBeEqualTo 2
    }
}