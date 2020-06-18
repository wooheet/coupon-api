package com.shyun.kr.service.user;

import com.shyun.kr.domain.common.CommonResponseDto;
import com.shyun.kr.domain.user.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

  //회원 가입
  public CommonResponseDto signUp(UserDto userDto);

  //로그인
  public CommonResponseDto signIn(String userId, String password);

  //토큰 유효성 검사
  public boolean verifyToken(String givenToken, String userId);

}