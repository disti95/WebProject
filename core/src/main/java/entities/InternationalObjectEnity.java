package entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Christian Dittrich
 */
@Entity
@Table(name = "INTERNATIONAL_OBJECT")
public class InternationalObjectEnity implements Serializable {

    @ManyToOne(
        targetEntity = ArticleEntity.class,
        optional = false,
        fetch = FetchType.LAZY
    )
    @JoinColumn(
        nullable = false,
        name = "ID"
    )
    private ArticleEntity article;

    @Id
    @Column(name = "UUID")
    private Integer uuid;

    @Column(name = "LANG")
    private String name;

    @Column(name = "FIELD_TYPE")
    private String price;

    @Column(name = "DESCRIPTION")
    private String description;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer id) {
        this.uuid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArticleEntity getArticleEntity() {
        return article;
    }

    public void setArticleEntity(ArticleEntity articleEntity) {
        this.article = articleEntity;
    }
}
