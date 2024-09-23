package az.mvcproject.hexashop.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private  String photoUrl;
    @Column(nullable = true)
    private int viewCount;
    @ManyToOne()
    private Category category;
}
