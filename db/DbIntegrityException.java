package db;

import java.io.Serial;

public class DbIntegrityException extends RuntimeException {

    // SerialVersion
    @Serial
    private static final long serialVersionUID = 1L;

    // Msg ERROR
    public DbIntegrityException(String msg) {
        super(msg);
    }
}
