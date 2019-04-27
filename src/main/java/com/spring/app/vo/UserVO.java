package com.spring.app.vo;

import org.apache.catalina.User;

import java.util.List;

public class UserVO {
    public UserVO() {
    }

    private String userId;
    private String userName;
    private String userEmail;
    private String userContact;
    private List<User> userIds;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    public List<User> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<User> userIds) {
        this.userIds = userIds;
    }

	public UserVO(String userId, String userName, String userEmail, String userContact, List<User> userIds) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userIds = userIds;
	}
}
