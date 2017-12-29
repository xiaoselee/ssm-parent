package cn.je.index.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


public interface IndexDao {
	//@Select("select count(1) from user")
	List<String> getString();

}
