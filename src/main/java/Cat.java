import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = -314159227245434L;
    private String nickname;
    private String breed;

    public String getNickname() {
        return nickname;
    }

    public Cat() {

    }

    public Cat(String nickname, String breed) {
        this.nickname = nickname;
        this.breed = breed;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toSting() {
        return "Cat: " + this.breed + " Nick:" + this.nickname;
    }


}
