package db;

public class DbException extends RuntimeException {
    // SerialVersion
    private static final long serialVersionUID = 1L;

    // Msg ERROR
    public DbException(String msg) {
        super(msg);
    }
}
