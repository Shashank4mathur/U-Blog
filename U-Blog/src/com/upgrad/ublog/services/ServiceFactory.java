package com.upgrad.ublog.services;

/**
 * TODO: 3.14. Provide a factory method which returns PostServiceImpl object. (Hint: Return type
 *  of this method should be PostService)
 * TODO: 3.15. Provide a factory method which returns UserServiceImpl object. (Hint: Return type
 *  of this method should be UserService)
 */

public class ServiceFactory {

    public com.upgrad.ublog.services.PostService getPostService(){
        return PostServiceImpl.getInstance();
    }

    public com.upgrad.ublog.services.UserService getUserService(){
        return UserServiceImpl.getInstance();
    }
}
