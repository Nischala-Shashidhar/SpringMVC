package com.cts.service;

import java.util.List;

import com.cts.entity.Article;

public interface ArticleService {
	public void addArticle(Article article);

	public List<Article> listArticles();

}
