/*
 * Copyright (c) 2017 Komatsu Ltd. All rights reserved.
 */

package com.apibot;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 * MPersonEntityDao
 */
@ConfigAutowireable
@Dao
public interface MPersonEntityDao {

    /**
     * @param apiPublishSettingId apiPublishSettingId
     * @return the MApiPublishSettingEntity entity
     */
    @Select
    MApiPersonEntity selectById(Long id);

}
