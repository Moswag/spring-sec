package zw.co.cytex.polls.payload;

/**
 * @author : Webster Moswa
 * @since : 1/7/20, Tue
 * email: webstermoswa11@gmail.com
 * mobile: 0771407147
 **/


public class UserSummary {
    private Long id;
    private String username;
    private String name;

    public UserSummary(Long id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
