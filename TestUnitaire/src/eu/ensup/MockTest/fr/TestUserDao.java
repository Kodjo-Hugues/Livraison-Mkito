package eu.ensup.MockTest.fr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.Fields;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.activation.DataSource;

import org.mockito.runners.MockitoJUnitRunner;

import eu.ensup.MockDao.fr.UserDao;

@RunWith(MockitoJUnitRunner.class)
public class TestUserDao {

    @Mock
    DataSource mockDataSource;
    @Mock
    Connection mockConn;
    @Mock
    PreparedStatement mockPreparedStmnt;
    @Mock
    ResultSet mockResultSet;
    int userId = 100;

    public void TestUserDAO() {
    }

//    @BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    @Before
//    public void setUp() throws SQLException {
//        when(((Statement) mockDataSource).getConnection()).thenReturn(mockConn);
//      //  when(((Object) mockDataSource).getConnection(anyString(), anyString())).thenReturn(mockConn);
//        doNothing().when(mockConn).commit();
//        when(mockConn.prepareStatement(anyString(), anyInt())).thenReturn(mockPreparedStmnt);
//        doNothing().when(mockPreparedStmnt).setString(anyInt(), anyString());
//        when(mockPreparedStmnt.execute()).thenReturn(Boolean.TRUE);
//        when(mockPreparedStmnt.getGeneratedKeys()).thenReturn(mockResultSet);
//        when(mockResultSet.next()).thenReturn(Boolean.TRUE, Boolean.FALSE);
//      //  when(mockResultSet.getInt(Fields.GENERATED_KEYS)).thenReturn(userId);
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    @Test
//    public void testCreateWithNoExceptions() throws SQLException {
//
//        UserDao instance = new UserDao();
//        instance.create(new UserDao());
//
//        //verify and assert
//        verify(mockConn, times(1)).prepareStatement(anyString(), anyInt());
//        verify(mockPreparedStmnt, times(6)).setString(anyInt(), anyString());
//        verify(mockPreparedStmnt, times(1)).execute();
//        verify(mockConn, times(1)).commit();
//        verify(mockResultSet, times(2)).next();
//      //  verify(mockResultSet, times(1)).getInt(Fields.GENERATED_KEYS);
//    }
//
//    @Test(expected = SQLException.class)
//    public void testCreateWithPreparedStmntException() throws SQLException {
//
//         //mock
//         when(mockConn.prepareStatement(anyString(), anyInt())).thenThrow(new SQLException());
//
//
//        UserDao instance = new UserDao();
//		instance.create(new UserDao());
//
//    }
    @Test
    public void test1()  {
            //  create mock
            UserDao test = mock(UserDao.class);
            

            
            // define return value for method getUniqueId()
            when(test.create()).thenReturn(true);

            // use mock in test....
            assertTrue( test.create());
    }
    
    public void test2 (){
    	boolean b = true;
    //  create mock
        UserDao test = mock(UserDao.class);
    	
     // define return value for method getUniqueId()
        when(test.LireEnBaase()).thenReturn(true);
        
        assertEquals(false, test.LireEnBaase());
    }

    public void test3 (){
    	
    	
    //  create mock
        UserDao test = mock(UserDao.class);
    	
     // define return value for method getUniqueId()
        when(test.supprimerEnbase()).thenReturn(true);
        
        assertEquals(false, test.supprimerEnbase());
    	
    } 
}
