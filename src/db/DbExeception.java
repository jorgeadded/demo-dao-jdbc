package db;

public class DbExeception  extends RuntimeException{

    private static long serialVersionUID = 1L;

    public DbExeception(String msg){
        super(msg);
    }
}
