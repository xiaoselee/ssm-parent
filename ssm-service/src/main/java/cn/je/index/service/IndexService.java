package cn.je.index.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

import cn.je.index.dao.IndexDao;

@Service
public class IndexService {
	
	@Resource
	IndexDao indexDao;
	
	public String heloo() {
		return "hello-23";
	}
	
	private String hello() {
		return "hello-24";

	}

	public String hel() {
		// TODO 自动生成的方法存根
		PageHelper.startPage(1, 10);
		return indexDao.getString().get(0)+"33334666?";

	}

}
