package com.project.web.user;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/users")
public class UserController {
}