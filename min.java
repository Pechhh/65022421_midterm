class min {
    public static void main(String[] args) {
        product Po = new product();
        Po.Name = "chair";
        Po.Price = 500.0;
        Po.Products();

        electronics Pq = new electronics();
        Pq.Name = "Television";
        Pq.Price = 20000.0;
        Pq.Brand = "Samsung";
        Pq.Model = "Neo QLED";
        Pq.Electronics();

        Smartphone Pw = new Smartphone();
        Pw.Name = "Iphone";
        Pw.Price = 40000.0;
        Pw.Brand = "Apple";
        Pw.Model = "Iphone 99";
        Pw.Operating = "ios";
        Pw.smartphone();

        book Pa = new book();
        Pa.Name = "OOP Programming";
        Pa.Price = 250.0;
        Pa.Author = "John Doe";
        Pa.Pages = 300;
        Pa.Book();
    }
}

class product {
    public String Name;
    public double Price;
    
    public void Products(){
        System.out.println("Product Name " + this.Name);
        System.out.println("Product Price" + this.Price);
        System.out.println("******************************************");
    }

}

class electronics extends product {
    public String Brand;
    public String Model;
    public String Name;
    public double Price;
    public void Electronics(){
        System.out.println("Product Name" + this.Name);
        System.out.println("Product Price" + this.Price);
        System.out.println("Brand" + this.Brand);
        System.out.println("Model" + this.Model);
        System.out.println("******************************************");
    }
}
class Smartphone extends electronics {
    public String Brand;
    public String Model;
    public String Name;
    public double Price;
    public String Operating;
    public void smartphone(){
        System.out.println("Product Name"+this.Name);
        System.out.println("Product Price"+this.Price);
        System.out.println("Brand" +this.Brand);
        System.out.println("Model"+this.Model);
        System.out.println("Operating System"+this.Operating);
        System.out.println("******************************************");
    }
}

class book extends product {
    public String Author;
    public int Pages;
    public String Name;
    public double Price;
    public void Book(){
        System.out.println("Product Name"+this.Name);
        System.out.println("Product Price"+this.Price);
        System.out.println("Author"+this.Author);
        System.out.println("Number of Pages"+this.Pages);
        System.out.println("******************************************");
    }
}