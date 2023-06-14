class WordCounter(val textToProcess: String) {

    fun countsByWord(): Map<String, Int> {
        val wordCounts = mutableMapOf<String, Int>()

        if(textToProcess.isEmpty()){
            return wordCounts
        }

        val words = textToProcess.split(' ')
        words.forEach { word ->
            wordCounts[word] = (wordCounts[word] ?: 0) + 1
        }

        return wordCounts
    }
}
