package com.lims.dao;

import java.util.List;

import com.lims.common.query.BaseQuery;

public interface BaseDao<T> {
	/**
	 * 根据id查找实体
	 * @param id
	 * @return
	 * @throws Exception
	 */
	T findById(int id) throws Exception;
	/**
	 * 根据名字查找实体集合
	 * @param name
	 * @return
	 * @throws Exception
	 */
	List<T> findByName(String name) throws Exception;
	/**
	 * 保存实体
	 * @param entity
	 * @return
	 */
	int save(T entity);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	int update(T entity);
	/**
	 * 保存或者更新实体
	 * @param entity
	 * @return
	 */
	int saveOrUpdate(T entity);
	/**
	 * 根据查询条件查询实体集合
	 * @param query
	 * @return
	 */
	T findByQuery(BaseQuery query);
}
