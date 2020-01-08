package com.merve.springbootexample.entity;

import com.sun.istack.Nullable;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemAddForm {

    @NotEmpty
    //makes use of the @NotNull class' isValid() implementation and additionally
    //checks that the size/length of the supplied object (of course, this varies according to the type of object being validated) is greater than zero.
    @Size(min = 2, max = 50)
    private String itemType;

    @NotNull
    //won't allow null values for the constrained field(s). Even so, the field(s) can be empty.
    private int amount = 1; //default



}
