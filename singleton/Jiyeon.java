// Jiyeon.java
public class Jiyeon {
    public static final String LOGGER_ID;
    static {
    	//Logger logger = Logger.getInstance(); //테스트하려는 로거만 주석을 풀고 사용
        LoggerLazy logger = LoggerLazy.getInstance();
        //LoggerDCL logger = LoggerDCL.getInstance();
        logger.log("지연: 과제 작성 시작");
        logger.log("지연: 자료 조사 중");
        logger.log("지연: 제출 완료");
        LOGGER_ID = logger.getId();
    }
}