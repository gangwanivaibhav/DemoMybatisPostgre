package com.mycompany.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
        try{
        	
    	System.out.println("_______________HHHHH_____");
    	String resource = "postgresconfig.xml";
    	InputStream inputStream = Resources.getResourceAsStream(resource);
    	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    	SqlSession session = sqlSessionFactory.openSession();
        System.out.println( "Hello World!" );

        List<User> users = session.selectList("com.mycompany.app.User.getAll");
        System.out.println("After Hello World");
        for(User user:users) System.out.println(user.getName());        	
        }catch(Exception ex){
        	ex.printStackTrace();
        }

    }
}
