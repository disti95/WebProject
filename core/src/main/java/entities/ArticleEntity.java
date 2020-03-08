package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  Christian Dittrich
 */
@Entity
@Table(name = "article")
public class ArticleEntity implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @OneToMany(
        mappedBy = "article",
        fetch = FetchType.LAZY,
        cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}
    )
    private List<InternationalObjectEnity> descriptions = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    public List<InternationalObjectEnity> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<InternationalObjectEnity> descriptions) {
        this.descriptions = descriptions;
    }

}
