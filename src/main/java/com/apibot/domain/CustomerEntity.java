package com.apibot.domain;

import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.jdbc.entity.NamingType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * 顧客Entity
 */
@Entity(naming = NamingType.LOWER_CASE, immutable = true)
@Table(name = "m_customer")
@EqualsAndHashCode
@ToString(includeFieldNames = false)
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequence = "id")
    @Getter
    private final Integer id;

    @Getter
    private final String lastName;

    @Getter
    private final String firstName;

    public CustomerEntity(String lastName, String firstName) {
        // DBの自動採番を使うためにnullを設定
        id = null;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public CustomerEntity(Integer id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
