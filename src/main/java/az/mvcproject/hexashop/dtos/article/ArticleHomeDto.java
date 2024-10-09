package az.mvcproject.hexashop.dtos.article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleHomeDto {

    private Long id;
    private String title;
    private String description;
    private  String photo_url;
    private Long price;
}
