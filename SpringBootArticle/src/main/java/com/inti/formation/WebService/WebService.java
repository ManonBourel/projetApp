package com.inti.formation.WebService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.Idao.IArticleDao;
import com.inti.formation.Iservice.IArticleService;
import com.inti.formation.entities.Article;

@RestController
@RequestMapping("/apiArticle")
public class WebService {
	
	@Autowired
	IArticleService service;

	
	public IArticleService getService() {
		return service;
	}

	public void setService(IArticleService service) {
		this.service = service;
	}


	@RequestMapping(value="/articles",method=RequestMethod.GET)
	public List<Article> findAll(){
		return service.findAll();
	}
	
	@RequestMapping(value="/article/{id}",method=RequestMethod.GET )
	public Article findOne(@PathVariable("id") Integer id){
		return service.findOne(id);	
	}

	@RequestMapping(value="/deleteA/{id}",method=RequestMethod.DELETE )
	public void delete (@PathVariable("id") int id){
		service.delete(id);	
	}
	
	@RequestMapping(value="/ajouterA",method=RequestMethod.POST )
// @requestMapping correspond à l'uri
	public Article ajouter(@RequestBody Article p) {
		return service.ajouter(p);
	}
	
	@RequestMapping(value="/updateA",method=RequestMethod.PUT )
	// @requestMapping correspond à l'uri
		public Article update(@RequestBody Article p) {
			return service.update(p);
		}
	
	

}
