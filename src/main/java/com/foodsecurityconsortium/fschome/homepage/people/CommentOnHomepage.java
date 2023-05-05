package com.foodsecurityconsortium.fschome.homepage.people;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CommentOnHomepage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private People people;

    private String comment;

}
