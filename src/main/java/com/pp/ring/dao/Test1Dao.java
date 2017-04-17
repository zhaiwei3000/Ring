package com.pp.ring.dao;


import com.pp.ring.model.Test1;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
@Repository(value="test1Dao")
public interface Test1Dao  {

	public List<Test1> selectTest1(Test1 test1);
	
//	public List<Test1> listPagination(Pager<Test1> pager);
	
	public Integer insertTest1(Test1 test1);
	
	
	public Integer updateTest1(Map map);
	

	public Integer deleteTest1(Test1 test1);
	
	

}