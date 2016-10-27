scan("60 seconds")

logger("org.springframework", INFO)
logger("org.springframework.integration", DEBUG)
logger("com.github.blackanthrax", DEBUG)
logger("org.pircbotx", DEBUG)

appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
    pattern = "[%d] %p %c{5} %C %m%n"
  }
}


root(WARN, ["CONSOLE"])