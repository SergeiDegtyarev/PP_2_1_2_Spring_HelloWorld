import  java.io.Serializable;
public class Cat implements Serializable {

    private String name;

    public Cat() {

    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
