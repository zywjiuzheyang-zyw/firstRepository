package com.zyw.doudou.user.service;

import com.zyw.doudou.user.bean.UmsMember;
import com.zyw.doudou.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
