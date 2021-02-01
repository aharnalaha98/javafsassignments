package bean;

public class Product {
	private long pid;
    private String pname;
    private float price;
    public Product()
    {

    }
    public Product(long pid,String pname,float price){
        this.pid=pid;
        this.pname=pname;
        this.price=price;
       
    }
    public long getPid() {
        return pid;
    }
    public void setPid(long pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
