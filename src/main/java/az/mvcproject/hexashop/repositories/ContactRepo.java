package az.mvcproject.hexashop.repositories;

import az.mvcproject.hexashop.models.Article;
import az.mvcproject.hexashop.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact,Long> {
}
