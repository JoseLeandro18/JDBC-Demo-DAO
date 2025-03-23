package db;

public class DbIntegrityException extends RuntimeException {
    // SerialVersion
    private static final long serialVersionUID = 1L;

    // Msg ERROR
    public DbIntegrityException(String msg) {
        super(msg);
    }
}
