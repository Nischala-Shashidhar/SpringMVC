package com.cts.dao;

import java.util.List;

import com.cts.entity.Article;


public interface ArticleDAO {
	// To Save the article detail
	public void saveArticle (Article Article );
	
	// To get list of all articles
	public List<Article> listArticles();
}

