@test
public void addAppenderWithoutStream() {
    logger.addAppender(new ConsoleAppender(
        new PatternLayout ("%p %t %m%n")));
        logger.info("addAppenderWithoutStream");
    }
}