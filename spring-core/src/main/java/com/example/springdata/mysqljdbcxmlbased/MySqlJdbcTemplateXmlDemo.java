package com.example.springdata.mysqljdbcxmlbased;

import com.example.springdata.mysqljdbcxmlbased.dao.XmlDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySqlJdbcTemplateXmlDemo {

    // todo - mysql db needs to be setup locally for this to work, refer ref-materials/mysql
    public static void main(String[] args) {

        // note that mysqldb package is added in context
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "mysql-jdbc-component-scan.xml"
        );

        XmlDao dao = context.getBean("jdbcXmlDao", XmlDao.class);
        dao.showOff();
    }

}
