package com.apibot.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;

import com.apibot.domain.CustomerEntity;

@Dao
@DomaRepository
public interface CustomerRepository {

    //    @Select
    //    public List<CustomerEntity> findAllOrderById();
    //
    //    @Select
    //    public List<CustomerEntity> findAllOrderById(SelectOptions selectOptions);
    //
    //    @Select
    //    public List<CustomerEntity> findAllOrderByName();

    @Select
    public CustomerEntity findById(Integer id);

    //    @Insert
    //    public Result<CustomerEntity> insert(CustomerEntity customerEntity);
    //
    //    @Update
    //    public Result<CustomerEntity> update(CustomerEntity customerEntity);
    //
    //    @Delete
    //    public Result<CustomerEntity> delete(CustomerEntity customerEntity);
    //
    //    @Delete(sqlFile = true)
    //    public int deleteAll();

}
