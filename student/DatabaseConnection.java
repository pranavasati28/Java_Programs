package student;

public class DatabaseConnection{ // singletonClass

    private static DatabaseConnection instance = null;

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if(instance == null) instance = new DatabaseConnection();
        return instance;
    }

    public static void connect(){
        System.out.println("Connected to database");
    }
}