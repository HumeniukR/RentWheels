package com.humeniuk.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by humeniuk on 20.11.2016.
 */
@Entity
@Table(name = "comment", schema = "", catalog = "on_wheels_db")
public class Comment {
    private int idComment;
    private int idAuthor;
    private String commentText;
    private Date date;
    private int rating;

    @Id
    @Column(name = "id_comment", nullable = false, insertable = true, updatable = true)
    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    @Basic
    @Column(name = "id_author", nullable = false, insertable = true, updatable = true)
    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Basic
    @Column(name = "comment_text", nullable = true, insertable = true, updatable = true, length = 65535)
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Basic
    @Column(name = "date", nullable = false, insertable = true, updatable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "rating", nullable = false, insertable = true, updatable = true)
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment that = (Comment) o;

        if (idAuthor != that.idAuthor) return false;
        if (idComment != that.idComment) return false;
        if (rating != that.rating) return false;
        if (commentText != null ? !commentText.equals(that.commentText) : that.commentText != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComment;
        result = 31 * result + idAuthor;
        result = 31 * result + (commentText != null ? commentText.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + rating;
        return result;
    }
}
