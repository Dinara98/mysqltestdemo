package kz.qazkitap.lessons.mysqltestdemo.repositories;

import kz.qazkitap.lessons.mysqltestdemo.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
