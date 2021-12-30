package com.toystory.andy.service.system.menu;

import com.toystory.andy.domain.system.menu.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> findAll();

    Menu findById(Long id);

    void save(Menu menu);

    void update(Menu menu);

    void deleteById(Long id);

    void deleteAll();
}
