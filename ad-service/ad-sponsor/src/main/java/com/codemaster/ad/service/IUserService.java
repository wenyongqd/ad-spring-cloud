package com.codemaster.ad.service;

import com.codemaster.ad.exception.AdException;
import com.codemaster.ad.vo.CreateUserRequest;
import com.codemaster.ad.vo.CreateUserResponse;

public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
