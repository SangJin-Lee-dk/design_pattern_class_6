// Minsoo.java
public class Minsoo {
    public static final String LOGGER_ID;
    static {
    	//Logger logger = Logger.getInstance(); //테스트하려는 로거만 주석을 풀고 사용
        LoggerLazy logger = LoggerLazy.getInstance();
        //LoggerDCL logger = LoggerDCL.getInstance();
        logger.log("민수: 공부 시작");
        logger.log("민수: 강의 수강 중");
        logger.log("민수: 복습 완료");
        LOGGER_ID = logger.getId();
    }
}