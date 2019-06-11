package com.inti.formation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.Idao.IArticleDao;
import com.inti.formation.Iservice.IArticleService;
import com.inti.formation.entities.Article;

@Service
public class ArticleService implements IArticleService{

	@Autowired
	IArticleDao dao;
	
	
	public IArticleDao getDao() {
		return dao;
	}

	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}

	public Article ajouter(Article p) {
		return dao.save(p);
	}

	public Article update(Article p) {
		return dao.save(p);
	}

	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

	public Article findOne(Integer id) {
		return dao.getOne(id);
	}

	public List<Article> findAll() {
		return dao.findAll();
	}

}
