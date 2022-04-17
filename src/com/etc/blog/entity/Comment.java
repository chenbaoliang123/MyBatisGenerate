package com.etc.blog.entity;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column w_comment.id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column w_comment.avatar
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column w_comment.content
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column w_comment.creat_time
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    private Date creatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column w_comment.email
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column w_comment.nickname
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column w_comment.blog_id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    private Long blogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column w_comment.parent_comment_id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    private Long parentCommentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column w_comment.id
     *
     * @return the value of w_comment.id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column w_comment.id
     *
     * @param id the value for w_comment.id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column w_comment.avatar
     *
     * @return the value of w_comment.avatar
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column w_comment.avatar
     *
     * @param avatar the value for w_comment.avatar
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column w_comment.content
     *
     * @return the value of w_comment.content
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column w_comment.content
     *
     * @param content the value for w_comment.content
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column w_comment.creat_time
     *
     * @return the value of w_comment.creat_time
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column w_comment.creat_time
     *
     * @param creatTime the value for w_comment.creat_time
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column w_comment.email
     *
     * @return the value of w_comment.email
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column w_comment.email
     *
     * @param email the value for w_comment.email
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column w_comment.nickname
     *
     * @return the value of w_comment.nickname
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column w_comment.nickname
     *
     * @param nickname the value for w_comment.nickname
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column w_comment.blog_id
     *
     * @return the value of w_comment.blog_id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public Long getBlogId() {
        return blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column w_comment.blog_id
     *
     * @param blogId the value for w_comment.blog_id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column w_comment.parent_comment_id
     *
     * @return the value of w_comment.parent_comment_id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public Long getParentCommentId() {
        return parentCommentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column w_comment.parent_comment_id
     *
     * @param parentCommentId the value for w_comment.parent_comment_id
     *
     * @mbg.generated Thu Mar 10 17:07:28 GMT+08:00 2022
     */
    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }
}