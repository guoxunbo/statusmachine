package com.newbiest.commom.sm.repository;

import com.newbiest.base.repository.custom.IRepository;
import com.newbiest.commom.sm.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by guoxunbo on 2017/11/5.
 */
@Repository
public interface EventRepository extends IRepository<Event, String> {
}
