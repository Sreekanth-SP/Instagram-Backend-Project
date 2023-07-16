package com.geekster.InstaBackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PostId;
    private String postContent;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY) // hide this in json but not in database table column
    private LocalDateTime postCreatedTimeStamp;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDateTime postUpdatedTimeStamp;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JoinColumn(name = "fk_post_user_id")
    private User postOwner;
}
