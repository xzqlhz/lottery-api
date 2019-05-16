package com.lottery.api.mapper;

import com.lottery.api.bean.MongoPageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: BasicMapper
 * @Description:
 * @Author: 谢中强
 * @CreateDate: 2018/7/5 0005 15:52
 * @Version: 1.0
 */
public class BasicMapper<T> {

    @Autowired
    protected MongoTemplate mongoTemplate;

    /**
     * @Description 根据id查询
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 10:19
     * @Param [id]
     * @Return T
     **/
    public T getById(Object id, Class<T> clazz) {
        return mongoTemplate.findById(id, clazz);
    }

    /**
     * @Description 条件查询
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 10:13
     * @Param [map]
     * @Return T
     **/
    public T getByMap(Map<String, Object> map, Class<T> clazz) {
        Query query = new Query();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
            }
        }
        return mongoTemplate.findOne(query, clazz);
    }

    /**
     * @Description 条件查询列表
     * @Author 谢中强
     * @CreateDate 2018/7/5 0005 16:56
     * @Param [map]
     * @Return java.util.List<T>
     **/
    public List<T> listByMap(Map<String, Object> map, Class<T> clazz) {
        Query query = new Query();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
            }
        }
        return mongoTemplate.find(query, clazz);
    }

    /**
     * @Description 单条插入
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 11:31
     * @Param [obj]
     * @Return void
     **/
    public void saveObject(Object obj) {
        mongoTemplate.insert(obj);
    }

    /**
     * @Description 批量插入
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 11:31
     * @Param [objects]
     * @Return void
     **/
    public void batchSaveObject(List<T> objects) {
        mongoTemplate.insertAll(objects);
    }

    /**
     * @Description 删除单个
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 11:32
     * @Param [clazz, id]
     * @Return void
     **/
    public void deleteObjectById(Object id, Class<T> clazz) {
        mongoTemplate.remove(new Query(Criteria.where("id").is(id)), clazz);
    }

    /**
     * @Description 批量根据id删除
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 11:58
     * @Param [condition, clazz]
     * @Return void
     **/
    public void batchDeleteObjectById(Object[] ids, Class<T> clazz) {
        if (ids == null && ids.length == 0) {
            return;
        }
        Query query = new Query(new Criteria().and("id").in(ids));
        mongoTemplate.remove(query, clazz);
    }

    /**
     * @Description 条件删除
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 11:58
     * @Param [condition, clazz]
     * @Return void
     **/
    public void deleteObjectByCondition(Map<String, Object> condition, Class<T> clazz) {
        Query query = new Query();
        if (condition == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : condition.entrySet()) {
            query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
        }
        mongoTemplate.remove(query, clazz);
    }

    /**
     * @Description 根据id更新
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 11:42
     * @Param [id, map]
     * @Return void
     **/
    public void updateObjectById(Object id, Map<String, Object> map, Class<T> clazz) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        Update update = new Update();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                update.set(entry.getKey(), entry.getValue());
            }
        }
        mongoTemplate.updateFirst(query, update, clazz);
    }

    /**
     * @Description 根据条件更新
     * @Author 谢中强
     * @CreateDate 2018/7/11 0011 11:48
     * @Param [condition, map]
     * @Return void
     **/
    public void updateObjectByCondition(Map<String, Object> condition, Map<String, Object> map, Class<T> clazz) {
        Query query = new Query();
        if (condition == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : condition.entrySet()) {
            query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
        }
        Update update = new Update();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                update.set(entry.getKey(), entry.getValue());
            }
        }
        mongoTemplate.updateMulti(query, update, clazz);
    }

    /**
     * 根据条件查询总数
     * @param condition
     * @param clazz
     * @return
     */
    public Long count(Map<String, Object> condition,Class<T> clazz){
        Query query = new Query();
        if (condition != null) {
            for (Map.Entry<String, Object> entry : condition.entrySet()) {
                query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
            }
        }
        return mongoTemplate.count(query,clazz);
    }

    /**
     * 分页查询
     * @param condition
     * @param pageable
     * @param clazz
     * @return
     */
    public List<T> findByPage(Map<String, Object> condition, MongoPageable pageable, Class<T> clazz){
        Query query = new Query();
        if (condition != null) {
            for (Map.Entry<String, Object> entry : condition.entrySet()) {
                query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
            }
        }
        return mongoTemplate.find(query.with(pageable),clazz);
    }
}
