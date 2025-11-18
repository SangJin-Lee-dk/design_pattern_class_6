public class Younghee {
    public static final String LOGGER_ID;
    static {
    	//Logger logger = Logger.getInstance(); //테스트하려는 로거만 주석을 풀고 사용
        LoggerLazy logger = LoggerLazy.getInstance();
        //LoggerDCL logger = LoggerDCL.getInstance();
        logger.log("영희: 도서관 도착");
        logger.log("영희: 책 대여");
        logger.log("영희: 독서 시작");
        LOGGER_ID = logger.getId();
    }
}