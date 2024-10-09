package az.mvcproject.hexashop.repositories;

import az.mvcproject.hexashop.models.Article;
import az.mvcproject.hexashop.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Long> {
}
