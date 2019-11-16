import com.rcnjtech.entity.Student;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;


import javax.persistence.metamodel.EntityType;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Lu Yuesheng
 * @data 2019/11/12 0012下午 23:02
 **/
public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction transaction=session.beginTransaction();
        try {
//            1.添加操作
            session.save(com.rcnjtech.entity.method.save(1,"lll","男",new Date()));
//            2.根据id查找数据
//            Student student=session.get(Student.class,1);
//            System.out.println(student);
//            3.修改数据
//            Student student=session.get(Student.class,1);
//            student.setNAME("lalal");
//            session.update(student);
//            4.删除操作
//            Student student=session.get(Student.class,1);
//            session.delete(student);
//            5.Query对象查询所有记录
//              Query query=session.createQuery("from Student ");
//              List<Student> list = query.list();
//              for (Student student:list) {
//                System.out.println(student);
//            }
//            6.Criteria对象查询所有记录
//            Criteria criteria=session.createCriteria(Student.class);
//            List<Student> list = criteria.list();
//            for (Student student :list
//                    ) {
//                System.out.println(student);
//            }
//            7.SQLQuery对象查询所有记录
//            SQLQuery sqlQuery=session.createSQLQuery("select * from s_student");
//            List<Object[]> list=sqlQuery.list();
//            for (Object[] objects:list
//                 ) {
//                System.out.println(Arrays.toString(objects));
//            }
            transaction.commit();
            }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            ourSessionFactory.close();
        }
    }
}