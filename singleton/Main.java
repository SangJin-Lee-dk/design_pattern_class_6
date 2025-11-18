public class Main {
    public static void main(String[] args) {
        // 각 클래스 로드 (static 블록 실행)
        String id1 = Minsoo.LOGGER_ID;
        String id2 = Jiyeon.LOGGER_ID;
        String id3 = Chulsoo.LOGGER_ID;
        String id4 = Sangjin.LOGGER_ID;
        String id5 = Younghee.LOGGER_ID;
        // Logger 확인
        //Logger logger = Logger.INSTANCE;
        LoggerLazy logger = LoggerLazy.getInstance();
        //LoggerDCL logger = LoggerDCL.getInstance();

        System.out.println("\n=== Logger Info ===");
        System.out.println("Logger ID: " + logger.getId());
        System.out.println("Minsoo ID: " + id1);
        System.out.println("Jiyeon ID: " + id2);
        System.out.println("Chulsoo ID: " + id3);
        System.out.println("Sangjin ID: " + id4);
        System.out.println("Younghee ID: " + id5);
        System.out.println("모두 동일한가? " + (id1.equals(id2) && id2.equals(id3)
        		&& id3.equals(id4) && id4.equals(id5)
        		&& id5.equals(logger.getId()))
        		);

        System.out.println("\n=== Saved Logs ===");
        logger.getLogs().forEach(System.out::println);
    }
}
