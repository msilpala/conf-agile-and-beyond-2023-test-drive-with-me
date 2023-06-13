class WordCounter(val textToProcess: String) {

    fun countsByWord(): Map<String, Int> {
        val wordCounts = mutableMapOf<String, Int>()

        val words = textToProcess.split(' ')
        words.forEach { word ->
            wordCounts[word] = (wordCounts[word] ?: 0) + 1
        }

        return wordCounts
    }
}
