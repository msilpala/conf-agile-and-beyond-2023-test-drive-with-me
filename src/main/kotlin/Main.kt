fun main(args: Array<String>) {
    val input = if (args.isNotEmpty()) {
        val argsJoined = args.joinToString()
        println("args: $argsJoined")
        argsJoined
    } else {
        val stdin = generateSequence(::readLine).joinToString("\n")
        println("stdin: $stdin")
        stdin
    }

    val counts = WordCounter(input).countsByWord()
    println("${prettyPrint(counts)}")
}

fun prettyPrint(counts: Map<String, Int>): String {
    val builder = StringBuilder()
    builder.appendLine("Counts By Word")
    counts.entries.forEach {
        builder.appendLine("\"${it.key}\": ${it.value}")
    }
    return builder.toString()
}
