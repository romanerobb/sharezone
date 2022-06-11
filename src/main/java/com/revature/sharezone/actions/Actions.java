package com.revature.sharezone.actions;

import com.revature.sharezone.contents.Contents;
import com.revature.sharezone.userprofile.UserProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Table(name = "actions")
public class Actions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userstatus;

    private String usercomment;


    @ManyToOne
    @JoinColumn(name = "contentsid", referencedColumnName = "id")
    private Contents contentsid;


    private Boolean userlike;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private UserProfile username;

    public Actions() {}

    public Actions(int id, String userstatus, String usercomment, Contents contentsid, Boolean userlike, UserProfile username) {
        this.id = id;
        this.userstatus = userstatus;
        this.usercomment = usercomment;
        this.contentsid = contentsid;
        this.userlike = userlike;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    public String getUsercomment() {
        return usercomment;
    }

    public void setUsercomment(String usercomment) {
        this.usercomment = usercomment;
    }

    public Contents getContentsid() {
        return contentsid;
    }

    public void setContentsid(Contents contentsid) {
        this.contentsid = contentsid;
    }

    public Boolean getUserlike() {
        return userlike;
    }

    public void setUserlike(Boolean userlike) {
        this.userlike = userlike;
    }

    public UserProfile getUsername() {
        return username;
    }

    public void setUsername(UserProfile username) {
        this.username = username;
    }
}
