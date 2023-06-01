package singleton.imptwo;

public class Database {
    private static final Database instance = new Database(null, null);

    private Database(String url, String hostname) {}

    public static Database getInstance() {
        return instance;
    }
}
