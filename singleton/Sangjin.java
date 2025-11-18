public class Sangjin {
    public static final String LOGGER_ID;
    static {
    	//Logger logger = Logger.getInstance(); //테스트하려는 로거만 주석을 풀고 사용
        LoggerLazy logger = LoggerLazy.getInstance();
        //LoggerDCL logger = LoggerDCL.getInstance();
        logger.log("상진: 자바 싱글턴 학습 시작");
        logger.log("상진: DCL 패턴 코딩 중");
        logger.log("상진: 깃허브 커밋 완료");
        LOGGER_ID = logger.getId();
    }
}