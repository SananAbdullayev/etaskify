package com.example.etaskifyiba.dto;

import com.example.etaskifyiba.model.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String name;
    private String surname;
    private String username;
    private String email;
    private String password;
    private Set<Task> tasks;
}
