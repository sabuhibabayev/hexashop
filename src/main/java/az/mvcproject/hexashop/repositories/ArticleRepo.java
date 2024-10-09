package az.mvcproject.hexashop.repositories;

import az.mvcproject.hexashop.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepo extends JpaRepository<Article,Long> {
}
