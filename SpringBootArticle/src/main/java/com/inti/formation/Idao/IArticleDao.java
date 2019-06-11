package com.inti.formation.Idao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.Article;

public interface IArticleDao extends JpaRepository<Article, Integer> {

}
