import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WordCounterTest() {
    @Test
    fun `Counts one word`() {
        val input = "word"
        val expectedWordCount = mapOf("word" to 1)
        val wordCounter = WordCounter(input)

        val actualWordCounts = wordCounter.countsByWord()

        assertEquals(expectedWordCount, actualWordCounts)
    }

    @Test
    fun `Counts multiple words`() {
        val input = "one of each"
        val expectedWordCount = mapOf(
            "one" to 1,
            "of" to 1,
            "each" to 1
        )
        val wordCounter = WordCounter(input)

        val actualWordCounts = wordCounter.countsByWord()

        assertEquals(expectedWordCount, actualWordCounts)
    }

    @Test
    fun `Counts multiple occurrences of a word`() {
        val input = "yo yo yo"
        val expectedWordCount = mapOf(
            "yo" to 3
        )
        val wordCounter = WordCounter(input)

        val actualWordCounts = wordCounter.countsByWord()

        assertEquals(expectedWordCount, actualWordCounts)
    }

    @Test
    fun `Counts multiple occurrences of multiple words`() {
        val input = "one fish two fish red fish blue fish red blue two"
        val expectedWordCount: Map<String, Int> = mapOf(
            "one" to 1,
            "fish" to 4,
            "two" to 2,
            "red" to 2,
            "blue" to 2
        )
        val wordCounter = WordCounter(input)

        val actualWordCounts = wordCounter.countsByWord()

        assertEquals(expectedWordCount, actualWordCounts)
    }

}
