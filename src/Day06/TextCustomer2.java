package Day06;

public class TextCustomer2 {

    public static void main(String[] args) {
        CustomerBiz customerBiz=new CustomerBiz();
        Customer customer=new Customer();
        customerBiz.addCustomer(customer);
        customerBiz.showCustomers();

    }
}
