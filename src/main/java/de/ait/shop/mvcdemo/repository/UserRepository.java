package de.ait.shop.mvcdemo.repository;

import de.ait.shop.mvcdemo.model.User;

public interface UserRepository extends CrudRepository<User> {
    User findByEmail(String email);
}
