package ru.yandex.money.common.dbqueue.dao;

import org.junit.BeforeClass;

import ru.yandex.money.common.dbqueue.utils.QueueDatabaseInitializer;

/**
 * @author Oleg Kandaurov
 * @since 12.10.2019
 */
public class DefaultPostgresQueueDaoTest extends PostgresQueueDaoTest {

    @BeforeClass
    public static void beforeClass() {
        QueueDatabaseInitializer.databaseType = QueueDatabaseInitializer.DatabaseType.PG;
        BaseDaoTest.beforeClass();
    }

    public DefaultPostgresQueueDaoTest() {
        super(TableSchemaType.PG_DEFAULT);
    }
}
