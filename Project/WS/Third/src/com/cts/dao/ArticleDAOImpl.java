package com.cts.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.Article;

@Repository("articleDao")
public class ArticleDAOImpl implements ArticleDAO {

	@Autowired
	private SessionFactory sessionFactory;

	// To Save the article detail
	public void saveArticle(Article article) {
		article.setAddedDate(new Date());
		sessionFactory.getCurrentSession().saveOrUpdate(article);
	}

	// To get list of all articles
	@SuppressWarnings("unchecked")
	public List<Article> listArticles() {
		return (List<Article>) sessionFactory.getCurrentSession()
				.createCriteria(Article.class).list();
	}
}
