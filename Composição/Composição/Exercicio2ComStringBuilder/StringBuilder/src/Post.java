import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Coment> listComent = new ArrayList<>();

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Coment> getListComent() {
        return listComent;
    }

    public void addList(Coment coment) {
        listComent.add(coment);
    }

    public void removeList(Coment coment) {
        if (coment != null) {
            removeList(coment);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(title + "\n" +
                likes + " Likes - " + moment + "\n" +
                content + "\n" +
                "Coments:" + "\n");
        for (Coment c : listComent) {
            sb.append(c.getText() + "\n");
        }

        return sb.toString();
    }
}
