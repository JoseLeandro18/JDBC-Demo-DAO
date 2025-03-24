package db;

import java.io.Serial;

public class DbException extends RuntimeException {

    // SerialVersion
    @Serial
    private static final long serialVersionUID = 1L;

    // Msg ERROR
    public DbException(String msg) {
        super(msg);
    }
}
