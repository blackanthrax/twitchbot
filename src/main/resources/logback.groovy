scan("60 seconds")

logger("org.springframework", DEBUG)
logger("com.github.blackanthrax", INFO)
logger("org.pircbotx", DEBUG)

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
    pattern = "[%d] %p %c{5} %C %m%n"
  }
}


root(WARN, ["CONSOLE"])