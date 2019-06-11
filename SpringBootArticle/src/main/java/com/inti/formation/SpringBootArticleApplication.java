package com.inti.formation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inti.formation.Service.ArticleService;
import com.inti.formation.entities.Article;

@SpringBootApplication

public class SpringBootArticleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootArticleApplication.class, args);
	}

	@Autowired
	private ArticleService dao ;



	public void run(String... args) throws Exception {


		Date d1 = new Date(2002,04,20);
		Date d2 = new Date(2020,03,23);	
		Date d3 = new Date(2003,02,15);	
		Date d4 = new Date(2120,01,02);	
		Article a1 = new Article(1,"nuuuuuul","cet article est tout pourri","http://jaipasdidée.re",d1);
		Article a2 = new Article(2,"moyen","cet article est un moyen","http://jaipastoutfait.re",d2);
		Article a3 = new Article(3,"mieux","cet article est un peut mieux","http://jaitravaillé.re",d3);
		Article a4 = new Article(4,"génial","cet article est magique","http://trucdeouf.re",d4);
		dao.ajouter(a1); 
		dao.ajouter(a2); 
		dao.ajouter(a3); 
		dao.ajouter(a4);
		
		dao.delete(1);
		
		Article a = dao.findOne(2);
		a.setTitre("peut mieux faire");
		dao.update(a);
		
		List<Article> articles = dao.findAll();
		for (Article art : articles) {
			System.out.println(art);
		}
				

	}

}
