package ma.enset.tp3restapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListArticlesResponse {
    @SerializedName("totalResults")
    private int totalCount;
    @SerializedName("articles")
    private List<Article> articles;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
