/*
 * This file is generated by jOOQ.
*/
package com.gasteva.jooqGen.tables.records;


import com.gasteva.jooqGen.tables.Following;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class FollowingRecord extends TableRecordImpl<FollowingRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = -1462900467;

    /**
     * Setter for <code>litteltwitter.following.OriginID</code>.
     */
    public void setOriginid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>litteltwitter.following.OriginID</code>.
     */
    public Integer getOriginid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>litteltwitter.following.FollowID</code>.
     */
    public void setFollowid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>litteltwitter.following.FollowID</code>.
     */
    public Integer getFollowid() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Following.FOLLOWING.ORIGINID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Following.FOLLOWING.FOLLOWID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOriginid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFollowid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FollowingRecord value1(Integer value) {
        setOriginid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FollowingRecord value2(Integer value) {
        setFollowid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FollowingRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FollowingRecord
     */
    public FollowingRecord() {
        super(Following.FOLLOWING);
    }

    /**
     * Create a detached, initialised FollowingRecord
     */
    public FollowingRecord(Integer originid, Integer followid) {
        super(Following.FOLLOWING);

        set(0, originid);
        set(1, followid);
    }
}