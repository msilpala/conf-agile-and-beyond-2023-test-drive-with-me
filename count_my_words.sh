#!/bin/zsh
/Users/msilpala/Library/Java/JavaVirtualMachines/azul-17.0.7/Contents/Home/bin/java \
  -javaagent:/Users/msilpala/Library/Application\ Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9011.34/IntelliJ\ IDEA.app/Contents/lib/idea_rt.jar=49903:/Users/msilpala/Library/Application\ Support/JetBrains/Toolbox/apps/IDEA-U/ch-0/231.9011.34/IntelliJ\ IDEA.app/Contents/bin \
  -Dfile.encoding=UTF-8 \
  -classpath /Users/msilpala/code/github/WordCountAAB23Cli/build/classes/kotlin/main:/Users/msilpala/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.8.21/67f57e154437cd9e6e9cf368394b95814836ff88/kotlin-stdlib-jdk8-1.8.21.jar:/Users/msilpala/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.8.21/7473b8cd3c0ef9932345baf569bc398e8a717046/kotlin-stdlib-jdk7-1.8.21.jar:/Users/msilpala/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.8.21/43d50ab85bc7587adfe3dda3dbe579e5f8d51265/kotlin-stdlib-1.8.21.jar:/Users/msilpala/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.8.21/d749cd5ae25da36d06e5028785038e24f9d37976/kotlin-stdlib-common-1.8.21.jar:/Users/msilpala/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar \
  MainKt "$1"

