package com.lims.dao;

import java.util.List;

import com.lims.common.query.BaseQuery;

public interface BaseDao<T> {
	T findById(int id) throws Exception;
	List<T> findByName(String name) throws Exception;
	int save(T entity);
	int update(T entity);
	T findByQuery(BaseQuery query);
}
