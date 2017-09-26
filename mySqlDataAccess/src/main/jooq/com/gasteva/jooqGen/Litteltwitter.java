/*
 * This file is generated by jOOQ.
*/
package com.gasteva.jooqGen;


import com.gasteva.jooqGen.tables.Following;
import com.gasteva.jooqGen.tables.Twitts;
import com.gasteva.jooqGen.tables.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Litteltwitter extends SchemaImpl {

    private static final long serialVersionUID = -1294180426;

    /**
     * The reference instance of <code>litteltwitter</code>
     */
    public static final Litteltwitter LITTELTWITTER = new Litteltwitter();

    /**
     * The table <code>litteltwitter.following</code>.
     */
    public final Following FOLLOWING = com.gasteva.jooqGen.tables.Following.FOLLOWING;

    /**
     * The table <code>litteltwitter.twitts</code>.
     */
    public final Twitts TWITTS = com.gasteva.jooqGen.tables.Twitts.TWITTS;

    /**
     * The table <code>litteltwitter.users</code>.
     */
    public final Users USERS = com.gasteva.jooqGen.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private Litteltwitter() {
        super("litteltwitter", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Following.FOLLOWING,
            Twitts.TWITTS,
            Users.USERS);
    }
}
