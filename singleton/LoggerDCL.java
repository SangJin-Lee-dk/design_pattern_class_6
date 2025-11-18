import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LoggerDCL {
    // volatile: 캐시가 아닌 메인 메모리에서 읽기/쓰기 보장 (가시성 확보)
    private static volatile LoggerDCL INSTANCE;
    
    private final String id = UUID.randomUUID().toString();
    private final List<String> logs = new ArrayList<>();

    private LoggerDCL() { } // private 생성자

    public static LoggerDCL getInstance() {
        if (INSTANCE == null) { // 1차 체크: 락 없이 성능 확보
            synchronized (LoggerDCL.class) { // 락 획득
                if (INSTANCE == null) { // 2차 체크: 중복 생성 방지
                    INSTANCE = new LoggerDCL();
                }
            }
        }
        return INSTANCE;
    }

    public void log(String msg) {
        String logMsg = "[DCL-LOG] " + msg;
        logs.add(logMsg);
        System.out.println(logMsg);
    }

    public String getId() { return id; }
    public List<String> getLogs() { return logs; }
}