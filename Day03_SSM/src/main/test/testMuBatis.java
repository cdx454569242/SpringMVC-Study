import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import project.dao.AccountDao;
import project.domain.Account;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author
 * @create 2020-10-19 20:18
 */
public class testMuBatis {
    @Test
    public void run1() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);
        List<Account> list = dao.findAll();
        for(Account account : list){
            System.out.println(account);
        }
        session.close();
        in.close();
    }

    @Test
    public void run2() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);

        Account account = new Account();
        account.setName("CCC");
        account.setMoney(300D);

        dao.saveAccount(account);

        session.commit();

        session.close();
        in.close();
    }
}
