package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "likes")

@NamedQueries({
    @NamedQuery(
        name = "getTheLikesCount",
        query = "SELECT COUNT(l) FROM Like AS l WHERE l.user_id=:user_id and l.report_id=:report_id"
    ),
    @NamedQuery(
        name = "getLikesCount",
        query = "SELECT COUNT(l) FROM Like AS l WHERE l.report_id=:report_id"
    )
})

@Entity
public class Like {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer user_id;

    @Column(name = "report_id")
    private Integer report_id;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
    public Integer getReport_id() {
        return report_id;
    }

    public void setReport_id(Integer report_id) {
        this.report_id = report_id;
    }}


