package ru.test.webapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    @Pattern(regexp = "[A-Za-zА-Яа-яЁё]*")
    @Size(max = 20)
    private String name;

    @NotEmpty
    @Pattern(regexp = "[A-Za-zА-Яа-яЁё]*")
    @Size(max = 20)
    private String surname;
}
