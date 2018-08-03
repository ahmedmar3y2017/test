package beans;


import Dao.customerDao;
import Entities.customer;
import shared.HibernateUtil;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class customerBean {


    customer customer = new customer();


    @PostConstruct
    public void init() {
        System.out.println("init");

        // init hibernate
        HibernateUtil.getSessionFactory();


    }


    public void saveCustomer() {


        customerDao.Savecustomer(this.customer);


        customer = new customer();

    }

//    ***************** setter and getter  *****************


    public Entities.customer getCustomer() {
        return customer;
    }

    public void setCustomer(Entities.customer customer) {
        this.customer = customer;
    }
}
