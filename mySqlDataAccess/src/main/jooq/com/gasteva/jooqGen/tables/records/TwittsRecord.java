/*
 * This file is generated by jOOQ.
*/
package com.gasteva.jooqGen.tables.records;


import com.gasteva.jooqGen.tables.Twitts;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TwittsRecord extends UpdatableRecordImpl<TwittsRecord> implements Record4<Integer, Timestamp, String, Integer> {

    private static final long serialVersionUID = 1083404707;

    /**
     * Setter for <code>litteltwitter.twitts.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>litteltwitter.twitts.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>litteltwitter.twitts.CreateDate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>litteltwitter.twitts.CreateDate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>litteltwitter.twitts.Text</code>.
     */
    public void setText(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>litteltwitter.twitts.Text</code>.
     */
    public String getText() {
        return (String) get(2);
    }

    /**
     * Setter for <code>litteltwitter.twitts.UserId</code>.
     */
    public void setUserid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>litteltwitter.twitts.UserId</code>.
     */
    public Integer getUserid() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Twitts.TWITTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Twitts.TWITTS.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Twitts.TWITTS.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Twitts.TWITTS.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TwittsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TwittsRecord value2(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TwittsRecord value3(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TwittsRecord value4(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TwittsRecord values(Integer value1, Timestamp value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TwittsRecord
     */
    public TwittsRecord() {
        super(Twitts.TWITTS);
    }

    /**
     * Create a detached, initialised TwittsRecord
     */
    public TwittsRecord(Integer id, Timestamp createdate, String text, Integer userid) {
        super(Twitts.TWITTS);

        set(0, id);
        set(1, createdate);
        set(2, text);
        set(3, userid);
    }
}
