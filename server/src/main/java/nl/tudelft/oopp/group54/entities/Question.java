package nl.tudelft.oopp.group54.entities;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Questions")
public class Question {
    @EmbeddedId
    private QuestionKey primaryKey;

    @Column(name = "student_id", columnDefinition = "INT NOT NULL")
    @NotNull
    private Integer student_id;

    @Column(name = "content", columnDefinition = "VARCHAR(420) NOT NULL")
    @NotNull
    private String content;

    @Column(name = "vote_counter", columnDefinition = "INT default 0")
    private Integer vote_counter;

    @Column(name = "answered", columnDefinition = "BOOLEAN NOT NULL DEFAULT FALSE")
    @NotNull
    private Boolean answered;


    @Column(name = "created_at", columnDefinition = "TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIME")
    @NotNull
    private Date created_at;


    public Question(){

    }


    /**
     * Create a new Question instance
     * @param primaryKey
     * @param student_id
     * @param content
     * @param vote_counter
     * @param answered
     * @param created_at
     */
    public Question(QuestionKey primaryKey, @NotNull Integer student_id, @NotNull String content, Integer vote_counter, @NotNull Boolean answered, @NotNull Date created_at) {
        this.primaryKey = primaryKey;
        this.student_id = student_id;
        this.content = content;
        this.vote_counter = vote_counter;
        this.answered = answered;
        this.created_at = created_at;
    }

    public QuestionKey getPrimaryKey() {
        return primaryKey;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public String getContent() {
        return content;
    }

    public Integer getVote_counter() {
        return vote_counter;
    }

    public Boolean getAnswered() {
        return answered;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setPrimaryKey(QuestionKey primaryKey) {
        this.primaryKey = primaryKey;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setVote_counter(Integer vote_counter) {
        this.vote_counter = vote_counter;
    }

    public void setAnswered(Boolean answered) {
        this.answered = answered;
    }

    @Override
    public String toString() {
        return "Question{" +
                "primaryKey=" + primaryKey +
                ", student_id=" + student_id +
                ", content='" + content + '\'' +
                ", vote_counter=" + vote_counter +
                ", answered=" + answered +
                ", created_at=" + created_at +
                '}';
    }
}