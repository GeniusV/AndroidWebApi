package com.geniusver;

import com.geniusver.entities.Student;
import com.geniusver.entities.Teacher;
import com.geniusver.repo.StudentRepository;
import com.geniusver.repo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by GeniusV on 6/13/18.
 */
@Service
public class MyUserService implements UserDetailsService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Long id;
        try {
            id = Long.parseLong(username);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new UsernameNotFoundException("ID \"" + username + "\" is not a number.");
        }

        Optional<Teacher> teacher = teacherRepository.findById(id);
        String password = null;
        if (teacher.isPresent()) {
            password = teacher.get().getPassword();
        } else {
            Optional<Student> student = studentRepository.findById(id);
            if (student.isPresent()) {
                password = student.get().getPassword();
            }
        }

        if (password == null || "".equals(password)) {
            throw new UsernameNotFoundException("Entity \"" + username + "\" not found");
        }

        return new MyUserDetail(username, password);
    }
}
