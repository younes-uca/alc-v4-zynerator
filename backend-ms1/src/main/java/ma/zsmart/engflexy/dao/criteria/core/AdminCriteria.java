package  ma.zsmart.engflexy.dao.criteria.core;


import ma.zsmart.engflexy.zynerator.criteria.BaseCriteria;
import java.util.List;

public class AdminCriteria extends  BaseCriteria  {

    private String description;
    private String descriptionLike;



    public AdminCriteria(){}

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }


}
