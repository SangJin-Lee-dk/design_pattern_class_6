import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LoggerLazy {
    private static LoggerLazy instance;
    
    private final String id = UUID.randomUUID().toString();
    private final List<String> logs = new ArrayList<>();

    private LoggerLazy() { } // private 생성자

    public static LoggerLazy getInstance() {
        if (instance == null) {
            instance = new LoggerLazy();
        }
        return instance;
    }

    public void log(String msg) {
        String logMsg = "[Lazy-LOG] " + msg;
        logs.add(logMsg);
        System.out.println(logMsg);
    }

    public String getId() { return id; }
    public List<String> getLogs() { return logs; }
}