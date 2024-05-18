import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class TestMeTest {

    @Test
    fun obtainFewWords() {
        val testMe = TestMe()
        assertDoesNotThrow {
            println(testMe.obtainFewWords())
        }
    }

    @Test
    fun obtainManyWords() {
        val testMe = TestMe()
        assertDoesNotThrow {
            println(testMe.obtainManyWords())
        }
    }
}