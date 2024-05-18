data class WordContainer(
    val word: String,
)

class TestMe {
    private val fewWords = listOf(
        WordContainer("Apple")
    )

    fun obtainFewWords() = fewWords.sortedBy {
        it.word
    }

    private val manyWords = listOf(
        WordContainer("Pineapple"),
        WordContainer("Bees"),
        WordContainer("Cherry"),
        WordContainer("Dinosaur"),
        WordContainer("Apple")
    )

    fun obtainManyWords() = manyWords.sortedBy {
        it.word
    }
}