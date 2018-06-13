package com.geniusver;

import com.geniusver.repo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by GeniusV on 6/13/18.
 */
@Service
public class MyUserService implements UserDetailsService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<Teacher> teacher = teacherRepository.findById(Long.parseLong(username));
////        if (teacher.isPresent()) {
////            return new user
////        }
        return new MyUserDetail(username, "123456");
    }
}
