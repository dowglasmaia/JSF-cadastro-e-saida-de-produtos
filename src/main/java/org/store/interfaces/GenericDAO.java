package org.store.interfaces;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<E> extends Serializable {

	void save(E entidade) throws Exception;

	void update(E entidade) throws Exception;

	void remove(E entidade) throws Exception;

	List<E> findAll() throws Exception;

	E findById(Integer id) throws Exception;


}
