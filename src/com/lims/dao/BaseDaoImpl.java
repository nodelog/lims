package com.lims.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.util.CollectionUtils;

import com.lims.common.query.BaseQuery;
import com.lims.common.util.Constants;
import com.lims.common.util.Logger;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T>{
	protected HibernateTemplate hibernate;
	protected Session session;
	protected String hql;
	protected Query query;
	protected StringBuffer stringBuffer;
	protected Class<T> entityClass;
	protected String entityName;
	protected T entity;
	protected Logger logger;
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	@SuppressWarnings("unchecked")
	public void init() {
		entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		entityName = entityClass.getSimpleName();
		entity = null;
		stringBuffer = new StringBuffer();
		hibernate = this.getHibernateTemplate();
		session = this.getSession();
	}
	@Override
	public T findById(int id) {
		init();
		stringBuffer.append("from ");
		stringBuffer.append(entityName);
		stringBuffer.append(" where ");
		stringBuffer.append(" id=? ");
		hql = stringBuffer.toString();
		List<T> objectList = hibernate.find(hql, id);
		if (!CollectionUtils.isEmpty(objectList)) {
			entity = (T) objectList.get(0);
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByName(String name) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		init();
		stringBuffer.append("from ");
		stringBuffer.append(entityName);
		stringBuffer.append(" where ");
		switch (entityName) {
		case Constants.USER_ENTITY_NAME:
			stringBuffer.append(" username=? ");
			break;
		}
		hql = stringBuffer.toString();
		List<T> objectList = hibernate.find(hql, name);
		
		return objectList;
	}

	@Override
	public int save(T entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(T entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T findByQuery(BaseQuery query) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int saveOrUpdate(T entity) {
		// TODO Auto-generated method stub
		return 0;
	}

}
