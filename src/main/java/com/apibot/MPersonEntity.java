/*
 * Copyright (c) 2017 Komatsu Ltd. All rights reserved.
 */

package src.main.java.com.apibot;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

import lombok.Data;

/**
 * APIマスタ
 */
@Entity
@Table(name = "m_person")
@Data
public class MPersonEntity {

    /** ID */
    @Column(name = "id")
    private Integer id;

    /** NAME */
    @Column(name = "name")
    private String name;

    /** AGE */
    @Column(name = "age")
    private int age;

}
